/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import POO.Factura;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author
 */
public class FacturaModel {

    public boolean insertarFactura(Factura factura) {

        DataBase bd = new DataBase();
        try {
            bd.conectar();
            CallableStatement cst
                    = bd.getConexion().prepareCall("{call pa_insertarItems(?,?,?,?,?,?,?,?)}");
            // Parametro de entrada del procedimiento almacenado
            cst.setString(1, factura.getConcepto());
            cst.setDouble(2, factura.getP_unitario());
            cst.setDouble(3, factura.getCantidad());
            cst.setDouble(4, factura.getT_cantidad());
            cst.setDouble(5, factura.getN_items());
            cst.setDouble(5, factura.getSubtotal());
            cst.setDouble(7, factura.getIva());
            cst.setDouble(8, factura.getTotal());

            // Ejecuta el procedimiento almacenado
            int fa = cst.executeUpdate();

            if (fa>0) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        } finally {
            // cerrar la conexion
            bd.desconectar();
        }
        //return false;
    }
/************************************************************************************************/
    public boolean editarFactura(Factura factura) {
        DataBase bd = new DataBase();
        try {
            bd.conectar();
            CallableStatement cst
                    = bd.getConexion().prepareCall("{call pa_editarItems(?,?,?,?,?,?,?,?,?,?)}");
            // Parametro de entrada del procedimiento almacenado
            cst.setInt(1, factura.getId());
            cst.setString(2, factura.getConcepto());
            cst.setDouble(3, factura.getP_unitario());
            cst.setDouble(4, factura.getCantidad());
            cst.setDouble(5, factura.getT_cantidad());
            cst.setDouble(6, factura.getN_items());
            cst.setDouble(7, factura.getSubtotal());
            cst.setDouble(8, factura.getIva());
            cst.setDouble(9, factura.getTotal());
            // Definimos los tipos de los parametros de salida del procedimiento almacenado
            cst.registerOutParameter(10, java.sql.Types.BOOLEAN);

            // Ejecuta el procedimiento almacenado
            cst.execute();

            //Si actualiza
            if (cst.getBoolean(10)) {
                return true;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            // cerrar la conexion
            bd.desconectar();
        }
        return false;
    }
    
    public boolean eliminarFactura(String id) {
        DataBase bd = new DataBase();
        try {
            bd.conectar();
            CallableStatement cst
                    = bd.getConexion().prepareCall("{call pa_eliminarBus(?,?)}");
            // Parametro de entrada del procedimiento almacenado
            cst.setString(1, id);
            
            // Definimos los tipos de los parametros de salida del procedimiento almacenado
            cst.registerOutParameter(2, java.sql.Types.BOOLEAN);

            // Ejecuta el procedimiento almacenado
            cst.execute();

            //Si actualiza
            if (cst.getBoolean(2)) {
                return true;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            // cerrar la conexion
            bd.desconectar();
        }
        return false;
    }
    
    public boolean eliminarTodoFactura() {
        DataBase bd = new DataBase();
        try {
            bd.conectar();
            CallableStatement cst
                    = bd.getConexion().prepareCall("{call pa_eliminarTodo()}");
            
            // Ejecuta el procedimiento almacenado
            cst.execute();

            //Si actualiza
            //if (cst.getBoolean(2)) {
                return true;
            //}
        } catch (SQLException e) {
            // cerrar la conexion
            bd.desconectar();
        }
        return false;
    }
    
    public boolean modificaFactura(String id) {
        DataBase bd = new DataBase();
        try {
            bd.conectar();
            CallableStatement cst
                    = bd.getConexion().prepareCall("{call pa_modificaFactura(?,?)}");
            // Parametro de entrada del procedimiento almacenado
            cst.setString(1, id);
            
            // Definimos los tipos de los parametros de salida del procedimiento almacenado
            cst.registerOutParameter(2, java.sql.Types.BOOLEAN);

            // Ejecuta el procedimiento almacenado
            cst.execute();

            //Si Modifica
            if (cst.getBoolean(2)) {
                return true;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            // cerrar la conexion
            bd.desconectar();
        }
        return false;
    }
    
}