/*Elimina bdfactura si esta ya Existe*/
DROP DATABASE IF EXISTS `bdfactura`;
/*Creamos la Base de Datos*/
CREATE DATABASE `bdfactura`;
/* Entrando a la sesión "LocalMariaDB" */
SHOW DATABASES;
/*Le decimos que use la bdfactura*/
USE `bdfactura`;
SHOW ENGINES;
--Creamos la TABLA Tbl_Factura--
CREATE TABLE `Tbl_Factura` (
	`id` INT NOT NULL,
	`concepto` VARCHAR(50) NULL DEFAULT NULL,
	`P_unitario` INT NULL DEFAULT NULL,
	`cantidad` INT NULL DEFAULT NULL,
	`T_cantidad` INT NULL DEFAULT NULL,
	`n_items` INT NULL DEFAULT NULL,
	`subtotal` INT NULL DEFAULT NULL,
	`iva` INT NULL DEFAULT NULL,
	`total` INT NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8mb4_general_ci';