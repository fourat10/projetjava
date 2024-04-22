/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ClientCRUD;

import Classes.Client;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class RetournerVoiture extends javax.swing.JInternalFrame {
    private javax.swing.JDesktopPane jDesktopPane1;
    private Connection con;
    private Client client;
    /**
     * Creates new form RetournerVoiture
     */
    public RetournerVoiture() {
        initComponents();
    }
    public RetournerVoiture(javax.swing.JDesktopPane jDesktopPane1,Connection c,Client cl) {
        this.jDesktopPane1=jDesktopPane1;
        this.con=c;
        this.client=cl;
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

        retournerbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_location_field = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        retournerbtn.setText("RETOURNER");
        retournerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retournerbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("CODE DE RESERVATION :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(retournerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(id_location_field, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_location_field, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(retournerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retournerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retournerbtnActionPerformed
    String sql ="SELECT * FROM location WHERE ID=?";
    String id_location=id_location_field.getText();
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id_location);
            ResultSet res = pstmt.executeQuery();
            if(res.next()){
                if(res.getString("CIN").equals(client.getCin())){
                    if(res.getString("date_retour")!=null){
                        JOptionPane.showMessageDialog(null, " cette voiture est deja retournée !!! ", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                        if(res.getString("num_carte_bancaire")==null){
                            JOptionPane.showMessageDialog(null, " il faut payer les frais de location avant !!! ", "Error", JOptionPane.ERROR_MESSAGE);
                        }else{
                            Date date_fin=res.getDate("date_fin");

                            LocalDate currentDate = LocalDate.now();
                            //LocalDate date_fin_new = date_fin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                            LocalDate date_fin_new = date_fin.toLocalDate();

                            long differenceInDays = ChronoUnit.DAYS.between(date_fin_new,currentDate); 
                            System.out.println("nb jour en retard = "+differenceInDays);
                            
                            
                            //update etat car 
                            String matricule=res.getString("matricule");
                            sql="UPDATE voiture SET etat='en attente', disponibilite='disponible' WHERE matricule=?";
                            PreparedStatement pstmt2 = con.prepareStatement(sql);
                            pstmt2.setString(1, matricule);
                            pstmt2.executeUpdate();
                            pstmt2.clearParameters();
                            
                            
                            //Update location ajouter date de retour
                            sql="UPDATE location SET date_retour=CURDATE() WHERE ID=?";
                            pstmt2=con.prepareStatement(sql);
                            pstmt2.setString(1, id_location);
                            pstmt2.executeUpdate();
                            if(differenceInDays>0){
                                JOptionPane.showMessageDialog(null, " vous etes en retard de "+differenceInDays+"  jours et vous devez payer une penalite !!! ", "Error", JOptionPane.ERROR_MESSAGE);

                                
                                //calculer le montant de penaite
                                sql="SELECT prix FROM voiture WHERE matricule = ?";
                                pstmt2.clearParameters();
                                pstmt2=con.prepareStatement(sql);
                                pstmt2.setString(1, matricule);
                                res = pstmt2.executeQuery();
                                float prix=0;
                                if(res.next()){
                                     prix=res.getFloat("prix");
                                }
                                
                                double monatant_penalite = prix* differenceInDays*2;
                                
                                
                                //payer penalite
                                PayerPenalite adc=new PayerPenalite(jDesktopPane1,con,client,differenceInDays,monatant_penalite,id_location);
                                jDesktopPane1.removeAll();
                                jDesktopPane1.updateUI();//bech tsaker w thel haja jdida
                                jDesktopPane1.add(adc);
                                adc.show();
                                
                            }else{
                                // si le client retourne la voitue dans le temps propre ou meme avant
                                JOptionPane.showMessageDialog(null," Merci pour votre confiance ");
                                JInternalFrame[] frames = jDesktopPane1.getAllFrames();
                                for (JInternalFrame frame : frames) {
                                     frame.dispose(); // Close the internal frame
                                }
                            }

                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, " cette location n'est pas pour vous !!! ", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RetournerVoiture.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
        
        
        
    }//GEN-LAST:event_retournerbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_location_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton retournerbtn;
    // End of variables declaration//GEN-END:variables
}
