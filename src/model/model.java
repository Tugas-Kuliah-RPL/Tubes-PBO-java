/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
/**
 *
 * @author USER
 */
public interface model {

    public Connection getConnection() throws SQLException;
    public ResultSet getData(String SQLString);
    public void query (String SQLString);
    public int insert(String tableName, String[] columns, String[] values);
    public int edit(String tableName, String[] columns, String[] values, String whereClause);
    public int delete(String tableName, String whereClause);
}
