/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tambo_mysql;

import Resources.Producto;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CatalogoFrame extends JFrame {
    private JPanel panelProductos;

    public CatalogoFrame(List<Producto> productos) {
        // Configurar el JFrame
        setTitle("Catálogo de Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Crear el JPanel para mostrar los productos
        panelProductos = new JPanel(new GridLayout(0, 3));

        // Agregar los productos al panel
        for (Producto producto : productos) {
            panelProductos.add(crearPanelProducto(producto));
        }

        // Agregar el panel al JFrame
        add(panelProductos);

        // Mostrar el JFrame
        setVisible(true);
    }

    private JPanel crearPanelProducto(Producto producto) {
        JPanel panelProducto = new JPanel(new BorderLayout());

        // Agregar la imagen del producto al panel
        JLabel labelImagen = new JLabel(producto.getImagen());
        panelProducto.add(labelImagen, BorderLayout.CENTER);

        // Agregar el nombre del producto al panel
        JLabel labelNombre = new JLabel(producto.getNombre());
        panelProducto.add(labelNombre, BorderLayout.NORTH);

        // Agregar el precio del producto al panel
        JLabel labelPrecio = new JLabel(String.valueOf(producto.getPrecio()));
        panelProducto.add(labelPrecio, BorderLayout.CENTER);

        // Agregar los botones "Añadir al carrito" y "Comprar" al panel
        JButton btnAgregarCarrito = new JButton("Añadir al carrito");
        JButton btnComprar = new JButton("Comprar");
        panelProducto.add(btnAgregarCarrito, BorderLayout.SOUTH);
        panelProducto.add(btnComprar, BorderLayout.SOUTH);

        return panelProducto;
    }

    public static void main(String[] args) {
        // Crear algunos productos de ejemplo
        Producto producto1 = new Producto("Producto 1", 10.99, new ImageIcon("imagen1.jpg"));
        Producto producto2 = new Producto("Producto 2", 19.99, new ImageIcon("imagen2.jpg"));
        Producto producto3 = new Producto("Producto 3", 15.99, new ImageIcon("imagen3.jpg"));

        // Crear una lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        // Crear la ventana del catálogo
        CatalogoFrame catalogoFrame = new CatalogoFrame(productos);
    }
}
