/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainn;

/**
 *
 * @author mikev_6wadxan
 */
public class Empleados implements Empresatransporte {
  
    private int identificacion;



    public Empleados(int identificacion) {
        this.identificacion = identificacion;
    }
    


    public int getIdentificacion() {
         System.out.println(identificacion);
        
        return identificacion;
    }

    @Override
    public void transporte1() {
        System.out.println("1. Transporte 1");
    }

    @Override
    public void transporte2() {
        System.out.println("2. Transporte 2");
    }

    @Override
    public void transporte3() {
        System.out.println("3. Transporte 3");
    }
    
    public void mostar(){
    transporte1();
    transporte2();
    transporte3();
    }
    

}
