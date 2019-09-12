
package boletina22;

import java.util.Scanner;

public class BoletinA22 {

    public static void main(String[] args) {
        // Pedir un numero de 0 a 99 y mostrarlo escrito.
        //para 56 mostrar cincuenta y seis
         int num,unidades,decenas;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese un número (0 a 99): ");
     num=Entrada.nextInt();
     
     unidades=num%10;
     decenas=num/10;
     switch(decenas){
         case 0:
             System.out.print("");
             break;
         case 1:
             System.out.print("DIEZ");
             break;
         case 2:
             System.out.print("VEINTE");
             break;
         case 3:
             System.out.print("TREINTA");
             break;
         case 4:
             System.out.print("CUARENTA");
             break;
         case 5:
             System.out.print("CINCUENTA");
             break;
         case 6:
             System.out.print("SESENTA");
             break;
         case 7:
             System.out.print("SETENTA");
             break;
         case 8:
             System.out.print("OCHENTA");
             break;
         case 9:
             System.out.print("NOVENTA");
             break;
             }
     System.out.print(" Y ");
     
     switch(unidades){
         case 0:
             System.out.print(" ");
             break;
         case 1:
             System.out.print(" UNO ");
             break;
         case 2:
             System.out.print(" DOS ");
             break;
         case 3:
             System.out.print(" TRES ");
             break;
         case 4:
             System.out.print(" CUATRO ");
             break;
         case 5:
             System.out.print(" CINCO ");
             break;
         case 6:
             System.out.print(" SEIS ");
             break;
         case 7:
             System.out.print(" SIETE ");
             break;
         case 8:
             System.out.print(" OCHO ");
             break;
         case 9:
             System.out.print(" NUEVE ");
             break;
        
             }
    }
    
}
