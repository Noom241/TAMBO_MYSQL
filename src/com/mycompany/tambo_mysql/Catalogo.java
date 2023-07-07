/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tambo_mysql;

import SQL.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author Segov
 */


public class Catalogo extends javax.swing.JFrame {

    /**
     * Creates new form Catalogo
     */
    private int paginaActual;
    private int productosPorPagina;
    
    public Catalogo() {
        initComponents();
        cargarProductos();
        paginaActual = 1;
        productosPorPagina = 4;
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
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        labelImagen1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        labelPrecio1 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        labelImagen2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        labelPrecio2 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        labelImagen3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        labelPrecio3 = new javax.swing.JLabel();
        labelNombre3 = new javax.swing.JLabel();
        labelImagen4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        labelPrecio4 = new javax.swing.JLabel();
        labelNombre4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(176, 18, 129));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        labelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/test.png"))); // NOI18N
        jPanel1.add(labelImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/njLbfecaSfZxz4GCm-150-150.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton3.setText("AÑADIR AL CARRITO");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jButton4.setText("COMPRAR");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        labelPrecio1.setText("10.99");
        jPanel1.add(labelPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        labelNombre1.setText("Hamburguesa");
        jPanel1.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        labelImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/test.png"))); // NOI18N
        jPanel1.add(labelImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jButton5.setText("AÑADIR AL CARRITO");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jButton6.setText("COMPRAR");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        labelPrecio2.setText("10.99");
        jPanel1.add(labelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        labelNombre2.setText("Hamburguesa");
        jPanel1.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        labelImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/test.png"))); // NOI18N
        jPanel1.add(labelImagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jButton7.setText("AÑADIR AL CARRITO");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jButton8.setText("COMPRAR");
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        labelPrecio3.setText("10.99");
        jPanel1.add(labelPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        labelNombre3.setText("Hamburguesa");
        jPanel1.add(labelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        labelImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/test.png"))); // NOI18N
        jPanel1.add(labelImagen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jButton9.setText("AÑADIR AL CARRITO");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, -1));

        jButton10.setText("COMPRAR");
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        labelPrecio4.setText("10.99");
        jPanel1.add(labelPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        labelNombre4.setText("Hamburguesa");
        jPanel1.add(labelNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

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

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        if (paginaActual > 1) {
        paginaActual--;
        cargarProductos();
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        try (Connection con = Conexion.getConexion()) {
            String consulta = "SELECT * FROM PRODUCTO";
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(consulta);

            int totalProductos = obtenerTotalProductos(rs);
            int totalPaginas = (int) Math.ceil((double) totalProductos / productosPorPagina);

            if (paginaActual < totalPaginas) {
                paginaActual++;
                cargarProductos();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }       
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    // End of variables declaration//GEN-END:variables

private void cargarProductos() {
    try (Connection con = Conexion.getConexion()) {
        String consulta = "SELECT * FROM PRODUCTO";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(consulta);
        int totalProductos = obtenerTotalProductos();
        int totalPaginas = (int) Math.ceil((double) totalProductos / productosPorPagina);
        int contador = 1;
        System.out.println("Total de productos: " + totalProductos);
        System.out.println("Total de páginas: " + totalPaginas);
        
        while (rs.next() && contador <= 4) {
            String nombre = rs.getString("Producto");
            double precio = rs.getDouble("Precio");
            ImageIcon imagen = new ImageIcon("ruta_imagenes/" + nombre + ".jpg");

            switch (contador) {
                case 1:
                    labelNombre1.setText(nombre);
                    labelPrecio1.setText(String.valueOf(precio));
                    labelImagen1.setIcon(imagen);
                    break;
                case 2:
                    labelNombre2.setText(nombre);
                    labelPrecio2.setText(String.valueOf(precio));
                    labelImagen2.setIcon(imagen);
                    break;
                case 3:
                    labelNombre3.setText(nombre);
                    labelPrecio3.setText(String.valueOf(precio));
                    labelImagen3.setIcon(imagen);
                    break;
                case 4:
                    labelNombre4.setText(nombre);
                    labelPrecio4.setText(String.valueOf(precio));
                    labelImagen4.setIcon(imagen);
                    break;
            }

            contador++;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private int obtenerTotalProductos() {
    try (Connection con = Conexion.getConexion()) {
        String consulta = "SELECT COUNT(*) AS total FROM PRODUCTO";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(consulta);

        if (rs.next()) {
            return rs.getInt("total");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}


}




}
