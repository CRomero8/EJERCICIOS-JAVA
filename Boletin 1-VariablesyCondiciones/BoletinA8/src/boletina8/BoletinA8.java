/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina8;

import java.util.Scanner;

public class BoletinA8 {

    public static void main(String[] args) {
        // Pedir 2 numeros y decir cuale es mayor o si son iguales
        int n1,n2;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese un  números: ");
     n1=Entrada.nextInt();
     System.out.print("Ingrese otro número: ");
     n2=Entrada.nextInt();
     if (n1==n2){
         System.out.println("Son Inguales");
     }
     else if (n1>n2){
              System.out.println(n1 + " Es mayor que " +n2);
     }
     else{
              System.out.println(n2 + " Es mayor que " +n1);
         }
    }
    
}
