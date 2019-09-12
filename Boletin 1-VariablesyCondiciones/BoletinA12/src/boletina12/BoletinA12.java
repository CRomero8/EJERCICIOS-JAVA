/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina12;

import java.util.Scanner;

public class BoletinA12 {

    public static void main(String[] args) {
        // Pedir un numero entre 0 y 9999 y mostrarlo cn cifras al reves.
        int num;
        int dm,um,c,d,u;
        
        // 99999 a cada guarismo lo llamaremos:
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese un número entre 0 y 99,999: ");
     num=Entrada.nextInt();
     u=num%10; //unidad
     num=num/10;
     d=num%10; //decenas
     num=num/10;
     c=num%10; //centena
     num=num/10;
     um=num%10; //unidad de millar
     num=num/10;
     dm=num; //decenas de millar
     // Lo imprimimos al reves
     System.out.println(u +"" + d + "" + c + "" + um + "" + dm );

    }
    
}
