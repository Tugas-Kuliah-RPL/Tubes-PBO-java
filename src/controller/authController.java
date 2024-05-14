/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Pelamaar;

/**
 *
 * @author LOQ
 */
public class authController extends Controller {
     public static int login(  ArrayList<String> columnValues){
         String[] columns = {"username","password"};
         return new Pelamaar().login("tbl_user", columns, columnValues);
    };
      
    public static int register( ArrayList<String> Loginvalues, ArrayList<String> columnValues){
         String[] columns = {"nik","nama_pelamar","nomer_telepon","email","status"};
         return new Pelamaar().register(Pelamaar.class, columns, Loginvalues, columnValues);
    };
}
