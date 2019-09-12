
package boletine2;

import java.util.Scanner;

public class BoletinE2 {
    static int maximo(int a, int b){  // suponemos que los tres números serán distintos
        int max;
       
        if(a>b)
            max=a;
        else
            max=b;
        return(max);
    }

    public static void main(String[] args) {
        // Diseñar una función que tenga como parámetros dos números,
        //y que calcule el máximo. 
        Scanner tc=new Scanner(System.in);
        int max;
        int a,b;
        System.out.print("Ingrese un numero: ");
        a=tc.nextInt();
        System.out.print("Ingrese otro numero: ");
        b=tc.nextInt();
      
        max =maximo (a, b);
        System.out.println("El número mayor es: " +max);

    }
    
}
