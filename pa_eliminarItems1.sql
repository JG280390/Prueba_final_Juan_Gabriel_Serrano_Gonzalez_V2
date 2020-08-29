USE bdfactura;
DELIMITER //
create procedure pa_eliminarItems
	(
	IN p_id int, 
	OUT success boolean
	)
	
	BEGIN

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
		
	END//

DELIMITER ;      


