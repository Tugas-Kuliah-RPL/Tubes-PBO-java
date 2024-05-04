/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import model.model;
/**
 *
 * @author USER
 */
public class connection implements model {
    
    static final String DB_URL = "jdbc:mysql://localhost/db_lamar_kerja";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public connection(){
        this.getConnection();
    }
 
    @Override
    public Connection getConnection() {
       try{
          Class.forName("com.mysql.cj.jdbc.Driver"); // harus pakai ini buat registernya
          conn = (Connection) DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
          stmt = conn.createStatement();
       }catch(Exception e){
         
           Logger.getLogger(connection.class.getName()).log(Level.SEVERE,null,e);
       }
       return conn;
    }

    @Override
    public ResultSet getData(String SQLString) {
      try{
         PreparedStatement st = conn.prepareStatement(SQLString);
          rs = st.executeQuery();
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
      return rs;
    }

    @Override
    public ResultSet query(String SQLString) {
         try{
           PreparedStatement st = conn.prepareStatement(SQLString);
           rs = st.executeQuery();
           return rs;
         }
         catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
         }
         return rs;
    }

    @Override
     public int insert(String tableName, String[] columns, ArrayList<String> values){
        if (columns.length != values.size()) {
            throw new IllegalArgumentException("Columns and values arrays must have the same length.");
        }

        StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " (");
         int rowInserted = 0;
        for (int i = 0; i < columns.length; i++) {
            sql.append(columns[i]);
            if (i < columns.length - 1) {
                sql.append(", ");
            }
        }
        sql.append(") VALUES (");
        for (int i = 0; i < values.size(); i++) {
            sql.append("?, "); // Use placeholders for dynamic values
        }
        sql.deleteCharAt(sql.length() - 2); // Remove trailing comma
        sql.append(")");

        try (PreparedStatement pstmt = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS)) { /// set builder to string
            for (int i = 0; i < values.size(); i++) {
                pstmt.setString(i + 1, values.get(i)); // Set values using index starting from 1
            }
            
            rowInserted = pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
                System.out.println(generatedKey);
            }
            return rs.getInt(1); // return id
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    @Override
    public int edit(String tableName, String[] columns, String[] values, String whereClause) {
        if (columns.length != values.length) {
            throw new IllegalArgumentException("Columns and values arrays must have the same length.");
        }

        StringBuilder sql = new StringBuilder("UPDATE " + tableName + " SET ");
        int rowUpdated = 0;
        for (int i = 0; i < columns.length; i++) {
            sql.append(columns[i] + " = ?, ");
        }
        sql.deleteCharAt(sql.length() - 2); // Remove trailing comma
        if (!whereClause.isEmpty()) {
            sql.append(" WHERE id = "+ whereClause);
        }

        try (PreparedStatement pstmt = conn.prepareStatement(sql.toString())) {
            for (int i = 0; i < values.length; i++) {
                pstmt.setString(i + 1, values[i]); // Set values using index starting from 1
            }
            // wehre update
//            if (!whereClause.isEmpty()) {
//               pstmt.setString(values.length+1, whereClause);
//           }
           rowUpdated = pstmt.executeUpdate();
           return rowUpdated;
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }   
        return rowUpdated;
    }

    @Override
     public int delete(String tableName, String whereClause){
        String sql = "DELETE FROM " + tableName;
        int rowDeleted = 0 ;
        if (!whereClause.isEmpty()) {
            sql += " WHERE " + whereClause;
        }

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            rowDeleted = pstmt.executeUpdate();
            return rowDeleted;
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }   
         return rowDeleted;
    }
    
}
