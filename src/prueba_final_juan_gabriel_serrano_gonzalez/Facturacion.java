
package prueba_final_juan_gabriel_serrano_gonzalez;

import Controlador.FacturaController;
import POO.Factura;
import java.awt.Color;
 import java.sql.*;// se importan la bibliotecas de SQl
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Facturacion extends javax.swing.JFrame {
    FacturaController facturaController = new FacturaController();
    int operacion = 1;
    double impue = 13;
    double iva = 0.15;//15% dividido entre 100 igual 0.15
    double totaliva = 0;
    double tt = 0;
    double totalprecio = 0;
    double contitem = 0;
    double sutotal = 0;
    double precioante = 0;
    double cantidadante = 0;
    
    Factura factura;
    
    DefaultListModel Listfactura = new DefaultListModel();
    DefaultListModel Listprecio = new DefaultListModel();
    DefaultListModel Listcantidad = new DefaultListModel();
    DefaultListModel Listtotal = new DefaultListModel();
    
    public Facturacion() {
        initComponents();
        this.setLocationRelativeTo(null);//hhhh
        txt_totales_iva.setText("13"); //VALOR ESTATICO DEL IVA*********
        /*Concepto*/
        Listfactura = new DefaultListModel();
        jList_Conceptos.setModel(Listfactura);
        /*Precio*/
        Listprecio = new DefaultListModel();
        jList_Precio.setModel(Listprecio);
        /*Cantidad*/
        Listcantidad = new DefaultListModel();
        jList_Cantidad.setModel(Listcantidad);
        /*Total*/
        Listtotal = new DefaultListModel();
        jList_Total.setModel(Listtotal);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Añadir = new javax.swing.JButton();
        txt_cantidad = new javax.swing.JTextField();
        txt_concepto = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Conceptos = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_Precio = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_Total = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_Cantidad = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_item_Eliminar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Eliminar_precio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_Eliminar_cantidad = new javax.swing.JTextField();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_totals_numeItem = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_totales_Subtotales = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_totales_iva = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_totales_total = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        txt_total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Concepto");

        jLabel2.setText("Precio Unitario");

        jLabel3.setText("Cantidad");

        btn_Añadir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btn_Añadir.setText("Añadir");
        btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AñadirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Inserte Item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_concepto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Añadir)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_concepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Añadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Listado Facturacion");

        jLabel6.setText("Concepto.");

        jScrollPane1.setViewportView(jList_Conceptos);

        jLabel17.setText("Precio.");

        jLabel18.setText("Cantidad.");

        jLabel19.setText("Total.");

        jScrollPane2.setViewportView(jList_Precio);

        jScrollPane3.setViewportView(jList_Total);

        jScrollPane4.setViewportView(jList_Cantidad);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Eliminar Item.");

        jLabel8.setText("Item.");

        txt_item_Eliminar.setText("Status");

        jLabel9.setText("Precio.");

        jLabel11.setText("Cantidad.");

        btn_Modificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        btn_Modificar.setText("Modificar Item.");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar Item.");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Totales");

        jLabel12.setText("Numeros de Items.");

        jLabel13.setText("Subtotales.");

        jLabel14.setText("IVA.");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("%");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Total.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_totals_numeItem)
                            .addComponent(txt_totales_Subtotales)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_totales_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_totales_total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_totals_numeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txt_totales_Subtotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_totales_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_totales_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        btn_Buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_Buscar.setText("Buscar.");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_Eliminar_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Eliminar_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_item_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(btn_Buscar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_Modificar)
                                .addGap(38, 38, 38)
                                .addComponent(btn_Eliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_item_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_Eliminar_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txt_Eliminar_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_Buscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addGap(5, 5, 5)
                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AñadirActionPerformed
        if (txt_concepto.getText().equals("") == false && txt_precio.getText().equals("") == false && txt_cantidad.getText().equals("") == false) {
            //Hacemos el insert

            if (operacion == 1) { //Se agrega un nuevo registro
                setObjFactura();
                if (facturaController.insertarFactura(factura)) {
                    insertvariables();
                    JOptionPane.showMessageDialog(this, "Registro Insertado");                    
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Error al insertar");
                }
            /******************************************************************/   
            } else { //Se edita el registro seleccionado
                setObjFacturau();
                if (facturaController.editarFactura(factura)) {
                    /*Subtotales*/
                    String subto=Double.toString(sutotal);
                    txt_totales_Subtotales.setText(subto);
                    /*Total*/
                    String totalidad=Double.toString(tt);
                    txt_totales_total.setText(totalidad);
                    
                    int mod = Integer.parseInt(txt_item_Eliminar.getText());
                    txt_total.setText(String.valueOf(totalprecio));
                    
                    jList_Conceptos.add(this.txt_concepto, mod);
                    jList_Precio.add(this.txt_precio, mod);
                    jList_Cantidad.add(this.txt_cantidad, mod);
                    jList_Total.add(this.txt_total, mod);
                    JOptionPane.showMessageDialog(this, "Registro Actualizado");
                    operacion = 1;
                } else {
                    JOptionPane.showMessageDialog(this, "Error al Editar");
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
        }        
        
    }//GEN-LAST:event_btn_AñadirActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bsd_facturaccion", "root","");
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM FACTURACCION WHERE CONCEPTO = ?");
            pst.setString(1, txt_item_Eliminar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_concepto.setText(rs.getString("Concepto"));
                txt_precio.setText(rs.getString("Precio Unitario"));
                txt_cantidad.setText(rs.getString("Cantidad"));
                  
            }else{
                JOptionPane.showInputDialog(null,"Copcepto no registrado");
            }
   
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        // TODO add your handling code here:
        if (txt_item_Eliminar.getText().equals("") == false){

            facturaController = new FacturaController();

                if (facturaController.eliminarFactura(txt_item_Eliminar.getText())) {
                    /*Subtotales*/
                    int ubisut = Integer.parseInt(txt_item_Eliminar.getText());
                    totalprecio = Double.parseDouble(jList_Total.getModel().getElementAt(ubisut));
                    sutotal = sutotal+totalprecio;
                    String subto=Double.toString(sutotal);
                    txt_totales_Subtotales.setText(subto);
                    /*Total*/
                    totaliva = iva * sutotal;
                    tt = totaliva - sutotal;
                    String totalidad=Double.toString(tt);
                    txt_totales_total.setText(totalidad);
                    /*Concepto*/
                    int factu=Integer.parseInt(txt_item_Eliminar.getText());
                    Listfactura.remove(factu);
                    /*Precio*/
                    int prec=Integer.parseInt(txt_item_Eliminar.getText());
                    Listprecio.remove(prec);
                    /*Cantidad*/
                    int canti=Integer.parseInt(txt_item_Eliminar.getText());
                    Listcantidad.remove(canti);
                    /*TotalPrecio*/
                    int tota=Integer.parseInt(txt_item_Eliminar.getText());
                    Listtotal.remove(tota);
                    /*Numero Items*/
                    contitem=contitem--;
                    String it=Double.toString(contitem);
                    txt_totals_numeItem.setText(it);
                  
                    JOptionPane.showMessageDialog(this, "Registro Eliminado");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al Eliminar");
                }     
        }else{
            JOptionPane.showMessageDialog(this, "DIGITE EL ITEM QUE DESEA ELIMINAR");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        if (txt_item_Eliminar.getText().equals("") == false){

            facturaController = new FacturaController();

                if (facturaController.modificaFactura(txt_item_Eliminar.getText())) {
                    operacion = 2;
                    int prea = Integer.parseInt(txt_item_Eliminar.getText());
                    precioante = Double.parseDouble(jList_Precio.getModel().getElementAt(prea));
                    int cata = Integer.parseInt(txt_item_Eliminar.getText());
                    cantidadante = Double.parseDouble(jList_Cantidad.getModel().getElementAt(cata));
                    
                    totalprecio = 0;
                    sutotal = sutotal - (cantidadante * precioante);
                }else {
                    JOptionPane.showMessageDialog(this, "Codigo de Items no Existe");
                } 
        }else{
            JOptionPane.showMessageDialog(this, "DIGITE EL ITEM QUE DESEA MODIFICAR");
        }
        
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txt_total.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        /*********LIMPIA TODAS LA LISTAS AL CERRAR EL FORMULARIO*********/
        Listfactura.removeAllElements();
        /*Precio*/
        Listprecio.removeAllElements();
        /*Cantidad*/
        Listcantidad.removeAllElements();
        /*Total*/
        Listtotal.removeAllElements();
        /*ELIMINA TODO DE LA BASE DE DATOS*/
        facturaController = new FacturaController();
        facturaController.eliminarTodoFactura();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
    }
    
    public void setObjFactura() {        
        totalprecio = Integer.parseInt(txt_precio.getText()) * Integer.parseInt(txt_cantidad.getText());
        contitem = contitem++;
        sutotal = sutotal+totalprecio;
        totaliva = iva * sutotal;
        tt = totaliva + sutotal;
                
        factura.setConcepto(txt_concepto.getText());
        factura.setP_unitario(Double.parseDouble(txt_precio.getText()));
        factura.setCantidad(Double.parseDouble(txt_cantidad.getText()));
        factura.setT_cantidad(totalprecio);
        factura.setN_items(contitem);
        factura.setSubtotal(sutotal);
        factura.setIva(impue);
        factura.setTotal(tt);
    }
    public void setObjFacturau() {        
        totalprecio = Integer.parseInt(txt_cantidad.getText()) * Integer.parseInt(txt_precio.getText());
        //contitem = contitem++;
        sutotal = (sutotal)+totalprecio;
        totaliva = iva * sutotal;
        tt = totaliva + sutotal;
        
        factura.setId(Integer.parseInt(txt_item_Eliminar.getText()));
        factura.setConcepto(txt_concepto.getText());
        factura.setP_unitario(Double.parseDouble(txt_precio.getText()));
        factura.setCantidad(Double.parseDouble(txt_cantidad.getText()));
        factura.setT_cantidad(totalprecio);
        factura.setN_items(contitem);
        factura.setSubtotal(sutotal);
        factura.setIva(impue);
        factura.setTotal(tt);
    }
    public void insertvariables(){
        /*Concepto*/
        String fact=txt_concepto.getText();
        Listfactura.addElement(fact);
        /*Precio*/
        String pre=txt_precio.getText();
        Listprecio.addElement(pre);
        /*Cantidad*/
        String cant=txt_cantidad.getText();
        Listcantidad.addElement(cant);
        /*TotalPrecio*/
        String tot=Double.toString(totalprecio);
        Listtotal.addElement(tot);
        /*Numero Items*/
        String it=Double.toString(contitem);
        txt_totals_numeItem.setText(it);
        /*Subtotales*/
        String subto=Double.toString(sutotal);
        txt_totales_Subtotales.setText(subto);
        /*Total*/
        String totalidad=Double.toString(tt);
        txt_totales_total.setText(totalidad);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Añadir;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList_Cantidad;
    private javax.swing.JList<String> jList_Conceptos;
    private javax.swing.JList<String> jList_Precio;
    private javax.swing.JList<String> jList_Total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txt_Eliminar_cantidad;
    private javax.swing.JTextField txt_Eliminar_precio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_concepto;
    private javax.swing.JTextField txt_item_Eliminar;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_totales_Subtotales;
    private javax.swing.JTextField txt_totales_iva;
    private javax.swing.JTextField txt_totales_total;
    private javax.swing.JTextField txt_totals_numeItem;
    // End of variables declaration//GEN-END:variables
}
