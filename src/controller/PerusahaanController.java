/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import controller.Controller;
import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Pelamaar;
/**
 *
 * @author LOQ
 */
public class PerusahaanController extends Controller {
    public static ResultSet index(){
       ResultSet rs = new Pelamaar().getData("SELECT * FROM tbl_perusahaan");
        System.out.println("here 2");
       return rs;
    }
    public static int insert(ArrayList<String> values)  {
        String[] columns = {"nama","deskripsi", "alamat","email","website"};;
        return new Pelamaar().insert("tbl_perusahaan", columns, values);
    }
    
    public static int update(String[] values, String id){
          String[] columns = {"nama","deskripsi", "alamat","email","website"};;
        return new Pelamaar().edit("tbl_perusahaan", columns, values, id);
    }
    
     public static int delete(String id){
          String[] columns = {"nama","deskripsi", "alamat","email","website"};;
        return new Pelamaar().delete("tbl_perusahaan", "id="+id);
    }
}
