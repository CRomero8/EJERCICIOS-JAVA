/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina1;
import java.util.Scanner;
public class BoletinA1 {
 
    public static void main(String[] args) {
     // Los coeficientes de una ecuacion de 2° grado y muestre sus
     //soluciones reales. sino existen debe indicarlo.
     double a,b,c; //coe ax^2+bx+c=0
     double x1,x2,d; //soluciones y determinantes
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese primer coeficiente (a): ");
     a=Entrada.nextDouble();
     System.out.print("Ingrese segundo coeficiente (b): ");
     b=Entrada.nextDouble();
     System.out.print("Ingrese tercer coeficiente (c): ");
     c=Entrada.nextDouble();
     
     //calculamos el determinante
     d=((b*b-4*a*c));
     if (d<0)
         System.out.println("No existen soluciones reales");
     else{
         // queda confirmar que sea distinto a 0.
         x1=(-b+Math.sqrt(d))/(a*2);
         x2=(-b-Math.sqrt(d))/(2*a);
         System.out.println("Solución:" +x1);
         System.out.println("Solución:" +x2);        
         }
    }
    
}
