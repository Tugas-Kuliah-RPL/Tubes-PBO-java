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
abstract class authentication extends connection {
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
    public int register(String tableName, String[] columns, ArrayList<String> Loginvalues, ArrayList<String> columnValues){
         if (columns.length != columnValues.size()) {
            throw new IllegalArgumentException("Columns and values arrays must have the same length.");
          };
          String[] userC = {"username","password"};
          int idUser = this.insert("tbl_user", userC, Loginvalues);
          this.insert(tableName, columns, columnValues); // insert column;
          
          return  idUser;
    };
}
