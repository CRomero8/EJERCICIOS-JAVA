
package boletinb10;

import java.util.Scanner;

public class BoletinB10 {

    public static void main(String[] args) {
        // Pedir 15 numeros y escribir la suma total
        int num,suma_total;
        Scanner Entrada=new Scanner(System.in);
        suma_total=0;
        for (int i=1;i<=15;i++){
          System.out.print("Ingrese un número: ");
          num=Entrada.nextInt(); 
          suma_total=suma_total+num;
        }
        System.out.println("La suma total es de: "+suma_total);
    }
    
}
