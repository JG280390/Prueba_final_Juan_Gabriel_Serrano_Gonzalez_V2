USE bdfactura;
DELIMITER //
create procedure pa_eliminarTodo()
	
	BEGIN				
			DELETE FROM tbl_factura; 		
	END//

DELIMITER ;      


