/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package adminCRUD;

import ig.Connecteur;
import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adem
 */
public class advoiture extends javax.swing.JInternalFrame {
    private javax.swing.JDesktopPane jDesktopPane3;
    /**
     * Creates new form adclient
     */
    public advoiture() {
        initComponents();
    }
        public advoiture(javax.swing.JDesktopPane jDesktopPanel) {
        
        this.jDesktopPane3=jDesktopPanel;
        initComponents();
    }
             private boolean isNumeric(String str) {
    for (int i = 0; i < str.length(); i++) {
        if (!Character.isDigit(str.charAt(i))) {
            return false; // Found a non-numeric character
        }
    }
    return true; // All characters are numeric
}
    public boolean verif(String matricule){   
        return (!(matricule.equals("") | !isNumeric(matricule)));
    }
    
    
    
    
    
    
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        prix = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        matricule = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        marque = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel12.setText("model");

        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });

        jLabel8.setText("matricule");

        matricule.setActionCommand("<Not Set>");
        matricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculeActionPerformed(evt);
            }
        });

        jLabel10.setText("marque");

        confirm.setText("add");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel16.setText("prix");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(prix))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(model))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(marque))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(matricule, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(confirm)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199)
                .addComponent(confirm)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelActionPerformed

    private void matriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculeActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        String matriculeV =matricule.getText();
        String marqueV =marque.getText();
        String modelV = model.getText();
        String etat = "marche";
        String disp = "disponible";
        String prixV = prix.getText();
        
        if(!verif(matriculeV) ) {
            if(matriculeV.equals("")){
                JOptionPane.showMessageDialog(null,"Veuiller remplir la matricule !!!");
            }else{
                JOptionPane.showMessageDialog(null,"Veuiller verifier la matricule !!!");
            }
        }else{

            if (marqueV.equals("") | modelV.equals("") | prixV.equals("")){
                JOptionPane.showMessageDialog(null,"Veuiller remplir tous les champs !!!");

            }else{
                if(!isNumeric(prixV))
                {
                    JOptionPane.showMessageDialog(null,"Veuiller entrer un prix numeric!!!");
                }
                else
                {
                    
                    Connecteur connect=new Connecteur();
                    Connection con;
                    con =connect.connecttodb();
                    try {
                        Statement stmt = con.createStatement();
                        String query=("SELECT * FROM voiture where matricule ='"+matriculeV+"'");
                        ResultSet rs = stmt.executeQuery(query);

                        if(rs.next() ){
                            JOptionPane.showMessageDialog(null, "THIS CAR ALRAEDY EXISTS");

                        }else{
                            

                                String query2 = "INSERT INTO voiture VALUES (?,?,?,?,?,?,?)";

                                try (PreparedStatement stmt1 = con.prepareStatement(query2)) {
                                    stmt1.setString(1, matriculeV);
                                    stmt1.setString(2, marqueV);
                                    stmt1.setString(3, modelV);
                                    stmt1.setString(4, etat);
                                    stmt1.setString(5, disp);
                                    stmt1.setString(6, prixV);
                                    stmt1.setString(7, "0");

                                    stmt1.executeUpdate();
                                    System.out.println("Data inserted successfully into car table.");
                                    JOptionPane.showMessageDialog(null," CAR ADDDED !!!");

                                } catch (SQLException e) {
                                    System.out.println("Error inserting data into voiture table: " + e.getMessage());
                                }
                            }

                        }

                     catch (SQLException ex) {
                        Logger.getLogger(advoiture.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    
                }
                }
            }
        
    }//GEN-LAST:event_confirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField marque;
    private javax.swing.JTextField matricule;
    private javax.swing.JTextField model;
    private javax.swing.JTextField prix;
    // End of variables declaration//GEN-END:variables
}
