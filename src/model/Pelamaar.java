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
public class Pelamaar extends connection {
    private String nik;
    private String nama_pelamar;
    private String nomer_telepon;
    private String email;
    private String status;

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama_pelamar(String nama_pelamar) {
        this.nama_pelamar = nama_pelamar;
    }

    public void setNomer_telepon(String nomer_telepon) {
        this.nomer_telepon = nomer_telepon;
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

    public String getNomer_telepon() {
        return nomer_telepon;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }
    
    
}
