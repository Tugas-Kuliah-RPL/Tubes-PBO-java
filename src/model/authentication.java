/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.connection;
import static model.connection.conn;

/**
 *
 * @author LOQ
 */
abstract class authentication<T> extends connection {
    public int login(String tableName, String[] columns, ArrayList<String> values){
        String querys = "SELECT * FROM " + tableName + " WHERE username = ?";
       try {
           PreparedStatement st = conn.prepareStatement(querys);
           st.setString(1, values.get(0));
           ResultSet rs = st.executeQuery();
           if (rs.next()) { // Check eser ada row apa engga
               String passwordFromDB = rs.getString("password");
               String passwordInput = values.get(1);
               if (passwordInput.equals(passwordFromDB)) {
                   return rs.getInt("id");
               } else {
                   return 0;
               }
           } else {
               return 0; // No user found with the given username
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
           return -1; // Return -1 to indicate an error
       }
    };
    public int register(Class<T> tableName, String[] columns, ArrayList<String> Loginvalues, ArrayList<String> columnValues){
            try {
            // Check if the username already exists
            String checkUserQuery = "SELECT * FROM tbl_user WHERE username = ?";
            PreparedStatement checkUserStmt = conn.prepareStatement(checkUserQuery);
            checkUserStmt.setString(1, Loginvalues.get(1)); // Assuming username is the first value in loginValues
            ResultSet checkUserRs = checkUserStmt.executeQuery();
            if (checkUserRs.next()) {
                JOptionPane.showMessageDialog(null, "Error: Username already exists", "Registration Error", JOptionPane.WARNING_MESSAGE);
                return 0; 
            }

            int idUser = this.insert(Loginvalues, user.class);
            if (idUser <= 0) {
                JOptionPane.showMessageDialog(null, "Error: Failed to insert user data", "Registration Error", JOptionPane.WARNING_MESSAGE);
                return -1; 
            }

            columnValues.add(Integer.toString(idUser)); // Add id
            int result = this.insert(columnValues, tableName);

            if (result <= 0) {
                JOptionPane.showMessageDialog(null, "Error: Failed to insert additional data", "Registration Error", JOptionPane.WARNING_MESSAGE);
                return -1; 
            }

            return idUser; // Return the user ID if registration is successful
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Registration Error", JOptionPane.WARNING_MESSAGE);
            return -1; 
        }
    };
}
