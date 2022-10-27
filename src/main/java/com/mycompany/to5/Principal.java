/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.to5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstudiantePregrado ep ;
        EstudiantePosgrado epd ;
        
        EstudiantePregrado estudiantePregrado = new EstudiantePregrado (3);
        EstudiantePosgrado estudiantePosgrado = new EstudiantePosgrado (3);
        int a = 1, op = 0 ;
        double calculo ,fisica , estadistica ,promedio ,matricula =0 ;
        String nombre ;
        while (a > 0){
            System.out.println("1. Agregar estudiante de pregrado "+ "\n2. Agregar estudiante de posgrado"+ "\n3. Buscar estudiante de pregrado"
            + "\n4. Buscar estudiante posgrado" + "\n5. Salir");
            op = sc.nextInt();
            switch (op){
                case 1 :
                    System.out.println("Estudiantes de Pregrado");
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre =  sc.next();
                    System.out.println("Ingresa la nota de Calculo: ");
                    calculo = sc.nextDouble();
                    System.out.println("Ingresa la nota de Fisica: ");
                    fisica = sc.nextDouble();
                    System.out.println("Ingresa la nota de Estadistica: ");
                    estadistica= sc.nextDouble();
                    promedio= (calculo+fisica+estadistica)/3 ;
                    calculosMatriculaPre (promedio); 
                    // Creo el estudiante de pregrado
                    double CreditosPre=40000 ;
                        //Calculo matricula pregrado
                        if (promedio >= 4.5){
                             //Descuento para el mayor promedio
                              matricula=((CreditosPre*28)*0.25); 
                         }
                        else if(promedio >= 4.0 && promedio < 4.5 ){
                            //Descuentos para el promedio medio
                             matricula=((CreditosPre*25)*0.10); 

                        }
                        else if (promedio >= 3.5 && promedio < 4.0){
                            //Sin descuento cursa 20 creditos
                            matricula=(CreditosPre*20);

                        }
                        else if (promedio >= 2.5 && promedio < 3.5){
                            //Sin descuento cursa 15 creditos
                            matricula=(CreditosPre*15);

                        }
                    ep = new EstudiantePregrado (nombre, calculo, fisica, estadistica, matricula);
                    estudiantePregrado.aniadirEstudiantePregrado(ep);
                    break;
                case 2:
                    System.out.println("Estudiantes de Posgrado");
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre = sc.next();
                    System.out.println("Ingresa la nota de Calculo: ");
                    calculo = sc.nextDouble();
                    System.out.println("Ingresa la nota de Fisica: ");
                    fisica = sc.nextDouble();
                    System.out.println("Ingresa la nota de Estadistica: ");
                    estadistica= sc.nextDouble();
                    promedio= (calculo+fisica+estadistica)/3 ;
                    double CreditosPos=200000;
                    //Calculo matricula posgrado
                    // Se hacen las validaciones exigidas por el contexto
                    if (promedio >= 4.5){
                          matricula=((CreditosPos*20)*0.20);  
                     }
                    else if(promedio < 4.5 ){

                         matricula=CreditosPos*10; 
                    }
                    epd = new EstudiantePosgrado (nombre, calculo, fisica, estadistica, matricula);
                    estudiantePosgrado.aniadirEstudiantePosgrado(epd);
                    break;
                case 3 :
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre = sc.next();
                    estudiantePregrado.buscarPorNombre(nombre);
                    break;
                case 4 :
                    System.out.println("Ingrese el nombre del estudiante: ");
                    nombre = sc.next();
                    estudiantePosgrado.buscarPorNombreP(nombre);
                    break;
                case 5 :
                    a = 0 ;
                    break;
                    
            }
        }
        
        
    }
   
    public static void calculosMatriculaPre (double promedio){
               double CreditosPre=40000 ,cal = 0;
       //Calculo matricula pregrado
       if (promedio >= 4.5){
            //Descuento para el mayor promedio
             cal=((CreditosPre*28)*0.25); 
        }
       else if(promedio >= 4.0 && promedio < 4.5 ){
           //Descuentos para el promedio medio
            cal=((CreditosPre*25)*0.10); 
            
       }
       else if (promedio >= 3.5 && promedio < 4.0){
           //Sin descuento cursa 20 creditos
           cal=(CreditosPre*20);
           
       }
       else if (promedio >= 2.5 && promedio < 3.5){
           //Sin descuento cursa 15 creditos
           cal=(CreditosPre*15);
           
       }
   }
   public static void calculosMatriculaPos(double promedio){
       double CreditosPos=200000,Cal = 0;
       //Calculo matricula posgrado
       // Se hacen las validaciones exigidas por el contexto
       if (promedio >= 4.5){
             Cal=((CreditosPos*20)*0.20);  
        }
       else if(promedio < 4.5 ){
            Cal=CreditosPos*10; 
       }
    }
}
