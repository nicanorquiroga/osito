/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.atm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
//import static java.util.Collections.list;
import java.util.List;
//import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//import my.atm.Customer_Data;

/**
 *
 * @author HP
 */
public class ADMIN extends javax.swing.JFrame {

    ATM l;

    /**
     * Creates new form ADMIN
     */
    public ADMIN(ATM data) {
        this.user = new ArrayList<Customer_Data>();
        l = data;
        initComponents();
    }

    List<Customer_Data> user;

    public void updateAccount() {

        String s00 = "", s0 = "";
        s0 = JOptionPane.showInputDialog("\tSelect Option for update Account\n1- Account Number\n2-Holder Name\n3-Account Type  ", s00);
        switch (s0) {
            case "1":
                updateAccountNo();
                break;
            case "2":
                updateAccountName();
                break;
            case "3":
                updateAccountType();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option ", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public void updateAccountName() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Name u want to Update ", s2);
        boolean found = false;
        //this.user=l.user1;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.name.equals(s1)) {

                rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                int a = JOptionPane.showConfirmDialog(null, "You want to update this account  ", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (a == 0) {
                    rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                        var.login, var.startingBalance, var.status, var.type, var.date};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    String[] s0 = {"Current", "Savings"};
                    String[] s01 = {"Active", "Deactive"};
                    String s = "";
                    String ab = "";
                    var.login1 = JOptionPane.showInputDialog("Enter User Login", ab);
                    if (var.login1.equals("")) {
                        var.login = var.login;

                    } else {
                        var.login = var.login1;
                    }
                    do {
                        var.name1 = JOptionPane.showInputDialog("Enter Name", s);
                        if (var.name1.equals("")) {
                            var.name = var.name;
                            break;
                        }
                        if (var.name1.matches("[a-zA-Z]+")) {
                            var.name = var.name1;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Enter invalid name ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!var.name1.matches("[a-zA-Z]+"));
                    String s11 = "";

                    do {
                        var.pincode1 = JOptionPane.showInputDialog("Enter 5 digit PinCode", s11);
                        if (var.pincode1.matches("[0-9]{5}")) {
                            var.pincode = var.pincode1;
                            break;
                        }
                        if (var.pincode1.equals("")) {
                            var.pincode = var.pincode;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Please Enter 5 digit pincode ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }

                    } while (!var.pincode1.matches("[0-9]{5}"));
                    var.status = (String) JOptionPane.showInputDialog(null, "Select Status...", "Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
                    var.type = (String) JOptionPane.showInputDialog(null, "Select Type...", "Type", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
                    // user.add(var);
                    JOptionPane.showMessageDialog(null, "Account Successfully Updated... ", "Account Information", JOptionPane.PLAIN_MESSAGE);
                    String[] columnss = new String[]{"Account Number", "Name", "Pincode",
                        "User Login", "Balance", "Status", "Type", "Date"};
                    Object[][] rowss = new Object[1][columnss.length];
                    rowss[0] = new Object[]{var.accountNum, var.name, var.pincode,
                        var.login, var.startingBalance, var.status, var.type, var.date};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rowss, columnss)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                } else if (a == 1) {
                    JOptionPane.showMessageDialog(null, "Account Not updated", "Account information", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                }
            }

        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Account not found");
        }
    }

    public void updateAccountType() {
        String[] s10 = {"Current", "Savings", ""};
        s10[2] = (String) JOptionPane.showInputDialog(null, "Select Type...", "Account Type", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.type.equals(s10[2])) {

                rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                int a = JOptionPane.showConfirmDialog(null, "You want to update this account  ", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (a == 0) {
                    rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                        var.login, var.startingBalance, var.status, var.type, var.date};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    String[] s0 = {"Current", "Savings"};
                    String[] s01 = {"Active", "Deactive"};
                    String s = "";
                    String ab = "";
                    var.login1 = JOptionPane.showInputDialog("Enter User Login", ab);
                    if (var.login1.equals("")) {
                        var.login = var.login;

                    } else {
                        var.login = var.login1;
                    }
                    do {
                        var.name1 = JOptionPane.showInputDialog("Enter Name", s);
                        if (var.name1.equals("")) {
                            var.name = var.name;
                            break;
                        }
                        if (var.name1.matches("[a-zA-Z]+")) {
                            var.name = var.name1;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Enter invalid name ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!var.name1.matches("[a-zA-Z]+"));
                    String s11 = "";

                    do {
                        var.pincode1 = JOptionPane.showInputDialog("Enter 5 digit PinCode", s11);
                        if (var.pincode1.matches("[0-9]{5}")) {
                            var.pincode = var.pincode1;
                            break;
                        }
                        if (var.pincode1.equals("")) {
                            var.pincode = var.pincode;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Please Enter 5 digit pincode ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                        }

                    } while (!var.pincode1.matches("[0-9]{5}"));
                    var.status = (String) JOptionPane.showInputDialog(null, "Select Status...", "Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
                    var.type = (String) JOptionPane.showInputDialog(null, "Select Type...", "Type", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
                    // user.add(var);
                    JOptionPane.showMessageDialog(null, "Account Successfully Updated... ", "Account Information", JOptionPane.PLAIN_MESSAGE);
                    String[] columnss = new String[]{"Account Number", "Name", "Pincode",
                        "User Login", "Balance", "Status", "Type", "Date"};
                    Object[][] rowss = new Object[1][columnss.length];
                    rowss[0] = new Object[]{var.accountNum, var.name, var.pincode,
                        var.login, var.startingBalance, var.status, var.type, var.date};
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rowss, columnss)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                } else if (a == 1) {
                    JOptionPane.showMessageDialog(null, "Account Not updated", "Account information", JOptionPane.PLAIN_MESSAGE);
                    JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                    found = true;
                }
            }

        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Account not found");
        }
    }

    public void updateAccountNo() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Number u want to Update ", s2);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.accountNum == Integer.parseInt(s1)) {
                rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
                String[] s0 = {"Current", "Savings"};
                String[] s01 = {"Active", "Deactive"};
                String s = "";
                String ab = "";
                var.login1 = JOptionPane.showInputDialog("Enter User Login", ab);
                if (var.login1.equals("")) {
                    var.login = var.login;

                } else {
                    var.login = var.login1;
                }
                do {
                    var.name1 = JOptionPane.showInputDialog("Enter Name", s);
                    if (var.name1.equals("")) {
                        var.name = var.name;
                        break;
                    }
                    if (var.name1.matches("[a-zA-Z]+")) {
                        var.name = var.name1;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Enter invalid name ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                    }
                } while (!var.name1.matches("[a-zA-Z]+"));
                String s11 = "";

                do {
                    var.pincode1 = JOptionPane.showInputDialog("Enter 5 digit PinCode", s11);
                    if (var.pincode1.matches("[0-9]{5}")) {
                        var.pincode = var.pincode1;
                        break;
                    }
                    if (var.pincode1.equals("")) {
                        var.pincode = var.pincode;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter 5 digit pincode ", "Invalid input", JOptionPane.ERROR_MESSAGE);
                    }

                } while (!var.pincode1.matches("[0-9]{5}"));
                var.status = (String) JOptionPane.showInputDialog(null, "Select Status...", "Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
                var.type = (String) JOptionPane.showInputDialog(null, "Select Type...", "Type", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
                // user.add(var);
                JOptionPane.showMessageDialog(null, "Account Successfully Updated... ", "Account Information", JOptionPane.PLAIN_MESSAGE);
                String[] columnss = new String[]{"Account Number", "Name", "Pincode",
                    "User Login", "Balance", "Status", "Type", "Date"};
                Object[][] rowss = new Object[1][columnss.length];
                rowss[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rowss, columnss)), "Account information", JOptionPane.PLAIN_MESSAGE);
                found = true;
            }
        }
//        if (found) {
//            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
//        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Account not found");
        }
    }

    public void deleteAccount() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Number u want to Delete ", s2);
        boolean found = false;
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.accountNum == Integer.parseInt(s1)) {
                //JOptionPane.showMessageDialog(null, "You wish to delete the account held by Mr " + var.name, "sad", JOptionPane.PLAIN_MESSAGE);
                int ab = JOptionPane.showConfirmDialog(null, "You wish to delete the account held by Mr " + var.name, "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                // 0=yes ; 1=no
                if (ab == 0) {
                    String a1 = "", a2 = "";
                    a1 = JOptionPane.showInputDialog("Please re-enter account number ", a2);
                    if (a1.equals(s1)) {
                        user.remove(i);
                        JOptionPane.showMessageDialog(null, "Account Deleted Successfully..", "Delete Account", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Account Number", "Error ", JOptionPane.ERROR_MESSAGE);

                    }
                } else if (ab == 1) {
                    JOptionPane.showMessageDialog(null, "Account not deleted ", "Account Information ", JOptionPane.INFORMATION_MESSAGE);

                }

                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }

    public void search1() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Holder name u want to find ", s2);
        boolean found = false;
        StringBuilder builder1 = new StringBuilder();
        builder1.append("Account No");
        builder1.append("\t");
        builder1.append("Name");
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.name.equals(s1)) {
//                JLabel label = new JLabel("<html><pre>" + sb.toString());
                JOptionPane.showMessageDialog(null, builder1, "sad", JOptionPane.PLAIN_MESSAGE);
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Fount");
        }
    }

    public void searchAccountType() {
        String[] s10 = {"Current", "Savings", ""};
        s10[2] = (String) JOptionPane.showInputDialog(null, "Select Type...", "Account Type", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.type.equals(s10[2])) {
                rows[i] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Fount");
        }
    }

    public void searchAccountBalance() {
        String s111 = "",
                s112 = "";
        s111 = JOptionPane.showInputDialog("Enter Account Balance u want to find ", s112);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.startingBalance == Integer.parseInt(s111)) {
                rows[i] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Fount");
        }
    }

    public void searchAccountName() {
        String s11 = "",
                s12 = "";

        s11 = JOptionPane.showInputDialog("Enter Account Holder`s name u want to find ", s12);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.name.equals(s11)) {
                rows[i] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                found = true;

            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Fount");
        }
    }

    public void searchAccountNo() {
        String s1 = "", s2 = "";
        s1 = JOptionPane.showInputDialog("Enter Account Number u want to find ", s2);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type", "Date"};
        Object[][] rows = new Object[1][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.accountNum == Integer.parseInt(s1)) {
                rows[0] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type, var.date};
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Fount");
        }
    }

    private boolean onlyContainsNumbers(String text) {
        try {
            Long.parseLong(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public void reportDate() {
    }

    public void reportAmount() {
        String s111 = "", s112 = "", s1 = "", s2 = "";
        s111 = JOptionPane.showInputDialog("Enter Minimum Amount ", s112);
        s1 = JOptionPane.showInputDialog("Enter Maximum Amount ", s2);
        boolean found = false;
        String[] columns = new String[]{"Account Number", "Name", "Pincode",
            "User Login", "Balance", "Status", "Type"};
        Object[][] rows = new Object[user.size()][columns.length];
        for (int i = 0; i < user.size(); i++) {
            Customer_Data var = user.get(i);
            if (var.startingBalance >= Integer.parseInt(s111) && var.startingBalance <= Integer.parseInt(s1)) {
                rows[i] = new Object[]{var.accountNum, var.name, var.pincode,
                    var.login, var.startingBalance, var.status, var.type};
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, new JScrollPane(new JTable(rows, columns)), "Account information", JOptionPane.PLAIN_MESSAGE);
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Fount");
        }
    }

    public void search() {
        String s00 = "", s0 = "";
        s0 = JOptionPane.showInputDialog("\tSelect for search Account\n1- Search through Account Number\n2-Search through Holder Name\n3- Search through Account Balance\n4-Search through Account Type  ", s00);
        switch (s0) {
            case "1":
                searchAccountNo();
                break;
            case "2":
                searchAccountName();
                break;
            case "3":
                searchAccountBalance();
                break;
            case "4":
                searchAccountType();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option ", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public void createAccount() {
        Customer_Data a = new Customer_Data();
        // if(a.accountNum==user.size()){
        // a.accountNum = user.size();
        if (a.accountNum == a.accountNum) {
            a.accountNum = user.size() + 1;
        }
        //  else
        //{
        ///    a.accountNum = user.size()+1;
        // }
        do {
            String s = "";
            a.name = JOptionPane.showInputDialog("Enter Name", s);
//        if(a.name.equals(""))
//        {  JOptionPane.showMessageDialog(null, "Name can not be empty","Invalid input",JOptionPane.ERROR_MESSAGE);}
//        if( onlyContainsNumbers(a.name))
//        {JOptionPane.showMessageDialog(null, "Name can not be in digits","Invalid input",JOptionPane.ERROR_MESSAGE);}
            if (!a.name.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "Enter invalid name ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
            if (a.name.matches("[a-zA-Z]+")) {
                a.name1 = a.name;
            }
        } while (!a.name.matches("[a-zA-Z]+"));
        do {
            String ab = "";
            a.login = JOptionPane.showInputDialog("Enter User Login", ab);
            if (a.login.equals("")) {
                //a.login=null;       
                JOptionPane.showMessageDialog(null, "User Login can not be empty", "Invalid input", JOptionPane.ERROR_MESSAGE);
            } //        
            else {
                a.login = a.login;
            }
//       if(!a.login.matches("[a-zA-Z]+"))
//       {JOptionPane.showMessageDialog(null, "User Login can not be empty","Invalid input",JOptionPane.ERROR_MESSAGE);}
        } while (a.login.equals(""));
        String s1 = "";

        do {
            a.pincode = JOptionPane.showInputDialog("Enter 5 digit PinCode", s1);
            if (a.pincode.matches("[0-9]{5}")) {
                a.pincode1 = a.pincode;
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter 5 digit pincode ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        } while (!a.pincode.matches("[0-9]{5}"));
        String s2 = "";
        do {

            s2 = JOptionPane.showInputDialog("Enter Starting Balance ");
            if (onlyContainsNumbers(s2)) {
                a.startingBalance = Integer.parseInt(s2);
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter digits only  ", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        } while (!onlyContainsNumbers(s2));
        String[] s0 = {"Current", "Savings"};
        String[] s01 = {"Active", "Disable"};
        //String s3 = "";
        a.status = (String) JOptionPane.showInputDialog(null, "Select Status...", "Account Status", JOptionPane.QUESTION_MESSAGE, null, s01, s01[0]);
        a.type = (String) JOptionPane.showInputDialog(null, "Select Type...", "Account Type", JOptionPane.QUESTION_MESSAGE, null, s0, s0[0]);
        a.date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
        user.add(a);
        l.user1 = this.user;
        JOptionPane.showMessageDialog(null, "Account Created successfully....");
//        for (int i = 0; i < user.size(); i++) {
//            Customer_Data var = user.get(i);
//            JOptionPane.showMessageDialog(null, "Account Number : " + var.accountNum + "\nUser Login : " + var.login + "\nHolder`s Name : " + var.name + "\nPinCode : " + var.pincode + "\nBalance : " + var.startingBalance + "\nStatus : " + var.status + "\nAccount Type : " + var.type, "Account Information", JOptionPane.PLAIN_MESSAGE);
//        }
    }
    
    public void viewReports() {
          String s00 = "", s0 = "";
        s0 = JOptionPane.showInputDialog("\tView Reports \n1-By Holder Name\n2-By Amount\n3-By Account Type  ", s00);
        switch (s0) {
            case "1":
                searchAccountName();
                break;
            case "2":
               reportAmount(); 
                break;
            case "3":
                searchAccountType();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option ", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Search Account");
        jButton4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton4StateChanged(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("View Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Exit");
        jButton6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton6StateChanged(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        createAccount();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        deleteAccount();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton4StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updateAccount();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        viewReports();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton6StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6StateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        //  new ATM().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // new ADMIN().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
