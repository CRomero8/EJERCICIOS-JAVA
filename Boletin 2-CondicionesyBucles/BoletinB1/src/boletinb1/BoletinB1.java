
package boletinb1;

import java.util.Scanner;

public class BoletinB1 {

    public static void main(String[] args) {
        // Pedir un numero y mostrar su cuadrado, repetir el proceso hasta
        //que se ingrese un numero negativo
        int num,cuadrado;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese número: ");
        num=Entrada.nextInt();
        
     while(num>=0){// repetir mientras el numero leido no sea negativo
         cuadrado=num*num;
         System.out.println(num+ " Es igual a "+ cuadrado);
         System.out.print("Ingrese otro número: ");
         num=Entrada.nextInt();       
     }
     
    }
    
}
