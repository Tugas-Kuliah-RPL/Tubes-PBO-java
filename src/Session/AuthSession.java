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

        public AuthSession(String role , int userId) {
         try {
             this.userId = userId;
             this.creationTime = System.currentTimeMillis();
             this.role = role;             
             this.setUser();
         } catch (SQLException ex) {
             Logger.getLogger(AuthSession.class.getName()).log(Level.SEVERE, null, ex);
         }
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
        
        public user User(){
            return Users;
        }
}
