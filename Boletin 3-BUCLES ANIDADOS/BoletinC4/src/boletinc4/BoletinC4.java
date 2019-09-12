
package boletinc4;

import java.util.Scanner;

public class BoletinC4 {

    public static void main(String[] args) {
        // Dibuja un  cuadrado de n elementos de lado utilizando *
        Scanner Entrada=new Scanner(System.in);
        int n;//tamaño del lado
        int fila,columna;
        
        System.out.print("Lado del cuadrado: ");
        n=Entrada.nextInt();
        
        for (fila=1;fila<=n;fila++){
            for (columna=1;columna<=n;columna++)
                System.out.print("* ");
            System.out.println("");
        }
    }
    
}
