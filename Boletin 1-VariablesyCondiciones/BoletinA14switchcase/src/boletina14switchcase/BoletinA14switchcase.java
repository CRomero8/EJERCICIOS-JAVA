/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina14switchcase;

import java.util.Scanner;

public class BoletinA14switchcase {

    public static void main(String[] args) {
        // notas con swich case
        int nota;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese una nota: ");
     nota=Entrada.nextInt();
     switch(nota){
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
            System.out.println("INSUFICIENTE");
            break;
         case 5:
            System.out.println("SUFICIENTE");
            break;
         case 6:
            System.out.println("BIEN");
            break;
         case 7:
         case 8:
            System.out.println("NOTABLE");
            break;
         case 9:
         case 10:
            System.out.println("SOBRESALIENTE");
            break;
         default:
            System.out.println("ERROR");
            break;
     }
    }
    
}
