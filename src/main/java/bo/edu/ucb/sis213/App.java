package bo.edu.ucb.sis213;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {
    private static int usuarioId;
    private static double saldo;
    private static int pinActual;

    private static final String HOST = "127.0.0.1";
    private static final int PORT = 3306;
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    private static final String DATABASE = "atm";

    public static Connection getConnection() throws SQLException {
        String jdbcUrl = String.format("jdbc:mysql://%s:%d/%s", HOST, PORT, DATABASE);
        try {
            // Asegúrate de tener el driver de MySQL agregado en tu proyecto
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL Driver not found.", e);
        }

        return DriverManager.getConnection(jdbcUrl, USER, PASSWORD);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        System.out.println("Bienvenido al Cajero Automático.");

        Connection connection = null;
        try {
            connection = getConnection(); // Reemplaza esto con tu conexión real
        } catch (SQLException ex) {
            System.err.println("No se puede conectar a Base de Datos");
            ex.printStackTrace();
            System.exit(1);
        }
        

        while (intentos > 0) {
            System.out.print("Ingrese su PIN de 4 dígitos: ");
            int pinIngresado = scanner.nextInt();
            if (validarPIN(connection, pinIngresado)) {
                pinActual = pinIngresado;
                mostrarMenu();
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("PIN incorrecto. Le quedan " + intentos + " intentos.");
                } else {
                    System.out.println("PIN incorrecto. Ha excedido el número de intentos.");
                    System.exit(0);
                }
            }
        }
    }

    public static boolean validarPIN(Connection connection, int pin) {
        String query = "SELECT id, saldo FROM usuarios WHERE pin = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, pin);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                usuarioId = resultSet.getInt("id");
                saldo = resultSet.getDouble("saldo");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Realizar un depósito.");
            System.out.println("3. Realizar un retiro.");
            System.out.println("4. Cambiar PIN.");
            System.out.println("5. Salir.");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarRetiro();
                    break;
                case 4:
                    cambiarPIN();
                    break;
                case 5:
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    public static void consultarSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }

    public static void realizarDeposito() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a depositar: $");
        double cantidad = scanner.nextDouble();
    
        if (cantidad <= 0) {
            System.out.println("Cantidad no válida.");
        } else {
            try {
                Connection connection = getConnection();
                //System.out.println("Conexión a la base de datos establecida correctamente.");

                // Insertar en la tabla de historico
                String historicoQuery = "INSERT INTO historico (usuario_id, tipo_operacion, cantidad) VALUES (?, ?, ?)";
                PreparedStatement historicoStatement = connection.prepareStatement(historicoQuery);
                historicoStatement.setInt(1, usuarioId);
                historicoStatement.setString(2, "deposito");
                historicoStatement.setDouble(3, cantidad);
                historicoStatement.executeUpdate();
    
                // Actualizar el saldo en la tabla usuarios
                String actualizarSaldoQuery = "UPDATE usuarios SET saldo = saldo + ? WHERE id = ?";
                PreparedStatement actualizarSaldoStatement = connection.prepareStatement(actualizarSaldoQuery);
                actualizarSaldoStatement.setDouble(1, cantidad);
                actualizarSaldoStatement.setInt(2, usuarioId);
                actualizarSaldoStatement.executeUpdate();
    
                // Confirmar y cerrar la conexión
                //connection.commit();
                connection.close();
    
                saldo += cantidad;
                System.out.println("Depósito realizado con éxito. Su nuevo saldo es: $" + saldo);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al realizar el depósito.");
            }
        }
    }
    

    public static void realizarRetiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a retirar: $");
        double cantidad = scanner.nextDouble();
    
        if (cantidad <= 0) {
            System.out.println("Cantidad no válida.");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            try {
                Connection connection = getConnection();
       
                // Insertar en la tabla de historico
                String historicoQuery = "INSERT INTO historico (usuario_id, tipo_operacion, cantidad) VALUES (?, ?, ?)";
                PreparedStatement historicoStatement = connection.prepareStatement(historicoQuery);
                historicoStatement.setInt(1, usuarioId);
                historicoStatement.setString(2, "retiro");
                historicoStatement.setDouble(3, cantidad);
                historicoStatement.executeUpdate();
    
                // Actualizar el saldo en la tabla usuarios
                String actualizarSaldoQuery = "UPDATE usuarios SET saldo = saldo - ? WHERE id = ?";
                PreparedStatement actualizarSaldoStatement = connection.prepareStatement(actualizarSaldoQuery);
                actualizarSaldoStatement.setDouble(1, cantidad);
                actualizarSaldoStatement.setInt(2, usuarioId);
                actualizarSaldoStatement.executeUpdate();
    
                // Cerrar la conexión
                connection.close();
    
                saldo -= cantidad;
                System.out.println("Retiro realizado con éxito. Su nuevo saldo es: $" + saldo);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al realizar el retiro.");
            }
        }
    }
    

    public static void cambiarPIN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su PIN actual: ");
        int pinIngresado = scanner.nextInt();
    
        if (pinIngresado == pinActual) {
            try {
                Connection connection = getConnection();
    
                System.out.print("Ingrese su nuevo PIN: ");
                int nuevoPin = scanner.nextInt();
                System.out.print("Confirme su nuevo PIN: ");
                int confirmacionPin = scanner.nextInt();
    
                if (nuevoPin == confirmacionPin) {
                    // Actualizar el PIN en la tabla usuarios
                    String actualizarPinQuery = "UPDATE usuarios SET pin = ? WHERE id = ?";
                    PreparedStatement actualizarPinStatement = connection.prepareStatement(actualizarPinQuery);
                    actualizarPinStatement.setInt(1, nuevoPin);
                    actualizarPinStatement.setInt(2, usuarioId);
                    actualizarPinStatement.executeUpdate();
    
                    // Cerrar la conexión
                    connection.close();
    
                    pinActual = nuevoPin;
                    System.out.println("PIN actualizado con éxito.");
                } else {
                    System.out.println("Los PINs no coinciden.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al cambiar el PIN.");
            }
        } else {
            System.out.println("PIN incorrecto.");
        }
    }    
}
