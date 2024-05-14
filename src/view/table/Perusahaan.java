/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.table;
import controller.PerusahaanController;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LOQ
 */
public class Perusahaan extends javax.swing.JFrame {

    /**
     * Creates new form Perusahaan
     */
    public Perusahaan() {
        initComponents();
        this.getData();
        this.status("default");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_Perusahaan = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label_nik = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        input_deskripsi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        input_alamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_website = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_Perusahaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "nama", "deskripsi", "alamat", "no_telp", "website"
            }
        ));
        table_Perusahaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_PerusahaanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Perusahaan);

        jTextField1.setText("jTextField1");

        jButton2.setText("Search");

        jButton1.setText("back");

        jLabel1.setText("Table Perusahaan");

        label_nik.setText("nama");

        jLabel2.setText("Deskripsi");

        jLabel3.setText("Alamat");

        jLabel4.setText("Email");

        jLabel5.setText("website");

        btn_tambah.setText("tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_update.setText("update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_nama)
                            .addComponent(input_deskripsi)
                            .addComponent(input_alamat)
                            .addComponent(input_email)
                            .addComponent(input_website, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel1))
                                    .addComponent(label_nik)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 60, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_nik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_website, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_update)
                    .addComponent(btn_delete))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       private void getData() {
        DefaultTableModel model = (DefaultTableModel) table_Perusahaan.getModel();
        model.setRowCount(0);
        
         
        try{
            ResultSet rs = PerusahaanController.index();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String deskripsi = rs.getString("deskripsi");
                String alamat = rs.getString("alamat");
                String email = rs.getString("email");
                String website = rs.getString("website");
                Object[] rowData = {id,nama,deskripsi, alamat,email,website};
                model.addRow(rowData); // buat menambah row data di tabe
            }
            //Object[] rowData = {1,"dua","tiga","empat"};
            //model.addRow(rowData);
            rs.close(); // statement close
        }catch(Exception e){
             Logger.getLogger(pelamaar.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    private void table_PerusahaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_PerusahaanMouseClicked
        // TODO add your handling code here:
        this.status("disabled");
        int selectedRow = table_Perusahaan.getSelectedRow();
        String nik = table_Perusahaan.getValueAt(selectedRow, 1).toString();
        String nama = table_Perusahaan.getValueAt(selectedRow, 2).toString();
        String telepon = table_Perusahaan.getValueAt(selectedRow, 3).toString();
        String email  = table_Perusahaan.getValueAt(selectedRow, 4).toString();
        String Status = table_Perusahaan.getValueAt(selectedRow, 5).toString();
        input_nama.setText(nik);
        input_deskripsi.setText(nama);
        input_alamat.setText(telepon);
        input_email.setText(email);
        input_website.setText(Status);
    }//GEN-LAST:event_table_PerusahaanMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        
        String nama = input_nama.getText();
        String deskripsi = input_deskripsi.getText();
        String alamat = input_alamat.getText();
        String telepon = input_email.getText();
        String website = input_website.getText(); // get input
        
        if (nama.isEmpty() || deskripsi.isEmpty() || alamat.isEmpty() || telepon.isEmpty() || website.isEmpty()){
            JOptionPane.showMessageDialog(this, "semua kolom harus disi", "validasi",JOptionPane.ERROR_MESSAGE); // buat erorr message
            return;
        }

        try{
            ArrayList<String> arr =  new  ArrayList<String>();
            arr.add(null); // id
            arr.add(nama);
            arr.add(deskripsi);
            arr.add(alamat);
            arr.add(telepon);
            arr.add(website);
            arr.add(null); // user_id
            int result = PerusahaanController.insert(arr);
            if(result > 0 ){
                JOptionPane.showMessageDialog(this, "data berhasil di tambah");
                this.getData();
                this.resetform();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "error input", "validasi",JOptionPane.ERROR_MESSAGE); // buat erorr message
            return;
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_Perusahaan.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan di perbaharui","Validasi",JOptionPane.ERROR_MESSAGE); // show erorr message
            return;
        }
        String id = table_Perusahaan.getValueAt(selectedRow, 0).toString();

        String nama = input_nama.getText();
        String deskripsi = input_deskripsi.getText();
        String alamat = input_alamat.getText();
        String telepon = input_email.getText();
        String website = input_website.getText(); // get input
        
        if (nama.isEmpty() || deskripsi.isEmpty() || alamat.isEmpty() || telepon.isEmpty() || website.isEmpty()){
            JOptionPane.showMessageDialog(this, "semua kolom harus disi", "validasi",JOptionPane.ERROR_MESSAGE); // buat erorr message
            return;
        }
        try{
            ArrayList<String> arr =  new  ArrayList<String>();
            arr.add(nama);
            arr.add(deskripsi);
            arr.add(alamat);
            arr.add(telepon);
            arr.add(website);
            arr.add(null);
            int result = PerusahaanController.update(arr, Integer.parseInt(id));
            if(result > 0 ){
                JOptionPane.showMessageDialog(this, "data berhasil di update");
                this.getData();
                this.resetform();
                this.status("disabled");
            }
        }catch(Exception E){
            JOptionPane.showMessageDialog(this, "error input", "validasi",JOptionPane.ERROR_MESSAGE); // buat erorr message
            return;
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_Perusahaan.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan di perbaharui","Validasi",JOptionPane.ERROR_MESSAGE); // show erorr message
            return;
        }
        String id = table_Perusahaan.getValueAt(selectedRow, 0).toString();
        try{
            int result = PerusahaanController.delete(id);
            if(result > 0 ){
                JOptionPane.showMessageDialog(this, "data berhasil di delete");
                this.getData();
                this.resetform();
                this.status("disabled");
            }
        }catch(Exception E){
            JOptionPane.showMessageDialog(this, "error", "validasi",JOptionPane.ERROR_MESSAGE); // buat erorr message
            return;
        }
    }//GEN-LAST:event_btn_deleteActionPerformed
    public void resetform(){
        input_nama.setText("");
        input_deskripsi.setText("");
        input_alamat.setText("");
        input_email.setText("");
        input_website.setText("");
      }
    
    private void status (String param){
        if(param == "disabled"){
          btn_update.setEnabled(true);
          btn_delete.setEnabled(true);
          btn_tambah.setEnabled(false);
        }else if(param == "enabled"){
          btn_update.setEnabled(false);
          btn_delete.setEnabled(false);
          btn_tambah.setEnabled(true);
        }else if(param == "default"){
           btn_update.setEnabled(false);
           btn_delete.setEnabled(false);
        }
    }
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
            java.util.logging.Logger.getLogger(Perusahaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perusahaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perusahaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perusahaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perusahaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField input_alamat;
    private javax.swing.JTextField input_deskripsi;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_website;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_nik;
    private javax.swing.JTable table_Perusahaan;
    // End of variables declaration//GEN-END:variables
}
