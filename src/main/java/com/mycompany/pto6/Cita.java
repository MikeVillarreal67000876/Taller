/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pto6;

/**
 *
 * @author Usuario
 */
public class Cita {
    private String nombre;
    private String sucursal ;
    private String especialista;

    public Cita(String nombre,  String sucursal, String especialista) {
        this.nombre = nombre;

        this.sucursal = sucursal;
        this.especialista = especialista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    @Override
    public String toString() {
        return "Cita{" + "nombre=" + nombre + ", sucursal=" + sucursal + ", especialista=" + especialista + '}';
    }

   
}
