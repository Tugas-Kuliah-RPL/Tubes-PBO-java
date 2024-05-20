/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LOQ
 */
public class Lowongan extends connection {
      public static String table = "tbl_lowongan";
      private String nama_lowongan;
      private String jenis_lowongan;
      private String deskripsi_lowongan;
      private String perusahaan_id;

    public static String getTable() {
        return table;
    }

    public String getNama_lowongan() {
        return nama_lowongan;
    }

    public String getJenis_lowongan() {
        return jenis_lowongan;
    }

    public String getDeskripsi_lowongan() {
        return deskripsi_lowongan;
    }

    public String getPerusahaan_id() {
        return perusahaan_id;
    }
      
      
}
