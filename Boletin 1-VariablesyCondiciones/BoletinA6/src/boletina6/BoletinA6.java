/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina6;

import java.util.Scanner;

public class BoletinA6 {

    public static void main(String[] args) {
    //pedir 2 numeros y decir si uno es multiplo de otro.
    int n1,n2;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese un  números: ");
     n1=Entrada.nextInt();
     System.out.print("Ingrese otro número: ");
     n2=Entrada.nextInt();
     if (n1%n2==0){
         System.out.println("Son multiplos");
     }
     else{
         System.out.println("No son multiplos");
     }
    }
    
}
