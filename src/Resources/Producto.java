/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resources;
import javax.swing.ImageIcon;

public class Producto {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    private String nombre;
    private double precio;
    private ImageIcon imagen;

    public Producto(String nombre, double precio, ImageIcon imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
    }

}


