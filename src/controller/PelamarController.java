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
        String[] columns = {"nik","nama_pelamar","nomer_telepon","email","status"};
        return new Pelamaar().insert("tbl_pelamar", columns, values);
    }
    
    public static int update(String[] values, String id){
          String[] columns = {"nik","nama_pelamar","nomer_telepon","email","status"};
        return new Pelamaar().edit("tbl_pelamar", columns, values, id);
    }
    
     public static int delete(String id){
          String[] columns = {"nik","nama_pelamar","nomer_telepon","email","status"};
        return new Pelamaar().delete("tbl_pelamar", "id="+id);
    }
}
