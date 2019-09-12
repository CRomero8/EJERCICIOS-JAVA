
package boletine6;

import java.util.Scanner;

public class BoletinE6 {
    static void doble(int num){
    int doble;
        doble=(int)Math.pow(num,2); // calculamos el doble de num
        System.out.println("Su cuadrado es: " +doble);    
    }
    public static void main(String[] args) {
        // Función que muestra en pantalla el doble del valor que se le pasa como parámetro.
        Scanner tc=new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num=tc.nextInt();
        doble(num);

        
    }
    
}
