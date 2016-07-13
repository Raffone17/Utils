DROP DATABASE IF EXISTS `prova_tecnico`;
CREATE DATABASE `prova_tecnico` DEFAULT CHARSET=utf8;
USE `prova_tecnico`;
CREATE TABLE `articolo`(
    `id` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `codice` VARCHAR(255) NOT NULL ,  
    `descrizione` text NOT NULL ,
    `peso` double NOT NULL 
)ENGINE=InnoDB;

INSERT INTO `articolo` (`codice`,`descrizione`,`peso`)
    VALUES('PNDRV8','Pen drive USB 8G no brand ',0.15);
INSERT INTO `articolo` (`codice`,`descrizione`,`peso`)
    VALUES('DCP-J715E','Stampante Brother DCP J715 W',5.3);
INSERT INTO `articolo` (`codice`,`descrizione`,`peso`)
    VALUES('LNVCX1 ','Notebook Lenovo Carbon X1 ',  1.9);
INSERT INTO `articolo` (`codice`,`descrizione`,`peso`)
    VALUES('ALCPPC3','Smartphone Alcatel POP C3',0.53);
INSERT INTO `articolo` (`codice`,`descrizione`,`peso`)
    VALUES('BSHT1R','Ampli Combo valvolare BlackStar HT 1-R',6);

CREATE TABLE `ordine`(`id` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `numero` INT NOT NULL ,  
    `data` DATE NOT NULL 
 
      
)ENGINE=InnoDB;


INSERT INTO `ordine` (`numero`,`data`)
    VALUES(136,'2015-02-01');
INSERT INTO `ordine` (`numero`,`data`)
    VALUES(164,'2015-02-18');
INSERT INTO `ordine` (`numero`,`data`)
    VALUES(237,'2015-03-05');
INSERT INTO `ordine` (`numero`,`data`)
    VALUES(268,'2015-03-12');
INSERT INTO `ordine` (`numero`,`data`)
    VALUES(319,'2015-03-26');
INSERT INTO `ordine` (`numero`,`data`)
    VALUES(422,'2015-04-02');
INSERT INTO `ordine` (`numero`,`data`)
    VALUES(468,'2015-04-14');
INSERT INTO `ordine` (`numero`,`data`)
    VALUES(496,'2015-04-23');
INSERT INTO `ordine` (`numero`,`data`)
    VALUES(532,'2015-04-26');

CREATE TABLE `tariffe_corriere`(`id` INTEGER AUTO_INCREMENT PRIMARY KEY,
            `nome_corriere` VARCHAR(255) NOT NULL,
            `nome_tariffa`  VARCHAR(255) NOT NULL,
            `peso_massimo` double  NOT NULL,
            `costo` double NOT NULL 
       
    )ENGINE=InnoDB;


INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('SDA','Economy',1,5.90);

INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('SDA','Veloce ',5,7.90);

INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('SDA','Bigbox ',30,12.90);

INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('DHL','Veloce ',1.5,6.50);

INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('DHL ','Assicurata ',7.5,9.90);

INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('DHL','XXL ',40,13.90);

INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('UPS','Economy',0.7,5.20);

INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('UPS','Standard ',3,6.90);

INSERT INTO `tariffe_corriere`(`nome_corriere`,`nome_tariffa`,`peso_massimo`,`costo`)
VALUES('UPS','Jumbo ',25,11.50);


CREATE TABLE `voce`(`id` INTEGER AUTO_INCREMENT PRIMARY KEY,
            
            `id_ordine` INTEGER NOT NULL,
            `id_articolo` INTEGER NOT NULL,
            `quantita` double  NOT NULL,
             CONSTRAINT FOREIGN KEY (id_ordine) REFERENCES ordine(id) ,
             CONSTRAINT FOREIGN KEY (id_articolo) REFERENCES articolo(id) 
         
    )ENGINE=InnoDB;

    INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
    VALUES(1,3,2);


INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(2,2,1);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(2,3,1);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(3,3,1);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(3,4,1);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(4,1,2);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(4,4,1);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(5,4,2);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(5,1,1);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(6,1,3);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(7,2,7);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(8,5,1);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(8,3,1);

INSERT INTO `voce`(`id_ordine`,`id_articolo`,`quantita`)
VALUES(9,5,6);





