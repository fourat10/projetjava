SET sql_safe_updates=0;


create database best_cars;
use  best_cars ;

CREATE TABLE administrateur (
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
select * from administrateur where username='admin0';


INSERT INTO administrateur VALUES(
	'00000000','Admin0','Admin0','Admin0',NULL,NULL,NULL,NULL,'0000'
);

select *
from administrateur;
------------------------------------------------------

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

delete from client;

drop table client;


select * from client;
DELETE FROM client
WHERE nom = 'zzz';


DROP TABLE visiteur;

CREATE TABLE banned (
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
INSERT INTO banned values('12345678','adem','madyouni','adem123','2024-03-26','ademmmpp@gmail.com','56565656','jendouba 7ay tatawer','adem1234');

select * from banned;

CREATE TABLE voiture (
    matricule VARCHAR(8) PRIMARY KEY,
    marque VARCHAR(20),
    model VARCHAR(20),
    etat VARCHAR(20),
	prix float,
    nb_fois_louee int
);

insert into voiture values ('11111111','adem','madyouni','panne',5555.5,0);
insert into voiture values ('18787871','adem','madyouni','panne',5555.5,0);
insert into voiture values ('7777','adem','madyouni','panne',5555.5,0);
insert into voiture values ('444444','fouart','madyouni','panne',5555.5,0);
insert into voiture values ('1478521','fouart','madyouni','en attente',5555.5,0);
insert into voiture values ('45','fouart','madyouni','en attente',5555.5,0);
insert into voiture values ('78','fouart','madyouni','en attente',5555.5,0);
insert into voiture values ('669','fouart','madyouni','en attente',5555.5,0);
insert into voiture values ('114','fouart','madyouni','en attente',5555.5,0);

insert into voiture values ('22222222','abdrazak','madyouni','disponible',7777.3,69);

delete from voiture;

select * from voiture;

-- ALTER TABLE mecanicien add column salaire double ;

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
INSERT INTO mecanicien values('12345678','adem','madyouni','adem123','2024-03-26','ademmmpp@gmail.com','56565656','jendouba 7ay tatawer','adem1234');

CREATE TABLE location(
	ID int PRIMARY KEY,
    CIN VARCHAR(8) REFERENCES client(CIN),
    matricule varchar(8) REFERENCES  voiture(matricule),
    date_debut date,
    date_fin date,
    date_retour date
);

CREATE TABLE paiment(
	ID int  REFERENCES location(CIN),
    CIN VARCHAR(8) REFERENCES client(CIN),
	total int,
    num_carte_bancaire varchar(16),
    date_paiment date,
    constraint pk primary key(ID,CIN)
);


---------------------------------
