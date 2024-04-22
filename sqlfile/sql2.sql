
SET sql_safe_updates=0;
create database best_cars;
use  best_cars ;

CREATE TABLE administrateur (
    username VARCHAR(20) PRIMARY KEY,
    mot_de_pass VARCHAR(20)
);

INSERT INTO administrateur VALUES(
	'Admin0','0000'
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
	ID INT AUTO_INCREMENT PRIMARY KEY,
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

 SELECT *
 FROM voiture V LEFT JOIN location L on V.matricule = L.matricule 
 WHERE V.marque ='A' and V.model = 'A1' AND (V.etat = 'disponible' or V.etat = 'reserve')  AND CURDATE() < L.date_fin AND L.date_fin < '2024-04-06'
 and V.matricule not in (
	select L2.matricule
    from location L2
    where  (L2.date_debut <= '2024-04-06' and '2024-04-06' <= L2.date_fin) or (L2.date_debut <= '2024-04-09' and '2024-04-09'<= L2.date_fin) 
    or (L2.date_debut <= '2024-04-06'  and '2024-04-09'<= L2.date_fin) or (L2.date_debut >= '2024-04-06'  and '2024-04-09'<= L2.date_fin)
)
order by V.etat desc;

select * 
from voiture V left join location L on V.matricule = L.matricule 
where V.disponibilite='disponible';
-- where V.marque ='fouart' and V.model='madyouni' and (V.etat='disponible' or V.etat='reserve')  and (L.id is null or  ( CURDATE() < L.date_fin and L.date_fin < '2024-03-01'));

create table remboursement (
    id_location int primary key,
    montant double,
    date_remboursement date,
    constraint foreign key (id_location) references location (id)
);



create table penalite (
    id_location int primary key,
    montant double,
    num_carte_bancaire varchar(16),
    constraint foreign key (id_location) references location (id)
);




