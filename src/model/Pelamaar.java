/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.connection;
/**
 *
 * @author USER
 */
public class Pelamaar extends user {
    public static String table = "tbl_pelamar";
    private int id;
    private String nik;
    private String nama_pelamar;
    private int nomer_telepon;
    private String email;
    private String status;
    
    public void setPelamar(int id ,String nik, String namaPelamar, String email, String status, int nomorTelepon) {
        this.id = id;
        this.nik = nik;
        this.nama_pelamar = namaPelamar;
        this.nomer_telepon = nomorTelepon;
        this.email = email;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    

    public int getNomer_telepon() {
        return nomer_telepon;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama_pelamar(String nama_pelamar) {
        this.nama_pelamar = nama_pelamar;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getNik() {
        return nik;
    }

    public String getNama_pelamar() {
        return nama_pelamar;
    }


    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }
    
    
}
