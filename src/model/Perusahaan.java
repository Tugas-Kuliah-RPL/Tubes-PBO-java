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

    public static void setTable(String table) {
        Perusahaan.table = table;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public static String getTable() {
        return table;
    }

    public int getId() {
        return id;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }
    
    
}
