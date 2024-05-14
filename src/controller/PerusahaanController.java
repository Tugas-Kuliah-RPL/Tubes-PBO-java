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
import model.Perusahaan;
/**
 *
 * @author LOQ
 */
public class PerusahaanController extends Controller {
    public static ResultSet index(){
       ResultSet rs = new Perusahaan().getData("SELECT * FROM tbl_perusahaan");
        System.out.println("here 2");
       return rs;
    }
    public static int insert(ArrayList<String> values)  {
        return new Perusahaan().insert(values, Perusahaan.class);
    }
    
    public static int update(ArrayList<String> values, int id){
        String[] column = {"nama","deskripsi", "alamat","email","website","user_id"};
        return new Perusahaan().edit(column,values, Perusahaan.class,id);
    }
    
     public static int delete(String id){
        return new Perusahaan().delete(Perusahaan.class, "id="+id);
    }
}
