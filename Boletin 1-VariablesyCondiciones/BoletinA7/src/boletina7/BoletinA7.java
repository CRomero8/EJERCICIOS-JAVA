/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina7;

import java.util.Scanner;

public class BoletinA7 {

    public static void main(String[] args) {
        // Pedir 2 numeros y decir cual es mayor.
    int n1,n2;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese un  números: ");
     n1=Entrada.nextInt();
     System.out.print("Ingrese otro número: ");
     n2=Entrada.nextInt();
     // si ambos numeros son iguales diria que n2 es mayor que n1
     if (n1>n2){
         System.out.println(n1 + " Es mayor que " +n2);
     }
     else{
         System.out.println(n2 + " Es mayor que " +n1);
     }
    }
    
}
