/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author
 */
public class DataBase {
    private Connection conexion;
    private Statement sql;

    
    private ResultSet datos;

    public ResultSet getDatos() {
        return datos;
    }
    
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    private boolean cargarControlador(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error...No se cargó el controlador de Bases de Datos " + ex.getMessage());
            return false;
        }
    }
         
    public boolean conectar(){
        this.cargarControlador();
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdfactura"+"?useSSL=true", "root", "");
            this.sql= this.conexion.createStatement();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error...No hay conexión con la Base de Datos " + ex.getMessage());
            return false;
        }
    }
    
    public void desconectar(){
        try {
            this.sql.close();
            this.conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión con la Base de Datos " + ex.getMessage());
        }
    }
    
    public void ejecutarSqlSelect(String consulta){
        this.conectar();
        try {
            this.datos=this.sql.executeQuery(consulta);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar consulta Select " + ex.getMessage());
        }
        //this.desconectar();   
    }
    
    public void ejecutarSqlUpdate(String sql){
        this.conectar();
        try {
            this.sql.executeUpdate(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error al ejecutar consulta de actualización de datos " + ex.getMessage());
        }
        this.desconectar();
    }
    
    public ResultSet obtenerRegistro(){
        try {
            this.datos.first();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.datos;
    }   
}
