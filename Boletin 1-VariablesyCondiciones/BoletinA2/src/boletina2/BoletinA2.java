/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina2;
import java.util.Scanner;
public class BoletinA2 {

    public static void main(String[] args) {
    // Pedir el radio de un circulo y calcular su area
      double a,r; //area y radio
     
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese el radio de un cirdulo: ");
     r=Entrada.nextDouble();
     a=Math.PI*(r*r); // para eevar al cuadrado otra opcion es: Math.pow(r,2)
     System.out.println("El área de una circunferencia de radio " +r+ " es: "+a);
    }
    
}
