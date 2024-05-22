/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import model.Lowongan;
import model.Pelamaar;

/**
 *
 * @author LOQ
 */
public class LowonganController extends Controller {
    public static ResultSet index(){
       ResultSet rs = new Lowongan().getData("SELECT tbl_lowongan.id,tbl_perusahaan.nama, tbl_lowongan.nama_lowongan, tbl_lowongan.deskripsi_lowongan FROM tbl_lowongan "
               + "INNER JOIN tbl_perusahaan ON tbl_lowongan.perusahaan_id = tbl_perusahaan.id;");
       return rs;
    }
    
     public static ResultSet status(int id){
       ResultSet rs = new Lowongan().getData("SELECT tbl_lamaran.id AS lamaran_id, tbl_pelamar.id AS id_pelamar, "
               + "tbl_pelamar.nama_pelamar,tbl_perusahaan.nama, tbl_lowongan.nama_lowongan, tbl_lowongan.deskripsi_lowongan, "
               + "tbl_lamaran.status FROM tbl_perusahaan INNER JOIN tbl_lowongan INNER JOIN tbl_lamaran INNER JOIN tbl_pelamar "
               + "ON tbl_lowongan.perusahaan_id = tbl_perusahaan.id AND tbl_lowongan.id = tbl_lamaran.lowongan_id AND "
               + "tbl_lamaran.pelamar_id = tbl_pelamar.id where tbl_lamaran.pelamar_id = "+id+";");
         System.out.println(rs);
       return rs;
    }
    
     public static ResultSet findID(int id){
       ResultSet rs = new Lowongan().getData("SELECT tbl_lowongan.id,tbl_perusahaan.nama, tbl_lowongan.nama_lowongan, tbl_lowongan.deskripsi_lowongan, tbl_lowongan.jenis_lowongan FROM tbl_lowongan INNER JOIN tbl_perusahaan ON tbl_lowongan.id = tbl_perusahaan.id WHERE tbl_perusahaan.id = "+id);
       return rs;
    }
}
