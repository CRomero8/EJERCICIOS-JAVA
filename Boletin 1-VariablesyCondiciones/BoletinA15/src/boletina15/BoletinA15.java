/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina15;

import java.util.Scanner;

public class BoletinA15 {

    public static void main(String[] args) {
    //Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
    //Suponiendo todos los meses de 30 días.
    int dia,mes,año;
    // para que una fecha sea correcta se tiene que cumplir
    // día en el rango 1..30
    // mes en el rango 1..12
    // año cualquiera distinto del 0
    Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese Día: ");
     dia=Entrada.nextInt();
     System.out.print("Ingrese Mes: ");
     mes=Entrada.nextInt();
     System.out.print("Ingrese Año: ");
     año=Entrada.nextInt();
     if (dia>=1&&dia<=30){     
     }
     else{
         System.out.println("Día Incorrecto");
         }
     if (mes>=1&&mes<=12){        
     }
     else{
          System.out.println("Mes Incorrecto");   
        }
     if (año!=0){
         System.out.println("Fecha correcta");
     }
     else{
         System.out.println("Año Incorrecto");
     }
 
     
     
    }
    
}
