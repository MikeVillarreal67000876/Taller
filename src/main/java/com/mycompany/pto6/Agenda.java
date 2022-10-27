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
public class Agenda {
    private Cita[] citas ;
    private Medico [] medicos ;
    public Agenda(int tamano) {
        this.citas = new Cita[tamano] ;
        this.medicos = new Medico [tamano];
    }
    
    
     public void aniadirCita(Cita c) {
            boolean encontrado = false;
            for (int i = 0; i < citas.length && !encontrado; i++) {
                if (citas[i] == null) { //controlo los nulos
                    citas[i] = c; //Inserto el contacto 
                    encontrado = true; //Indico que lo he encontrado
                }
            }
            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
    }
     


    /**
     * Busca una cita por el nombre de quien la pidio
     *
     * @param nombre
     */
    public void buscarPorNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < citas.length && !encontrado; i++) {
            //Controlo nulos y cxompruebo que es el contacto buscado (forma mas engorrosa)
            if (citas[i] != null && citas[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Su cita es: " + citas[i]); //muestro el telefono
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado la cita ");
        }

    }

   
    /**
     * Elimina la cita nombrada
     *
     * @param c
     */
    public void eliminarCita(Cita c) {

        boolean encontrado = false;
        for (int i = 0; i < citas.length && !encontrado; i++) {
            if (citas[i] != null && citas[i].equals(c)) {
                citas[i] = null; //Controlo nulos
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (encontrado) {
            System.out.println("Se ha eliminado la cita");
        } else {
            System.out.println("No se ha eliminado la cita");

        }

    }
    public void listarCitasMedicas() {
            for (int i = 0; i < citas.length; i++) {
                if (citas[i] != null) { //Controlo nulos
                    System.out.println(citas[i]);
                }
            }
        }
    public void listarDisponibilidadMedicos() {
            for (int i = 0; i < medicos.length; i++) {
                if (citas[i] != null) { //Controlo nulos
                    System.out.println(citas[i]);
                }
            }
        }
    public void aniadirDisponibilidadMedico(Medico m) {
            boolean encontrado = false;
            for (int i = 0; i < medicos.length && !encontrado; i++) {
                if (medicos[i] == null) { //controlo los nulos
                    medicos[i] = m; //Inserto el contacto 
                    encontrado = true; //Indico que lo he encontrado
                }
            }
            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
    }
    public void listarDisponibilidadMedica() {
            for (int i = 0; i < medicos.length; i++) {
                if (medicos[i] != null) { //Controlo nulos
                    System.out.println(medicos[i]);
                }
            }

    
}
}
