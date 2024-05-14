/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public interface model <T> {

    public Connection getConnection() throws SQLException;
    public ResultSet getData(String SQLString);
    public ResultSet query (String SQLString);
    public int insert(ArrayList<T> values, Class<T> Type);
    public int edit(String[] column, ArrayList<T> values, Class<T> Type, int id);
    public int delete(Class<T> type, String whereClause);
    public String getTableName(Class<T> type);
}
