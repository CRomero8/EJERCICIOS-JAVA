/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina11;

import java.util.Scanner;

public class BoletinA11 {

    public static void main(String[] args) {
        // Pedir un numero entre 0 y 9999 y decir cuantas cifras tiene.
          int num;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese un número entre 0 y 99,999: ");
     num=Entrada.nextInt();
     if (num<10){
         System.out.println("Tiene una cifra");
     }
     else if(num<100){
         System.out.println("Tiene dos cifras");
     }
     else if(num<1000){
         System.out.println("Tiene tres cifras");
     }
     else if(num<10000){
         System.out.println("Tiene cuatro cifras");
     }
     else if(num<100000){
         System.out.println("Tiene cinco cifras");
     }
    }
    
}
