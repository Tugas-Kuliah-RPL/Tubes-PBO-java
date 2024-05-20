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
       ResultSet rs = new Lowongan().getData("SELECT tbl_lowongan.id,tbl_perusahaan.nama, tbl_lowongan.nama_lowongan, tbl_lowongan.deskripsi_lowongan FROM tbl_lowongan INNER JOIN tbl_perusahaan ON tbl_lowongan.id = tbl_perusahaan.id;");
       return rs;
    }
}
