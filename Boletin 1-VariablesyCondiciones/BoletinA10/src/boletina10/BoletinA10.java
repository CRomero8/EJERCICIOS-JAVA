/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina10;

import java.util.Scanner;

public class BoletinA10 {

    public static void main(String[] args) {
        // Pedir 3 numeros y mostrarlos ordenados de mayor a menor
        int a,b,c;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese primer números: ");
     a=Entrada.nextInt();
     System.out.print("Ingrese segundo número: ");
     b=Entrada.nextInt();
     System.out.print("Ingrese tercer número : ");
     c=Entrada.nextInt();
     if (a>b&&b>c){
         System.out.println( a+", "+b+", "+c);
     }
     else if(a>c&&c>b){
         System.out.println( a+", "+c+", "+b);
     }
     else if(b>a&&a>c){
         System.out.println( b+", "+a+", "+c);
     }
     else if(b>c&&c>a){
         System.out.println( b+", "+c+", "+a);
     }
     else if(c>a&&a>b){
         System.out.println( c+", "+a+", "+b);
     }
     else if(c>b&&b>a){
         System.out.println( c+", "+b+", "+a);
     }
    }
    
}
