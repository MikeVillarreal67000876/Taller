/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.to5;

/**
 *
 * @author Usuario
 */
public class EstudiantePosgrado  {
    private EstudiantePosgrado estudiantesp[] ;

    String nombre;
    double calculo;
    double fisica ;
    double estadistica ;
    double matricula ;
    public EstudiantePosgrado (int tamano){
        this.estudiantesp = new EstudiantePosgrado [tamano];
    }

    public EstudiantePosgrado(String nombre, double calculo, double fisica, double estadistica,double matricula) {
        this.nombre = nombre;
        this.calculo = calculo;
        this.fisica = fisica;
        this.estadistica = estadistica;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public double getFisica() {
        return fisica;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    public double getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(double estadistica) {
        this.estadistica = estadistica;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
    
    public void aniadirEstudiantePosgrado(EstudiantePosgrado epd) {

            boolean encontrado = false;
            for (int i = 0; i < estudiantesp.length && !encontrado; i++) {
                if (estudiantesp[i] == null) { //controlo los nulos
                    estudiantesp[i] = epd ; //Inserto el estudiante
                    encontrado = true; //Indico que lo he encontrado
                }
            }

            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
    }
     public void buscarPorNombreP(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < estudiantesp.length && !encontrado; i++) {
            //Controlo nulos y cxompruebo que es el estudiante buscado 
            if (estudiantesp[i] != null && estudiantesp[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("El valor de la matricula del estudiantes es: " + estudiantesp[i].getMatricula()); //muestro la matricula
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el estudiante ");
        }

    }
   
}
