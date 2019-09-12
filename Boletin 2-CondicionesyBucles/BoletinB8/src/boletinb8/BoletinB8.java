
package boletinb8;

import java.util.Scanner;

public class BoletinB8 {

    public static void main(String[] args) {
        // Pedir un numero n, y mostrar todos los numeros del 1 al n.
        int i,num;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num=Entrada.nextInt();
        
        i=1;
        //i es el contador que tomará los valores de 1 a n
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
    
}
