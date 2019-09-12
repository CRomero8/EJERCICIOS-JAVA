
package boletine3;

import java.util.Scanner;

public class BoletinE3 {
    static int maximo(int a, int b, int c){
        int max;
       
        if(a>b && a>c) // si a es mayor que b y c, entonces a es el máximo
            max=a;
        else
            if(b>a && b>c) // si b es el mayor de todos, entonces b es el máximo
                max=b;
            else
                // si el máximo no es a ni b, será c
                max=c;
       
        return(max);
    }
    public static void main(String[] args) {
        // Ídem una versión que calcule el máximo de 3 números. 
        Scanner tc=new Scanner(System.in);
        int max;
        int a, b, c;
        System.out.print("Ingrese un numero: ");
        a=tc.nextInt();
        System.out.print("Ingrese otro numero: ");
        b=tc.nextInt();
        System.out.print("Ingrese el último: ");
        c=tc.nextInt();
        System.out.println("");
        max =maximo (a, b, c);
        System.out.println("El número mayor es: " +max);

    }
    
}
