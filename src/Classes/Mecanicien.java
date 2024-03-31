/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/////////////////////////////////////////////////

/**
 *
 * @author DELL
 */
public class Mecanicien  extends  Personne {
    double salaire;
    public Mecanicien(String cin, String nom, String prenom, String email, Date date_de_naissance, String username, String tel, String address, String mot_de_pass,double salaire) {
        super(cin, nom, prenom, email, date_de_naissance, username, tel, address, mot_de_pass);  
        this.salaire=salaire;
    }    
    void setsalaire(double x){
        this.salaire=x;
    }
    double getsalaire(){
        return this.salaire;
    }
    
}
