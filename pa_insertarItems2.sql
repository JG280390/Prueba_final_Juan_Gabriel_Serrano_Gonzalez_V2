USE bdfactura;
DELIMITER //
create procedure pa_insertarItems
	( 
	IN p_concepto varchar(50),
	IN p_Punitario double, 
    IN p_cantidad double, 
    IN p_Tcantidad double,
    IN p_nitems double,
    IN p_subtotal double,
    IN p_iva double,
    IN p_total double
	)
	BEGIN				
			INSERT INTO tbl_factura(concepto, P_unitario, cantidad, T_cantidad, n_items, subtotal, iva, total )
						VALUES (p_concepto, p_Punitario, p_cantidad, p_Tcantidad, p_nitems, p_subtotal, p_iva, p_total);	
	END//
DELIMITER ;   

