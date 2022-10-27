/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pto6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
     public static void main(String[] args) {
         boolean terminar =false ;
         Scanner sc = new Scanner(System.in);
         Agenda citamedica = new Agenda (3);
         Agenda disponibilidadmedicos = new Agenda (3);
         String nombre,sucursal,especialista,direccion;
         int op=0,opcita = 0, telefono;
         Cita c ;
         Medico m ;
         m = new Medico ("Ortopedista", true, "2:00 pm", "Juan Osorio", "Marly", "Calle 45 #5", 32153);
         disponibilidadmedicos.aniadirDisponibilidadMedico(m);
         m = new Medico ("Pediatria", true, "12:00 am", "Pedro Garcia", "Tintal", "Calle 85 #9", 1234);
         disponibilidadmedicos.aniadirDisponibilidadMedico(m);
         while (!terminar)
         {      
                System.out.println("1. añadir usuario");
                System.out.println("2. Mostrar disponibilidad de los medicos");
                System.out.println("3. Añadir cita o cancelar cita ");
                System.out.println("4. Ver el estado de la cita");
                System.out.println("Escribe una de las opciones");
                op = sc.nextInt();
            
              switch (op){
                  case 1:
                      System.out.println("Ingrese un nombre: ");
                      nombre = sc.next();
                      System.out.println("Ingrese una sucursal: ");
                      sucursal= sc.next();
                      System.out.println("Ingrese una direccion: ");
                      direccion = sc.next();
                      System.out.println("Ingrese un telefono: ");
                      telefono = sc.nextInt();
                      break;
                  case 2:
                      System.out.println("--Estas son las citas disponibles--");
                      disponibilidadmedicos.listarDisponibilidadMedica();
                      break;
                     
                  case 3:
                      System.out.println("Ingrese" + "1. Cita ortopedista"+ "\n 2. Cita Pediatria");
                      opcita = sc.nextInt();
                      if (opcita==1){
                          c= new Cita ("Juan Osorio", "Marly", "Ortopedista" );
                          citamedica.aniadirCita(c);
                      }else{
                      c= new Cita ("Pedro Garcia", "Tintal", "Pediatria" );
                      citamedica.aniadirCita(c);
                      break;
                      }
                  case 4 :
                      
                  case 5 :
                      terminar = true ;
                      break;
                      
              }
         }
    
             
         
     }
     
}
