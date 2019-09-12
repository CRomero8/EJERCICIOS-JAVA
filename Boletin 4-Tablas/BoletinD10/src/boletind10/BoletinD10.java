
package boletind10;

import java.util.Scanner;

public class BoletinD10 {

    public static void main(String[] args) {
        // Ídem, desplazar N posiciones (N es introducido por el usuario).
         Scanner tc=new Scanner(System.in);
        int n[]=new int[5];
        int ultimo;
        int d;
        // leemos la tabla
        for (int i=0;i<5;i++){
            System.out.print("Ingrese número: ");
            n[i]=tc.nextInt();
        }
        // preguntamos cuantas posiciones se desea desplazar
        System.out.print("Posiciones a desplazar:" );
        d = tc.nextInt();
        // del ejercicio anterior tenemos una versión que desplaza una sola
        // posición. Si repetimos este proceso n veces, conseguiremos
        // desplazar n veces.
        // este algoritmo es muy fácil de implementar, pero es muy costoso en tiempo.
        for (int vueltas=1;vueltas <=d; vueltas++){
            // guardamos el último elemento de la tabla
            ultimo = n[4];
            // desplazamos hacia abajo (de 0 hacia la última posición)
            // al desplazar perdemos el último valor, por eso lo tenemos guardado.
            for (int i=3;i>=0;i--)
                n[i+1]=n[i];
            // el último valor pasa a ser el primero
            n[0] =ultimo;
        }
        System.out.println("La tabla queda:");
        for (int i=0;i<5;i++)
            System.out.println(n[i]);

    }
    
}
