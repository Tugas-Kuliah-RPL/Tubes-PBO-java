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
public class user extends authentication {
        public static String table = "tbl_user";
        private int id;
        private String username;
        private String password;
        
        public void SetUser(int id, String username, String password){
            this.id = id;
            this.username = username;
            this.password = password;
        }

        public static String getTable() {
            return table;
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
        
        
}
