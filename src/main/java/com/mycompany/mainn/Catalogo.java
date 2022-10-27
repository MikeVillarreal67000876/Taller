/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainn;

/**
 *
 * @author mikev_6wadxan
 */
public class Catalogo {
    private int codigo;
    private String producto;
    private String descripcion;
    private int precio;
    private int cantidad;

    public Catalogo(int codigo, String producto, String descripcion, int precio, int cantidad) {
        this.codigo = codigo;
        this.producto = producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }



    public int getCodigo() {
        System.out.print("  "+"Codigo:"+codigo+"   ");
        return codigo;
    }

    public String getDescripcion() {
        
         System.out.print("Descripcion:: " + descripcion+"   ");
        return descripcion;
    }

    public int getPrecio() {
         System.out.print("Precio: " + precio+"   ");
        return precio;
    }

    public int getCantidad() {
         System.out.print("Cantidad disponible: " +cantidad+"   ");
        return cantidad;
    }

    public String getProducto() {
         System.out.print("Producto: " + producto+"   ");
        return producto;
    }
    
    public void catalogo(){
    getCodigo(); getProducto(); getDescripcion();getPrecio();getCantidad();
    
    
    }
    
    
    
}
