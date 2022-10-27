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
public class Medico extends Persona {
    
    private String especialidad;
    private boolean disponibilidad ;
    private String hora;
 
    public Medico(String especialidad ,boolean disponibilidad, String hora , String nombre, String sucursal, String direccion, int telefono) {
        super(nombre, sucursal, direccion, telefono);
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
        this.hora = hora ;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.especialidad = Especialidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return  "Medico{" + "especialidad=" + especialidad + ", disponibilidad=" + disponibilidad + ", hora=" + hora + "nombre" + nombre + "Sucursal" + sucursal + "direccion= " +direccion + "numero de telefono=" + telefono +'}';
    }
    
    
    
}
