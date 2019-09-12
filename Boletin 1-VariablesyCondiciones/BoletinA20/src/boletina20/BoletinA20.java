
package boletina20;

import java.util.Scanner;

public class BoletinA20 {

    public static void main(String[] args) {
        // Pedir una hora de la forma hora, min seg, mostrar la hora en el
        //segundo siguiente
        int h,m,s;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese Hora: ");
     h=Entrada.nextInt();
     System.out.print("Ingrese Minutos: ");
     m=Entrada.nextInt();
     System.out.print("Ingrese Segundos: ");
     s=Entrada.nextInt();
     //suponemos que al hora ingresada es correcta
     //incrementamos los segundos
     s++;
     //si los segundos superan 59, lo reiniciamos a 0 e incrementamos los minutos
     if (s>=59){
         s=0;
         m++;
     
     // si los minutos superan 59, lo reiniciamos a 0 e incrementamos la hora
     if (m>=59){
         m=0;
         h++;
         //si la hora supera 23, lo reiniciamos a 0
     if (h>=24){
         h=0;
      }         
     }
     }
     System.out.println("Fecha: "+ h + ":"+ m + ":" + s);
    }
    
}
