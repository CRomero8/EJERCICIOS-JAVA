
package boletine30;

import java.util.Scanner;

public class BoletinE30 {
    /* sobrecargamos la función para que funcione tanto con bases enteras
     * como reales
     *
     */
    static int potencia (int a, int n) {
        int res;
        if (n == 0) // el caso base: cuando el exponente es 0
            res = 1;
        else
            // caso recursivo: a^n = a *a^n-1
       
            res = a * potencia(a, n - 1);
        return (res);
    }
    static double potencia (double a, int n) {
        double res;
        if (n == 0)
            res = 1;
        else
            res = a * potencia(a, n - 1);
        return (res);
    }
    public static void main(String[] args) {
        //  DUF recursiva que calcule a
        Scanner tc=new Scanner(System.in);
        double num, resultado;
        int potencia;
        System.out.print("Ingrese base (real): ");
        num = tc.nextDouble();
        System.out.print("Ingrese la potencia: ");
        potencia = tc.nextInt();
        resultado = potencia(num, potencia);
        System.out.println("El resultado es: " + resultado);

    }
    
}
