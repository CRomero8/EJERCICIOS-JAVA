
package boletine21;

import java.util.Scanner;

public class BoletinE21 {
    static int suma_n_impares (int n)
    {
        int suma=0;
        for (int i =1; i <=n ; i++)
            suma += 2*i-1;       // así calculamos el i-ésimo impar
        return (suma);
    }
    public static void main(String[] args) {
        //  Escriba una función que sume los n primeros números impares.
        Scanner tc=new Scanner(System.in);
        int n;
        System.out.print("Ingrese un numero: ");
        n =tc.nextInt();
        System.out.println("La suma de los " +n+ " primeros impares es: " +suma_n_impares (n));
      
    

    }
    
}
