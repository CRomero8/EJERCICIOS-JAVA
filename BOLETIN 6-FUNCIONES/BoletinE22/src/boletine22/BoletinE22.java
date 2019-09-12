
package boletine22;

import java.util.Scanner;

public class BoletinE22 {
    static void informacion_angulo (double n)
    {
        // como las funciones que calculan el seno, coseno y tangente trabajan en
        // radianes, hemos de pasar n de grados a radianes
        n = Math.PI/180*n;      // otra forma sería n = Math.toRadians(n);
       
        System.out.println("seno: " + Math.sin(n));
        System.out.println("coseno: " + Math.cos(n));
        System.out.println("tangente: " + Math.tan(n));
    }
    public static void main(String[] args) {
        // 22. Dado el valor de un ángulo, sería interesante saber su seno, coseno y tangente. 
        //Escribir una función que muestre en pantalla los datos anteriores.
        Scanner tc=new Scanner(System.in);
        double angulo;
        System.out.print("Ingrese un ángulo (0..360): ");
       
        angulo =tc.nextInt();
              
        informacion_angulo (angulo);

    }
    
}
