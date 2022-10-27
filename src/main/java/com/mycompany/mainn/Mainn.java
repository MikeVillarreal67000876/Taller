/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainn;

import java.util.Scanner;

/**
 *
 * @author mikev_6wadxan
 */
public class Mainn {

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema TeleVentas");
         System.out.println("A continuacion va a conocer nuestro catalogo");
                 Catalogo producto1 =new Catalogo(456,"Telefono","Articulo electronico ligero",1000000,35);
           Catalogo producto2 =new Catalogo(123,"Lampara","Articulo muy ligero ",200000,20);
                  Catalogo producto3 =new Catalogo(789,"Televisor","Articulo grande y pesado",5000000,40);
                         Catalogo producto4 =new Catalogo(159,"Consola","Articulo pequeño que incluuye dos controles",2000000,14);
                                Catalogo producto5 =new Catalogo(369,"Computador","Articulo mediano y ligero",2500000,50);
                                      
                            System.out.print("1.");  producto1.catalogo();
                             System.out.println("");
                             System.out.print("2.");  producto2.catalogo();
                              System.out.println("");
                              System.out.print("3.");  producto3.catalogo();
                               System.out.println("");
                               System.out.print("4.");  producto4.catalogo();
                                System.out.println("");
                                System.out.print("5.");  producto5.catalogo();
                                 System.out.println("");
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite 1 si es cliente");
System.out.println("Digite 2 si es empleado");
int rta3=sc.nextInt();
        
        if(rta3==1){
        
        
         int o=1;
         
         while(o==1){



        
         System.out.println("Por favor digite su correo electronico para enviarle la informacion");
         String correo= sc.nextLine();
         Clientes c1=new Clientes(correo);
          System.out.println("Usted digito: ");
          c1.getCorreo();
           System.out.println("");
           System.out.println("Por favor digite la cantidad de productos que desea para añadirlos a la orden ");
           int valor= sc.nextInt();
           for (int i=0;i<valor;i++){
            System.out.println("Digite el codigo del prodcuto " + i);
            int l =sc.nextInt();
           if(l==456){
               producto1.getProducto();
                  System.out.println("");
                 
           }
           if(l==123){
             producto2.getProducto();
              System.out.println("");
           }
                      if(l==789){
             producto3.getProducto();
              System.out.println("");
           }

                                            if(l==159){
             producto4.getProducto();
              System.out.println("");
           }
                                                       if(l==369){
             producto5.getProducto();
              System.out.println("");
           }
                                            

           }
           
  System.out.println("Usted escogio " + valor + " productos");
    System.out.println("El unico medio de pago que recibimos es tarjeta ");

  

      System.out.println("Por favor digite el numero de tarjeta      "); 
      int numerotarjeta=sc.nextInt();
   
    Mediodepago p1=new Mediodepago(numerotarjeta);
     System.out.println("Usted digito: ");
     p1.getNumeroTarjeta();
     
     System.out.println("Por favor digite 1 si desea continuar con la compra ");
     System.out.println("Por favor digite 2 si desea salir ");
     System.out.println("Por favor digite 3 si desea cancelar la compra  ");
    
    int rta=sc.nextInt();
    
    if(rta==3){
         System.out.println("Usted cancelo la orden, por favor vuelva a llenar llos datos  ");
     System.out.println("Por favor digite la cantidad de productos que desea para añadirlos a la orden ");
           int valor2= sc.nextInt();
           for (int i=0;i<valor;i++){
            System.out.println("Digite el codigo del prodcuto " + i);
            int l =sc.nextInt();
           if(l==456){
               producto1.getProducto();
                  System.out.println("");
                 
           }
           if(l==123){
             producto2.getProducto();
              System.out.println("");
           }
                      if(l==789){
             producto3.getProducto();
              System.out.println("");
           }

                                            if(l==159){
             producto4.getProducto();
              System.out.println("");
           }
                                                       if(l==369){
             producto5.getProducto();
              System.out.println("");
           }
                                            

           }
             System.out.println("Usted escogio " + valor + "productos");
    System.out.println("El unico medio de pago que recibimos es tarjeta ");

   System.out.println("");
      System.out.print("Por favor digite el numero de tarjeta      ");  int numerotarjeta2=sc.nextInt();
     System.out.println("");
    Mediodepago p2=new Mediodepago(numerotarjeta);
     System.out.println("Usted digito: ");
     p2.getNumeroTarjeta();
     
     System.out.println("Por favor digite 1 si desea continuar con la compra ");
     System.out.println("Por favor digite 2 si desea volver a escoger los productos ");
     System.out.println("Por favor digite 3 si desea cancelar la compra  ");
    }
    

    if(rta==2){
    break;
    }
    if(rta==1){
        
       
    System.out.println("Su compra ha sido exitosa");
    System.out.println("Por favor digite 1 si desea volver a comprar");
    System.out.println("Por favor digite 2 si desea salir");
    int rta2=sc.nextInt();
    if(rta2==2){
    System.out.println("Gracias por visitar nuestro sistema  televentas, que tenga un buen dia ");
    break;
    }
    
    }
    
    
    
         


    
         }
        }
        
        
        if(rta3==2){
        System.out.println("Bienvenido señor empleado");





 System.out.println("por favor digite su identificacion");
int iden=sc.nextInt();
Empleados e1=new Empleados(iden);

 System.out.println("Usted digito: ");
 e1.getIdentificacion();
 System.out.println("En el momento estan los siguientes transportes  ");
 e1.mostar();
  System.out.println("por favor elija uno ");
  int rta4=sc.nextInt();
  if(rta4==1){
       System.out.println("usted eligio : ");
  e1.transporte1();
  
  }
  if(rta4==2){
    System.out.println("usted eligio : ");
  e1.transporte2();
  }
  if (rta4==3){
        System.out.println("usted eligio : ");
  e1.transporte3();
  }
 
 
        }
    
          
           
           
    }
}
