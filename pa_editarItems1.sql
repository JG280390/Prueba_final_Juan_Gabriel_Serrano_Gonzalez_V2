USE bdfactura;
DELIMITER //
create procedure pa_editarItems
	(
	IN p_id int, 
    IN p_concepto varchar(50),
	IN p_Punitario double, 
    IN p_cantidad double, 
    IN p_Tcantidad double,
    IN p_nitems double,
    IN p_subtotal double,
    IN p_iva double,
    IN p_total double,
    OUT success boolean
	)
	BEGIN
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
		
	END//

DELIMITER ;        


