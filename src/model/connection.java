/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.List;
import java.lang.reflect.Field;
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
public class connection<T>  implements model<T> {
    
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
    public int insert(ArrayList<T> values, Class<T> type) {
        int rowsInserted = 0;
        String tableName = getTableName(type);
        System.out.println(tableName);
        StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " VALUES (");

        for (int i = 0; i < values.size(); i++) {
            sql.append("?");
            if (i < values.size() - 1) {
                sql.append(", ");
            }
        }
        sql.append(")");
        System.out.println(sql);
        
         // set value "?"
        try (PreparedStatement pstmt = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS)) {
            for (int i = 0; i < values.size(); i++) {
                pstmt.setString(i + 1, (String)values.get(i));
            }
            rowsInserted = pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1); // return generated ID
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
       
        return 0;
    }

    @Override
    public int edit(String[] column, ArrayList<T> values, Class<T> type, int id) {
        int rowsUpdated = 0;
        String tableName = getTableName(type);
        StringBuilder sql = new StringBuilder("UPDATE " + tableName + " SET ");

        for (int i = 0; i < column.length; i++) {
            sql.append(column[i]).append(" = ?");
            if (i < values.size() - 1) {
                sql.append(", ");
            }
        }
        sql.append(" WHERE id = ?");
        //System.out.println(sql);
        
        // set value "?"
        try (PreparedStatement pstmt = conn.prepareStatement(sql.toString())) {
            for (int i = 0; i < values.size(); i++) {
                pstmt.setObject(i + 1, values.get(i));
            }
            pstmt.setInt(values.size() + 1, id);

            rowsUpdated = pstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rowsUpdated;
    }


    @Override
     public int delete(Class<T> type, String whereClause){
        String sql = "DELETE FROM " + getTableName(type);
        System.out.println(sql);
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
     
    @Override
    public String getTableName(Class<T> type) {
        try {
            Field tableField = type.getField("table");
            System.out.println(tableField.get(null));
            return (String) tableField.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
}
