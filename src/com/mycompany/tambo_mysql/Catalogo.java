/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tambo_mysql;


import Resources.CarritoCompras;
import Resources.Producto;
import SQL.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 * Clase que representa la interfaz de un catálogo de productos con funcionalidad de carrito de compras.
 *
 * @author Segov
 */
public class Catalogo extends javax.swing.JFrame {

    private final ArrayList<Producto> productosList = new ArrayList<>();
    private int totalPages;
    private int currentPage = 1;
    private int contadorProductosAñadidos = 0;

    /**
     * Constructor de la clase Catalogo.
     */
    public Catalogo() {
        initComponents();
        cargarProductos();
        cargarListadoPaginas();
        actualizarPaginaActual();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelImagen1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_añadir1 = new javax.swing.JButton();
        labelPrecio1 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        labelImagen2 = new javax.swing.JLabel();
        btn_añadir2 = new javax.swing.JButton();
        labelPrecio2 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        labelImagen3 = new javax.swing.JLabel();
        btn_añadir3 = new javax.swing.JButton();
        labelPrecio3 = new javax.swing.JLabel();
        labelNombre3 = new javax.swing.JLabel();
        labelImagen4 = new javax.swing.JLabel();
        btn_añadir4 = new javax.swing.JButton();
        labelPrecio4 = new javax.swing.JLabel();
        labelNombre4 = new javax.swing.JLabel();
        list_box = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        count_products = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(176, 18, 129));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/test.png"))); // NOI18N
        jPanel1.add(labelImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/njLbfecaSfZxz4GCm-150-150.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_añadir1.setText("AÑADIR AL CARRITO");
        btn_añadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_añadir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        labelPrecio1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPrecio1.setForeground(new java.awt.Color(204, 204, 204));
        labelPrecio1.setText("10.99");
        jPanel1.add(labelPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        labelNombre1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelNombre1.setForeground(new java.awt.Color(204, 204, 204));
        labelNombre1.setText("Hamburguesa");
        jPanel1.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        labelImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/test.png"))); // NOI18N
        jPanel1.add(labelImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        btn_añadir2.setText("AÑADIR AL CARRITO");
        btn_añadir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_añadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        labelPrecio2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPrecio2.setForeground(new java.awt.Color(204, 204, 204));
        labelPrecio2.setText("10.99");
        jPanel1.add(labelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        labelNombre2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelNombre2.setForeground(new java.awt.Color(204, 204, 204));
        labelNombre2.setText("Hamburguesa");
        jPanel1.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        labelImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/test.png"))); // NOI18N
        jPanel1.add(labelImagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        btn_añadir3.setText("AÑADIR AL CARRITO");
        btn_añadir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_añadir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        labelPrecio3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPrecio3.setForeground(new java.awt.Color(204, 204, 204));
        labelPrecio3.setText("10.99");
        jPanel1.add(labelPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        labelNombre3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelNombre3.setForeground(new java.awt.Color(204, 204, 204));
        labelNombre3.setText("Hamburguesa");
        jPanel1.add(labelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        labelImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/test.png"))); // NOI18N
        jPanel1.add(labelImagen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        btn_añadir4.setText("AÑADIR AL CARRITO");
        btn_añadir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_añadir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, -1));

        labelPrecio4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelPrecio4.setForeground(new java.awt.Color(204, 204, 204));
        labelPrecio4.setText("10.99");
        jPanel1.add(labelPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        labelNombre4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelNombre4.setForeground(new java.awt.Color(204, 204, 204));
        labelNombre4.setText("Hamburguesa");
        jPanel1.add(labelNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        list_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        list_box.setToolTipText("");
        list_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                list_boxItemStateChanged(evt);
            }
        });
        list_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_boxActionPerformed(evt);
            }
        });
        jPanel1.add(list_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 50, -1));

        jButton1.setText("Carrito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        count_products.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        count_products.setText("0");
        jPanel1.add(count_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_list_boxItemStateChanged
        cargarListadoPaginas();
    }//GEN-LAST:event_list_boxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Carrito carrito = new Carrito();
        
        // Hacer visible el JFrame "Carrito"
        carrito.setVisible(true);
        
        // Ocultar el JFrame actual "Catalogo"
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_añadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir1ActionPerformed
        String nombre = labelNombre1.getText();
        double precio = Double.parseDouble(labelPrecio1.getText());
        List<String> lista = CarritoCompras.getNombresProductos();
        List<Integer> cantidades = CarritoCompras.getCantidadesProductos();
        List<Double> Subtotales = CarritoCompras.getSubtotales();
        if (lista.contains(nombre)) {
            int indice = lista.indexOf(nombre);
            int cantidad = cantidades.get(indice);
            cantidad++;
            cantidades.set(indice, cantidad);
            Double subtotal = Subtotales.get(indice);
            subtotal = subtotal + precio;
            Subtotales.set(indice, subtotal);           
            
        } else {
            CarritoCompras.agregarProducto(nombre, precio);
            cantidades.add(1);
            
        }
        
        actualizarContadorProductos();
        // Llamar a la función para mostrar los productos en el carrito en la consola
        mostrarProductosEnCarrito();
    }//GEN-LAST:event_btn_añadir1ActionPerformed

    private void btn_añadir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir2ActionPerformed
        String nombre = labelNombre2.getText();
        double precio = Double.parseDouble(labelPrecio2.getText());
        List<String> lista = CarritoCompras.getNombresProductos();
        List<Integer> cantidades = CarritoCompras.getCantidadesProductos();
        List<Double> Subtotales = CarritoCompras.getSubtotales();
        
        if (lista.contains(nombre)) {
            System.out.println("Ya en el carrito");
            int indice = lista.indexOf(nombre);
            System.out.println("Indice: " + Integer.toString(indice));
            int cantidad = cantidades.get(indice);
            cantidad++;
            cantidades.set(indice, cantidad);
            Double subtotal = Subtotales.get(indice);
            subtotal = subtotal + precio;
            Subtotales.set(indice, subtotal);   
        } else {
            CarritoCompras.agregarProducto(nombre, precio);
            cantidades.add(1);
        }
        // Llamar a la función para mostrar los productos en el carrito en la consola
        actualizarContadorProductos();
        mostrarProductosEnCarrito();        
    }//GEN-LAST:event_btn_añadir2ActionPerformed

    private void btn_añadir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir3ActionPerformed
        String nombre = labelNombre3.getText();
        double precio = Double.parseDouble(labelPrecio3.getText());
        List<String> lista = CarritoCompras.getNombresProductos();
        List<Integer> cantidades = CarritoCompras.getCantidadesProductos();
        List<Double> Subtotales = CarritoCompras.getSubtotales();
        
        if (lista.contains(nombre)) {
            System.out.println("Ya en el carrito");
            int indice = lista.indexOf(nombre);
            System.out.println("Indice: " + Integer.toString(indice));
            int cantidad = cantidades.get(indice);
            cantidad++;
            cantidades.set(indice, cantidad);
            Double subtotal = Subtotales.get(indice);
            subtotal = subtotal + precio;
            Subtotales.set(indice, subtotal);   
        } else {
            CarritoCompras.agregarProducto(nombre, precio);
            cantidades.add(1);
        }
        actualizarContadorProductos();
        mostrarProductosEnCarrito();             // TODO add your handling code here:
    }//GEN-LAST:event_btn_añadir3ActionPerformed

    private void btn_añadir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir4ActionPerformed
        String nombre = labelNombre4.getText();
        double precio = Double.parseDouble(labelPrecio4.getText());
        List<String> lista = CarritoCompras.getNombresProductos();
        List<Integer> cantidades = CarritoCompras.getCantidadesProductos();
        List<Double> Subtotales = CarritoCompras.getSubtotales();
        
        if (lista.contains(nombre)) {
            System.out.println("Ya en el carrito");
            int indice = lista.indexOf(nombre);
            System.out.println("Indice: " + Integer.toString(indice));
            int cantidad = cantidades.get(indice);
            cantidad++;
            cantidades.set(indice, cantidad);
            Double subtotal = Subtotales.get(indice);
            subtotal = subtotal + precio;
            Subtotales.set(indice, subtotal);   
        } else {
            CarritoCompras.agregarProducto(nombre, precio);
            cantidades.add(1);
        }  
        actualizarContadorProductos();// Llamar a la función para mostrar los productos en el carrito en la consola
        mostrarProductosEnCarrito();              // TODO add your handling code here:
    }//GEN-LAST:event_btn_añadir4ActionPerformed

    private void list_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_boxActionPerformed
    // Get the selected page from the JComboBox
    String selectedPage = (String) list_box.getSelectedItem();
    int selectedPageIndex = Integer.parseInt(selectedPage.substring(7)); // Extract the page number

    // Update the current page and refresh the displayed products
    currentPage = selectedPageIndex;
    actualizarPaginaActual();       // TODO add your handling code here:
    }//GEN-LAST:event_list_boxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Catalogo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir1;
    private javax.swing.JButton btn_añadir2;
    private javax.swing.JButton btn_añadir3;
    private javax.swing.JButton btn_añadir4;
    private javax.swing.JLabel count_products;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImagen1;
    private javax.swing.JLabel labelImagen2;
    private javax.swing.JLabel labelImagen3;
    private javax.swing.JLabel labelImagen4;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelNombre3;
    private javax.swing.JLabel labelNombre4;
    private javax.swing.JLabel labelPrecio1;
    private javax.swing.JLabel labelPrecio2;
    private javax.swing.JLabel labelPrecio3;
    private javax.swing.JLabel labelPrecio4;
    private javax.swing.JComboBox<String> list_box;
    // End of variables declaration//GEN-END:variables

     private void cargarProductos() {
        int startIndex = (currentPage - 1) * 4; // Índice de inicio para la página actual
        System.out.println("PAginaaa " + ((currentPage - 1) * 4));
        int endIndex = startIndex + 4; // Índice de fin para la página actual

        try (Connection connection = Conexion.getConexion();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT Producto, Precio FROM PRODUCTO")) {

            int index = 0;
            while (resultSet.next()) {
                if (index >= startIndex && index < endIndex) {
                    String nombre = resultSet.getString("Producto");
                    double precio = resultSet.getDouble("Precio");
                    productosList.add(new Producto(nombre, precio));
                }
                index++;
            }

        } catch (SQLException e) {
        }
        mostrarProductosEnConsola();
        mostrarProductos();
    }

     
     
public void mostrarProductosEnCarrito() {
    List<String> nombresProductos = CarritoCompras.getNombresProductos();
    List<Double> preciosProductos = CarritoCompras.getPreciosProductos();
    
    for (int i = 0; i < nombresProductos.size(); i++) {
        String nombre = nombresProductos.get(i);
        double precio = preciosProductos.get(i);
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }
}

    private void mostrarProductos() {
        int index = 0;
        for (Producto producto : productosList) {
            switch (index) {
                case 0:
                    labelNombre1.setText(producto.getNombre());
                    labelPrecio1.setText(String.valueOf(producto.getPrecio()));
                    break;
                case 1:
                    labelNombre2.setText(producto.getNombre());
                    labelPrecio2.setText(String.valueOf(producto.getPrecio()));
                    break;
                case 2:
                    labelNombre3.setText(producto.getNombre());
                    labelPrecio3.setText(String.valueOf(producto.getPrecio()));
                    break;
                case 3:
                    labelNombre4.setText(producto.getNombre());
                    labelPrecio4.setText(String.valueOf(producto.getPrecio()));
                    break;
                default:
                    break;
            }
            index++;
        }
    }
    private void mostrarProductosEnConsola() {
    System.out.println("Productos:###########################");

    for (int index = 0; index < productosList.size(); index++) {
        Producto producto = productosList.get(index);
        System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
    }
    System.out.println("Productos:-----------------------------");
}


    /**
     * Actualiza los productos mostrados en el JFrame cuando se cambia de página.
     */
    private void actualizarPaginaActual() {
        productosList.clear();
        cargarProductos();
        // También puedes actualizar la etiqueta que muestra la página actual si es necesario.
    }

    /**
     * Carga las opciones de páginas disponibles en el JComboBox.
     */
private void cargarListadoPaginas() {
    try (Connection connection = Conexion.getConexion();
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) AS total FROM PRODUCTO")) {

        if (resultSet.next()) {
            int totalProductos = resultSet.getInt("total");
            totalPages = (int) Math.ceil(totalProductos / 4.0);
            
            // Actualizar el JComboBox con los números de página disponibles
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            for (int i = 1; i <= totalPages; i++) {
                model.addElement("Página " + i);
            }
            list_box.removeActionListener(list_box.getActionListeners()[0]);
            list_box.setModel(model);
            
            // Agregar el ActionListener actualizado para la lista desplegable
            list_box.addActionListener(e -> {
                JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
                String selectedPage = (String) comboBox.getSelectedItem();
                int selectedPageIndex = Integer.parseInt(selectedPage.substring(7)); // Obtener el número de página
                currentPage = selectedPageIndex;
                actualizarPaginaActual();
            });
        }

    } catch (SQLException e) {
    }
}


    /**
     * Actualiza el contador de productos añadidos al carrito en la interfaz.
     */
    private void actualizarContadorProductos() {
        contadorProductosAñadidos++;
        count_products.setText(String.valueOf(contadorProductosAñadidos));
    }



}