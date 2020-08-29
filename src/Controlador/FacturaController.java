/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import POO.Factura;
import Modelo.FacturaModel;

/**
 *
 * @author
 */
public class FacturaController {
    public boolean insertarFactura(Factura factura){
        FacturaModel model = new FacturaModel();
        return model.insertarFactura(factura);
    }
    
    public boolean editarFactura(Factura factura){
        FacturaModel model = new FacturaModel();
        return model.editarFactura(factura);
    }
    
    public boolean eliminarFactura(String id){
        FacturaModel model = new FacturaModel();
        return model.eliminarFactura(id);
    }
    
    public boolean eliminarTodoFactura(){
        FacturaModel model = new FacturaModel();
        return model.eliminarTodoFactura();
    }
        
    public boolean modificaFactura(String id){
        FacturaModel model = new FacturaModel();
        return model.modificaFactura(id);
    }

    
}
