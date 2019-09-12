
package boletinb6;

import java.util.Scanner;

public class BoletinB6 {

    public static void main(String[] args) {
        // Pedir números hasta que se ingrese 0, 
        //mostrar la suma de todos los números introducidos.
          int num,suma;
          Scanner Entrada=new Scanner(System.in);
          suma=0;
          
          do{
           System.out.print("Ingrese número: ");
           num=Entrada.nextInt(); 
           
           suma=suma+num;
            }
         while(num!=0);
         System.out.println("La suma de todos los números es: "+suma); 
    }
    
}
