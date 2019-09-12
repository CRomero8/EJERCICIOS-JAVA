
package boletinb5;

import java.util.Scanner;

public class BoletinB5 {

    public static void main(String[] args) {
    // Realizar un juego para adivinar un número. Para ello pedir un número N, 
   //y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor 
   //con respecto a N. El proceso termina cuando el usuario acierta.
        int num,n;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Acierta un número (n): ");
        n=Entrada.nextInt();
        System.out.print("Ingrese número: ");
        num=Entrada.nextInt();
        //n es el numero que hay que acertar
        //num guarda los numeros introducidos
        while(num!=n){ //mientras no coincidan ambos números
            
            if(num>n){
                System.out.println("MENOR");
            }
            else{
                System.out.println("MAYOR");
            }
            System.out.print("Ingrese número: ");
            num=Entrada.nextInt();
        } 
        //Al salir del mientras tenemos la certeza que num es igual a n
        System.out.println("ACERTASTE...");
    }
    
}
