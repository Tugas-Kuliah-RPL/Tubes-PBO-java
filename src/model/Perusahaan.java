/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.connection;
/**
 *
 * @author LOQ
 */
public class Perusahaan extends user {
    public static String table = "tbl_perusahaan";
    private int id;
    private String deskripsi;
    private String alamat;
    private String email;
    private String website;
}
