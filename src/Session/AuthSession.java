/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pelamaar;
import model.connection;
import model.user;

/**
 *
 * @author LOQ
 */
public class AuthSession extends connection {
     private String sessionId;
        private int userId;
        private long creationTime;
        private String role;
        private  user Users = new user();
        private Pelamaar p = new Pelamaar();

        public AuthSession(String role , int userId) {
         try {
             this.userId = userId;
             this.creationTime = System.currentTimeMillis();
             this.role = role;             
             this.setUser();
             this.setPelamar();
         } catch (SQLException ex) {
             Logger.getLogger(AuthSession.class.getName()).log(Level.SEVERE, null, ex);
         }
        }

    public int getUserId() {
        return userId;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public String getRole() {
        return role;
    }
        
        public String getSessionId() {
            return sessionId;
        }

        private void setUser() throws SQLException{
            ResultSet rs = new user().getData("SELECT * FROM tbl_user WHERE id = "+this.userId);
            while(rs.next()){
                this.Users.SetUser(Integer.parseInt(rs.getString("id")),rs.getString("username"),rs.getString("password"));
            }
        }
        
        private void setPelamar() throws SQLException{
            if(this.role == "pelamar"){
                System.out.println(this.userId);
                ResultSet rs = new user().getData("SELECT * FROM tbl_pelamar WHERE user_id = "+this.userId);
                while(rs.next()){
                    this.p.setPelamar(Integer.parseInt(rs.getString("id")),rs.getString("nik"),rs.getString("nama_pelamar"),rs.getString("email"),rs.getString("status"),rs.getInt("nomer_telepon"));
                }
                }else{
                    System.out.println("invalid");
                }
        }
            
        
        public user User(){
            return Users;
        }

        public Pelamaar Pelamars() {
            System.out.println(this.role);
            if(this.role == "pelamar"){
                return p;
            }else{
                System.out.println("invalid");
            }
            return null;
        }
        
        
}
