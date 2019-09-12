/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina9;

import java.util.Scanner;

public class BoletinA9 {

    public static void main(String[] args) {
        // Pedir 2 numeros y mostrarlos ordenados de mayor a menor
        int n1,n2;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese un  números: ");
     n1=Entrada.nextInt();
     System.out.print("Ingrese otro número: ");
     n2=Entrada.nextInt();
     if (n1>n2){
         System.out.println(n1 + " y " + n2);
     }
     else{
         System.out.println(n2 + " y " + n1);
     }
    }
    
}
