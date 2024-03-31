
package Classes;

import java.util.Date;


public class Personne {
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private Date date_de_naissance;
    private String username;
    private String tel;
    private String address;
    private String mot_de_pass;
    
    
    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public String getUsername() {
        return username;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    public String getMot_de_pass() {
        return mot_de_pass;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMot_de_pass(String mot_de_pass) {
        this.mot_de_pass = mot_de_pass;
    }

    public Personne(String cin, String nom, String prenom, String email, Date date_de_naissance, String username, String tel, String address, String mot_de_pass) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date_de_naissance = date_de_naissance;
        this.username = username;
        this.tel = tel;
        this.address = address;
        this.mot_de_pass = mot_de_pass;
    }
    public String toString() {
        return "Personne{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", date_de_naissance=" + date_de_naissance +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", mot_de_pass='" + mot_de_pass + '\'' +
                '}';
    }
}


