/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

/**
 *
 * @author LOQ
 */
public class AuthSession {
     private String sessionId;
        private int userId;
        private long creationTime;

        public AuthSession(String sessionId, int userId) {
            this.sessionId = sessionId;
            this.userId = userId;
            this.creationTime = System.currentTimeMillis();
        }

        public String getSessionId() {
            return sessionId;
        }

        public int getUserId() {
            return userId;
        }

        public long getCreationTime() {
            return creationTime;
        }
}
