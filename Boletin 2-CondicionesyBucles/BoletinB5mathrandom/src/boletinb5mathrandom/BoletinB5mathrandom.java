
package boletinb5mathrandom;

import java.util.Scanner;

public class BoletinB5mathrandom {

    public static void main(String[] args) {
        // ejercicio 5 usando math.random
        int num,n;
        Scanner Entrada=new Scanner(System.in);
        n=(int)(Math.random()*100)+1;
        // en lugar de pedir n... podemos hacer que se n tome un valor
        // aleatorio entre 1 y 100.
        // Así el juego es algo más entretenido.

        System.out.print("Ingrese número: ");
        num=Entrada.nextInt();
        //n es el numero que hay que acertar
        //num guarda los numeros introducidos
        while(num!=n){// mientras no coincidan ambos números
            if(num>n){
                System.out.println("MENOR");
            }
            else{
                System.out.println("MAYOR");
            }
            System.out.print("Ingrese número: ");
            num=Entrada.nextInt();
        }
        //al salir del mientras tenemos la certeza que num es igual a n
        System.out.println("ACERTASTE...");
    }
    
}
