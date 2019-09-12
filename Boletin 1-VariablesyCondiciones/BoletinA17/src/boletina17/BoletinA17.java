/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina17;

import java.util.Scanner;

public class BoletinA17 {

    public static void main(String[] args) {
        // 17. Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente.
       //suponer que todos los meses tienen 30 días.
       int dia,mes,año;
    
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese Día: ");
     dia=Entrada.nextInt();
     System.out.print("Ingrese Mes: ");
     mes=Entrada.nextInt();
     System.out.print("Ingrese Año: ");
     año=Entrada.nextInt();
     //suponemos que la fecha ingresada es correcta
     //incrementamos el dia
     dia++;
     //si el dia supera 30, lo reiniciamos a 1 e incremenamos el mes
     if(dia>=30){
         dia=1;
         mes++;
         //si el me supera 12, lo reiniciamos a 1 e incremestamos el año
     }
     if (mes>=12){
         mes=1;
         año++;
     }
     // habría que tener en cuenta que el año pasa del -1 al +1
     // en este código pasaríamos del año -1 al 0 (que nunca existió)
     // para corregirlo:
     if (año==0){
         año=1;
         System.out.println(dia + "/" + mes + "/" + año);
      }
    }
    
}
