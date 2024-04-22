SET sql_safe_updates=0;


create database best_cars;
use  best_cars ;

CREATE TABLE administrateur (
    username VARCHAR(20) PRIMARY KEY,
    mot_de_pass VARCHAR(20)
);

CREATE TABLE client (
    CIN VARCHAR(8) PRIMARY KEY,
    nom VARCHAR(20),
    prenom VARCHAR(20),
    username VARCHAR(20),
    date_de_naissance DATE,
    email VARCHAR(45),
    tel VARCHAR(20) ,
    addresse VARCHAR(40),
    mot_de_pass VARCHAR(20)
);

CREATE TABLE banned (
    CIN VARCHAR(8) PRIMARY KEY,
    constraint foreign key (cin) references client(cin) on delete cascade
);

CREATE TABLE voiture (
    matricule VARCHAR(8) PRIMARY KEY,
    marque VARCHAR(20),
    model VARCHAR(20),
    etat VARCHAR(20),
	disponibilite VARCHAR(20),
	prix float,
    nb_fois_louee int
);


CREATE TABLE mecanicien (
    CIN VARCHAR(8) PRIMARY KEY,
    nom VARCHAR(20),
    prenom VARCHAR(20),
    username VARCHAR(20),
    date_de_naissance DATE,
    email VARCHAR(45),
    tel VARCHAR(20) ,
    addresse VARCHAR(40),
    mot_de_pass VARCHAR(20),
    salaire double
);

CREATE TABLE location(
	ID int PRIMARY KEY,
    CIN VARCHAR(8) ,
    matricule varchar(8),
    date_debut date,
    date_fin date,
    date_retour date,
    total int,
    num_carte_bancaire varchar(16),
    date_paiment date,
    constraint foreign key (cin) references client(cin) on delete set null,
    constraint foreign key (matricule) references voiture(matricule) on delete set null 
);
create table remboursement (
    id_location int primary key,
    montant double,
    date_remboursement date,
    constraint foreign key (id_location) references location (id)
);

