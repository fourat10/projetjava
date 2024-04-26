/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ClientCRUD;

import Classes.Client;
import Mecanicien.ListePanne;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author DELL
 */
public class ClientInterface extends javax.swing.JFrame {
    private Client client;
    private Connection con;

    
    
    /**
     * Creates new form ClientInterface
     */
    public ClientInterface() {
        initComponents();
    }
    public ClientInterface(Client cl,Connection c) {
        this.con=c;
        this.client=cl;
        System.out.println(client.toString());
        
        initComponents();
        
        String username = this.client.getUsername();
        clientUsername.setText("Bienvenue , "+username);
        
    }
    public ClientInterface(String s) {
        
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

        louerbtn = new javax.swing.JButton();
        retournerbtn = new javax.swing.JButton();
        prendrebtn = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        clientUsername = new javax.swing.JLabel();
        annulerbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        louerbtn.setBackground(new java.awt.Color(255, 255, 102));
        louerbtn.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        louerbtn.setText("LOUER VOITURE");
        louerbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        louerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                louerbtnActionPerformed(evt);
            }
        });

        retournerbtn.setBackground(new java.awt.Color(255, 255, 102));
        retournerbtn.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        retournerbtn.setText("RETOURNER VOITURE");
        retournerbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        retournerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retournerbtnActionPerformed(evt);
            }
        });

        prendrebtn.setBackground(new java.awt.Color(255, 255, 102));
        prendrebtn.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        prendrebtn.setText("PRENDRE VOITURE");
        prendrebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        prendrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prendrebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        annulerbtn.setBackground(new java.awt.Color(255, 255, 102));
        annulerbtn.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        annulerbtn.setText("ANNULER RESERVATION");
        annulerbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        annulerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prendrebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retournerbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(louerbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(annulerbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(louerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(prendrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(retournerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(annulerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void louerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_louerbtnActionPerformed
        LouerVoiture adc=new LouerVoiture(jDesktopPane1,con,client);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(adc);
        adc.show();
    }//GEN-LAST:event_louerbtnActionPerformed

    private void prendrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prendrebtnActionPerformed
        PrendreVoiture pv =new PrendreVoiture(jDesktopPane1,con,client);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(pv);
        pv.show();
    }//GEN-LAST:event_prendrebtnActionPerformed

    private void retournerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retournerbtnActionPerformed
        RetournerVoiture pv =new RetournerVoiture(jDesktopPane1,con,client);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(pv);
        pv.show();
    }//GEN-LAST:event_retournerbtnActionPerformed

    private void annulerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerbtnActionPerformed
        AnnulerReservation pv =new AnnulerReservation(jDesktopPane1,con,client);
        jDesktopPane1.removeAll();
        jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
        jDesktopPane1.add(pv);
        pv.show();        


        // TODO add your handling code here:
    }//GEN-LAST:event_annulerbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ClientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerbtn;
    private javax.swing.JLabel clientUsername;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton louerbtn;
    private javax.swing.JButton prendrebtn;
    private javax.swing.JButton retournerbtn;
    // End of variables declaration//GEN-END:variables
}
