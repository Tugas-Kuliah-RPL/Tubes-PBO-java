/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import model.Pelamaar;
import javax.swing.table.DefaultTableModel;
import controller.Controller;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class PelamarController extends Controller {
    public static ResultSet index(){
       ResultSet rs = new Pelamaar().getData("SELECT * FROM tbl_pelamar");
        System.out.println("here 2");
       return rs;
    }
    public static int insert(ArrayList<String> values)  {
        return new Pelamaar().insert( values,Pelamaar.class);
    }
    
    public static int update(ArrayList<String> values, int id){
          String[] columns = {"nik","nama_pelamar","nomer_telepon","email","status"};
        return new Pelamaar().edit(columns, values,Pelamaar.class, id);
    }
    
     public static int delete(String id){
        return new Pelamaar().delete(Pelamaar.class, "id="+id);
    }
}
