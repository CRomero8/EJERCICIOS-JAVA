/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina3;

import java.util.Scanner;

public class BoletinA3 {

    public static void main(String[] args) {
        // Pedir el radio de una circunferencia y calcular su longitud
        double l,r; //Logitud y radio
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese el radio de una circunferencia: ");
        r=Entrada.nextDouble();
        l=2*Math.PI*r;
        System.out.print("La longitud de una circunferencia de radio " + r+ " es: " +l);
    }
    
}
