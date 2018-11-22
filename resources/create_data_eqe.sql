drop database IF EXISTS  eqe;

create database eqe;

use eqe;

DROP TABLE IF EXISTS medicos;

CREATE TABLE medicos (
id_medico INT NOT NULL,
nombre CHAR(50) NOT NULL,
ap_pat CHAR (50) NOT NULL,
ap_mat CHAR (50) NOT NULL,
especialidad CHAR (50) NOT NULL,
cedula CHAR (50) NOT NULL,
tipo_institucion CHAR (50) NOT NULL,
unidad_admin CHAR (50) NOT NULL,
area CHAR (50) NOT NULL,
email CHAR (50) NOT NULL,
telefono CHAR (50) NOT NULL,
contrasena CHAR (50) NOT NULL,

PRIMARY KEY (id_medico)
);

INSERT INTO medicos VALUES (1,'Ana', 'Najera','Anguiano','Neurocirujano','2015601009','Privado','Unidad de Enfermedades Neuronales','Depto de Enfermedades raras','ana@makingdevs.com','57010772','aSkTy78');
INSERT INTO medicos VALUES (2,'Cecilia','Ramos','Monter','Internista','2015601809','Publico','IMSS','Depto de Diagnostico','cecilia@makingdevs.com','57012379','09kFty6');
INSERT INTO medicos VALUES (3,'Rocio','Villareal','Villareal','Internista','2011408329','Privado','ISSTE','Medicina Especializada','rocio@isste.com','56899015','85C0T3Dd');
INSERT INTO medicos VALUES (4, 'Arturo','Cebreros','Solis','Neurocirujano','2013462075','Publico','Centro de Salud Sur','Area Medica Especial','arturo@csm.com','58765230','mmGFT67Y');
INSERT INTO medicos VALUES (5, 'Abel','Bueno','Bueno','Internista','2010376540','Publico','Medica Sur','Medicina Especial','abel@ipn.mx','57009834','yt568fThg');

DROP TABLE IF EXISTS pacientes;

CREATE TABLE pacientes (
id_paciente INT NOT NULL,
nombre_paciente CHAR (50) NOT NULL,
apellido_paterno CHAR (50) NOT NULL,
apellido_materno CHAR (50) NOT NULL,
fecha_nacimiento DATETIME NOT NULL,
sexo CHAR (15) NOT NULL,
aseguradora CHAR (50) NOT NULL,

PRIMARY KEY (id_paciente)

);

INSERT INTO pacientes VALUES (1,'Antonio','Hernandez','Herrera','1996-08-20','masculino','Seguro Popular');
INSERT INTO pacientes VALUES (2,'Juan','Chavez','Lopez','1969-11-30','masculino','Metlife');
INSERT INTO pacientes VALUES (3,'Aurora','Martinez','Guzman','1980-01-07','femenino','Seguro Popular');
