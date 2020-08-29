USE bdfactura;
DELIMITER //
create procedure pa_insertarItems
	( 
	IN p_concepto varchar(50),
	IN p_Punitario int, 
    IN p_cantidad int, 
    IN p_Tcantidad int,
    IN p_nitems int,
    IN p_subtotal int,
    IN p_iva int,
    IN p_total int
	)
	BEGIN				
			INSERT INTO tbl_factura(concepto, P_unitario, cantidad, T_cantidad, n_items, subtotal, iva, total )
						VALUES (p_concepto, p_Punitario, p_cantidad, p_Tcantidad, p_nitems, p_subtotal, p_iva, p_total);	
	END//
DELIMITER ;        


