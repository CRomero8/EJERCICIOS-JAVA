
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        // Los siguientes programas piden una serie de datos y tras procesarlos 
        //ofrecen unos resultados por
            //pantalla. Mostrar el resultado:
            Scanner Entrada=new Scanner(System.in);
         int n=0, i;
        /* la idea de este ejercicio es hacer una traza de forma manual, y tras ésta, escribir el código
        equivalente para comprobar el resultado. Debemos destacar que este algoritmo no tiene sentido
        ni hace nada en concreto incluso con otros datos de entrada el algoritmo puede dar un error,
        al utilizar datos como índices de tablas sin las pertinentes comprobaciones.
        */
        int a[] = {6, 2, 8, 9, 2, 5, 8, 2, 6, 1};
        int b[] = new int [10];
        for (i=0; i<=n; i++)
        
        a[i] = Entrada.nextInt();
        // podemos sustituir la declaración de a y la lectura de datos por la siguiente línea:
        // int a[] = {6, 2, 8, 9, 2, 5, 8, 2, 6, 1};
        n = 10;
        
        for (i=0; i<=n/2; i++) {
        b[i] = a[n-1-i];
        b[n-1-i] = a[i];
        }
        for (i=0; i<n; i++)
        if (i % 2 == 0)
        System.out.println (a[i]);
        else
        System.out.println (b[i]);
    }
    
}
