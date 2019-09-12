
package boletinb12;

import java.util.Scanner;

public class BoletinB12 {

    public static void main(String[] args) {
        // Pedir un numero y calcular su factorial
        // long factorial con long se puede calcular hasta el factorial de 25
        double factorial;
        int num;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num=Entrada.nextInt();
        factorial=1; // es importante inicializarlo a 1, ya que multiplicará
       
        // por ejemplo: el factorial de 10 es:
        // 10*9*8*7*6*5*4*3*2*1
        for (int i=num;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("El factorial de " + num+ " es: " +factorial);
    }
    
}
