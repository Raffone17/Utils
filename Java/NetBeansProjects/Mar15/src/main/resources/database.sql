DROP DATABASE IF EXISTS `mar31`;
CREATE DATABASE `mar31` DEFAULT CHARSET=utf8;
USE `mar31`;

CREATE TABLE `cliente` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `nome` VARCHAR(255) NOT NULL,
    `cognome` VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

INSERT INTO `cliente` (`nome`,`cognome`)
    VALUES ('Lucio','Crusca');
INSERT INTO `cliente` (`nome`,`cognome`)
    VALUES ('Ariful','Md');
INSERT INTO `cliente` (`nome`,`cognome`)
    VALUES ('Raffone','IlBello');

CREATE TABLE `lapide` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `nome` VARCHAR(255) NOT NULL,
    `cognome` VARCHAR(255) NOT NULL,
    `data_nascita` DATE ,
    `data_morte` DATE ,
    `epitaffio` VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

INSERT INTO `lapide` (`nome`,`cognome`,`data_nascita`,`data_morte`,`epitaffio`)
    VALUES ('Ariful','Md','1992-07-29','2088-06-13','E stato un personaggio molto interessante');

CREATE TABLE `funerale` (
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `id_cliente` INTEGER,
    `id_lapide` INTEGER,
    `data_funerale` DATE,
    CONSTRAINT FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    CONSTRAINT FOREIGN KEY (id_lapide) REFERENCES lapide(id) 
) ENGINE=InnoDB;

INSERT INTO `funerale` (`id_cliente`,`id_lapide`,`data_funerale`)
VALUES (1,1,'2088-06-22');