/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.sql.Date;

/**
 *
 * @author
 */
public class Factura {
    private int id;
    private String concepto;
    private double P_unitario;
    private double cantidad;
    private double T_cantidad;
    private double n_items;
    private double subtotal;
    private double iva;
    private double total;

    public Factura() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the P_unitario
     */
    public double getP_unitario() {
        return P_unitario;
    }

    /**
     * @param P_unitario the P_unitario to set
     */
    public void setP_unitario(double P_unitario) {
        this.P_unitario = P_unitario;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the T_cantidad
     */
    public double getT_cantidad() {
        return T_cantidad;
    }

    /**
     * @param T_cantidad the T_cantidad to set
     */
    public void setT_cantidad(double T_cantidad) {
        this.T_cantidad = T_cantidad;
    }

    /**
     * @return the n_items
     */
    public double getN_items() {
        return n_items;
    }

    /**
     * @param n_items the n_items to set
     */
    public void setN_items(double n_items) {
        this.n_items = n_items;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }


}