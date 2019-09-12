
package boletind10resto;

import java.util.Scanner;

public class BoletinD10resto {

    public static void main(String[] args) {
        // del ajercicio anterior, usando el resto de una division.
        Scanner tc=new Scanner(System.in);
        int n[]=new int[5];
        int d;
        // leemos la tabla
        for (int i=0;i<5;i++){
            System.out.print("Ingrese número: ");
            n[i]=tc.nextInt();
        }
        // preguntamos cuantas posiciones desea desplazar
        System.out.print("Posiciones a desplazar:" );
        d = tc.nextInt();
        // en el caso de desplazar una posición: necesitamos guardar solo un elemento (el último que
        // pasa a ser el primero)
        // en el caso de desplazar dos posiciones: necesitamos guardar dos elementos (penúltimo y
        // último, que pasarán a ser primero y segundo)
        // como a priori no sabemos cuantos elementos vamos a desplazar, ni cuantos elementos tenemos
        // que guardar. Una buena solución es hacer una copia de la tabla completa
        int copia[] = n.clone();
        // desplazamos hacia abajo n posiciones
        for (int i=0;i<5;i++)
            n[i] =copia[(i+d)%5];
            // la tabla funciona como si fuese circular por eso utilizamos el módulo
        System.out.println("La tabla queda:");
        for (int i=0;i<5;i++)
            System.out.println(n[i]);

    }
    
}
