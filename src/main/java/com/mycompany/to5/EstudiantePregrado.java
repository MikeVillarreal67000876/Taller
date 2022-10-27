
package com.mycompany.to5;

public class EstudiantePregrado  {
    private EstudiantePregrado estudiantes[] ;
    String nombre;
    double calculo;
    double fisica ;
    double estadistica ;
    double matricula ;
    
    public EstudiantePregrado (int tamano){
        this.estudiantes = new EstudiantePregrado [tamano];
    }

    public EstudiantePregrado(String nombre, double calculo, double fisica, double estadistica, double matricula) {
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

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
    

    public void setEstadistica(double estadistica) {
        this.estadistica = estadistica;
    }

    @Override
    public String toString() {
        return "EstudiantePregrado{" + "nombre=" + nombre + ", calculo=" + calculo + ", fisica=" + fisica + ", estadistica=" + estadistica + ", matricula=" + matricula + '}';
    }
    
    public void aniadirEstudiantePregrado(EstudiantePregrado ep) {

            boolean encontrado = false;
            for (int i = 0; i < estudiantes.length && !encontrado; i++) {
                if (estudiantes[i] == null) { //controlo los nulos
                    estudiantes[i] = ep; //Inserto el estudiante
                    encontrado = true; //Indico que lo he encontrado
                }
            }

            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
    }
     public void buscarPorNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < estudiantes.length && !encontrado; i++) {
            //Controlo nulos y cxompruebo que es el estudiante buscado 
            if (estudiantes[i] != null && estudiantes[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("El valor de la matricula del estudiantes es: " + estudiantes[i].getMatricula()); //muestro la amtricula
                encontrado = true; //Indico que lo he encontrado
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el estudiante ");
        }

    }
     
        
}
