
package boletine21b;

import java.util.Scanner;

public class BoletinE21b {
    static int suma_n_impares (int n){
        int suma=0;
        for (int i =1; i <= 2*n-1 ; i+=2)   // el for irá 1, 3, 5, ....
                                            // hasta 2*n-1 (el n-ésimo impar)
            suma += i;
        return (suma);
    }
    public static void main(String[] args) {
        // del ejercicio 21
        Scanner tc=new Scanner(System.in);
        int n;
        System.out.print("Ingrese un numero: ");
        n =tc.nextInt();
        System.out.println("La suma de los " +n+ " primeros impares es: " +suma_n_impares (n));
      
    
 
    }
    
}
