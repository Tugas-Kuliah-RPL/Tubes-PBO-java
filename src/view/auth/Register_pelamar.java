/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.auth;

import Session.AuthSession;
import controller.PelamarController;
import controller.PerusahaanController;
import controller.authController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.page.pelamar.home;

/**
 *
 * @author USER
 */
public class Register_pelamar extends javax.swing.JFrame {

    /**
     * Creates new form Register_pelamar
     */
    public Register_pelamar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container_login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_nik = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        input_password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        input_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        input_telepon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container_login.setBackground(new java.awt.Color(153, 153, 153));
        container_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        container_login.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                container_loginComponentAdded(evt);
            }
        });
        container_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Register Pelamar form");
        container_login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 26));

        input_username.setText("username");
        input_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_usernameActionPerformed(evt);
            }
        });
        container_login.add(input_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 260, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("username");
        container_login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("nik");
        container_login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 26));

        input_nik.setText("nik");
        container_login.add(input_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 260, 34));

        btn_register.setText("register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        container_login.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 130, 50));

        btn_login.setText("back to login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        container_login.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("password");
        container_login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, 26));

        input_password.setText("password");
        input_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_passwordActionPerformed(evt);
            }
        });
        container_login.add(input_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 260, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("nama");
        container_login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, 26));

        input_nama.setText("nama");
        input_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaActionPerformed(evt);
            }
        });
        container_login.add(input_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 260, 34));

        input_email.setText("email");
        input_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_emailActionPerformed(evt);
            }
        });
        container_login.add(input_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 260, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("email");
        container_login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 26));

        input_telepon.setText("no_telepon");
        input_telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_teleponActionPerformed(evt);
            }
        });
        container_login.add(input_telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 260, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("no_telepon");
        container_login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(container_login, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(container_login, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_usernameActionPerformed

    private void container_loginComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_container_loginComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_container_loginComponentAdded

    private void input_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_passwordActionPerformed

    private void input_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaActionPerformed

    private void input_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_emailActionPerformed

    private void input_teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_teleponActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        String username = input_username.getText();
        String password = input_password.getText();
        String nik = input_nik.getText(); // get input
        String nama = input_nama.getText();
        String telepon = input_telepon.getText();
        String email = input_telepon.getText();
        String status = "active";
        
        if (username.isEmpty() || password.isEmpty() || nik.isEmpty() || nama.isEmpty() || telepon.isEmpty() || email.isEmpty() || status.isEmpty()){
            JOptionPane.showMessageDialog(this, "semua kolom harus disi", "validasi",JOptionPane.ERROR_MESSAGE); // buat erorr message
            return;
        }
        
        try{
            ArrayList<String> arrUser = new  ArrayList<String>();
            arrUser.add(username);
            arrUser.add(password);
            ArrayList<String> arr =  new  ArrayList<String>();
            arr.add(nik);
            arr.add(nama);
            arr.add(telepon);
            arr.add(email);
            arr.add(status);

            int result = authController.register(arrUser,arr);
            if(result > 0 ){
                JOptionPane.showMessageDialog(this, "data berhasil di reguster");
                    this.setVisible(false);
                    home p = new home(new AuthSession("",result)); // set name login
                    p.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "error input", "validasi",JOptionPane.ERROR_MESSAGE); // buat erorr message
            return;
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
            Login p = new Login(); // set name login
            p.setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register_pelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_pelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_pelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_pelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_pelamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JPanel container_login;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_nik;
    private javax.swing.JTextField input_password;
    private javax.swing.JTextField input_telepon;
    private javax.swing.JTextField input_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
