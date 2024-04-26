/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Mecanicien;
import java.sql.*;
import ig.Connecteur;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ListePanne extends javax.swing.JInternalFrame {
    private javax.swing.JDesktopPane jDesktopPane1;
    /**
     * Creates new form ListePanne
     */
    public ListePanne() {
        initComponents();
    }
    public ListePanne(javax.swing.JDesktopPane jDesktopPane1) {
        
        this.jDesktopPane1=jDesktopPane1;
        initComponents();
        load();
    }
    private Connection con ; 
    public void load(){
        Connecteur connect=new Connecteur();
       
        con = connect.connecttodb();
        String query = "SELECT * FROM voiture WHERE ETAT ='en panne'";
        DefaultTableModel tablemodel =(DefaultTableModel) table.getModel();
        tablemodel.setRowCount(0);
        try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query);
            
            while(res.next()){
                String matricule = res.getString("matricule");
                String marque = res.getString("marque");
                String model = res.getString("model");
                String etat = res.getString("etat");
                tablemodel.addRow(new Object[]{matricule,marque,model,etat});
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ListePanne.class.getName()).log(Level.SEVERE, null, ex);
        }       
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
        table = new javax.swing.JTable();
        recherche = new javax.swing.JButton();
        repare = new javax.swing.JButton();
        marque_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        refresh1 = new javax.swing.JButton();
        matricule_field = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "matricule", "Marque", "Model", "Etat"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        recherche.setBackground(new java.awt.Color(255, 255, 102));
        recherche.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        recherche.setText("RECHERCHER");
        recherche.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });

        repare.setBackground(new java.awt.Color(255, 255, 102));
        repare.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        repare.setText("REPARER");
        repare.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        repare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repareActionPerformed(evt);
            }
        });

        marque_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        marque_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marque_fieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel1.setText("Matricule :");

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        jLabel2.setText("Marque :");

        refresh1.setBackground(new java.awt.Color(255, 255, 102));
        refresh1.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        refresh1.setText("Refresh");
        refresh1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });

        matricule_field.setBackground(new java.awt.Color(197, 33, 33));
        matricule_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Best_cars\\images\\brokencar.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marque_field, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(matricule_field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(repare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(recherche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matricule_field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repare, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(marque_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marque_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marque_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marque_fieldActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        String marque = marque_field.getText();
        String query = "SELECT * FROM voiture WHERE ETAT ='panne' and marque = '"+marque+"'";
        DefaultTableModel tablemodel =(DefaultTableModel) table.getModel();
        tablemodel.setRowCount(0);
        try {
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query);
            
            while(res.next()){
                String matricule = res.getString("matricule");
                marque = res.getString("marque");
                String model = res.getString("model");
                String etat = res.getString("etat");
                tablemodel.addRow(new Object[]{matricule,marque,model,etat});
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ListePanne.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_rechercheActionPerformed

    private void repareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repareActionPerformed
        String matricule =matricule_field.getText();
        String query=" UPDATE voiture SET etat='en marche' WHERE matricule='"+matricule+"'";
        Statement stmt;
        try {
            stmt = con.createStatement();
            stmt.execute(query);
            JOptionPane.showMessageDialog(null,"voiture ( MATRICULE = "+matricule+") est reparee  !!!");
            matricule_field.setText("");
            
        } catch (SQLException ex) {
            Logger.getLogger(ListePanne.class.getName()).log(Level.SEVERE, null, ex);
        }
        load();
    }//GEN-LAST:event_repareActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        load();
    }//GEN-LAST:event_refresh1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        String matricule =(String) model.getValueAt(row, 0);
        matricule_field.setText(matricule);
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marque_field;
    private javax.swing.JLabel matricule_field;
    private javax.swing.JButton recherche;
    private javax.swing.JButton refresh1;
    private javax.swing.JButton repare;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}