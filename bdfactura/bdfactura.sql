-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-08-2020 a las 18:53:54
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdfactura`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `pa_editarItems` (IN `p_id` INT, IN `p_concepto` VARCHAR(50), IN `p_Punitario` DOUBLE, IN `p_cantidad` DOUBLE, IN `p_Tcantidad` DOUBLE, IN `p_nitems` DOUBLE, IN `p_subtotal` DOUBLE, IN `p_iva` DOUBLE, IN `p_total` DOUBLE, OUT `success` BOOLEAN)  BEGIN
		IF EXISTS ( SELECT b.id
						FROM tbl_factura AS b 
						WHERE b.idProd = p_id) THEN
						
			UPDATE tbl_factura set concepto = p_concepto, P_unitario = p_Punitario, cantidad = p_cantidad, T_cantidad = p_Tcantidad, n_items = p_nitems, subtotal =     		  p_subtotal, iva = p_iva, total = p_total 
			WHERE id = p_id;

			set success = true;
		ELSE
			SELECT 'No existe en la base de datos!';
			set success = false;
		END IF;
		
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pa_eliminarItems` (IN `p_id` INT, OUT `success` BOOLEAN)  BEGIN

		IF EXISTS ( SELECT b.id 
						FROM tbl_factura AS b 
						WHERE b.id = p_id) THEN
						
			DELETE FROM tbl_factura 
			WHERE id = p_id;

			set success = true;
		ELSE
			SELECT 'No existe en la base de datos!';
			set success = false;
		END IF;
		
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pa_eliminarTodo` ()  BEGIN				
			DELETE FROM tbl_factura; 		
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pa_insertarItems` (IN `p_concepto` VARCHAR(50), IN `p_Punitario` DOUBLE, IN `p_cantidad` DOUBLE, IN `p_Tcantidad` DOUBLE, IN `p_nitems` DOUBLE, IN `p_subtotal` DOUBLE, IN `p_iva` DOUBLE, IN `p_total` DOUBLE)  BEGIN				
			INSERT INTO tbl_factura(concepto, P_unitario, cantidad, T_cantidad, n_items, subtotal, iva, total )
						VALUES (p_concepto, p_Punitario, p_cantidad, p_Tcantidad, p_nitems, p_subtotal, p_iva, p_total);	
	END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `pa_modificaFactura` (IN `p_id` INT, OUT `success` BOOLEAN)  BEGIN

		IF EXISTS ( SELECT b.id 
						FROM tbl_factura AS b 
						WHERE b.id = p_id) THEN

			set success = true;
		ELSE
			SELECT 'No existe en la base de datos!';
			set success = false;
		END IF;
		
	END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_factura`
--

CREATE TABLE `tbl_factura` (
  `id` int(11) NOT NULL,
  `concepto` varchar(50) DEFAULT NULL,
  `P_unitario` double DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `T_cantidad` double DEFAULT NULL,
  `n_items` double DEFAULT NULL,
  `subtotal` double DEFAULT NULL,
  `iva` double DEFAULT NULL,
  `total` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_factura`
--
ALTER TABLE `tbl_factura`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
