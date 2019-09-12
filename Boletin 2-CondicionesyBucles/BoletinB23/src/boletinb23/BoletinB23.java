
package boletinb23;

import java.util.Scanner;

public class BoletinB23 {

    public static void main(String[] args) {
        // Pedir 5 numeros e indicar si alguno es multiplo de 3
        Scanner Entrada=new Scanner(System.in);
        int num;
        boolean multiplo_3;
        multiplo_3=false;
        
        for (int i=0;i<5;i++){
            System.out.print("Ingrese un número ");
            num=Entrada.nextInt();
            
            if (num%3==0)
                multiplo_3=true;//si se ejecuta esta instruccion significa que al menos hay un multiplo de 3               
        }
        if (multiplo_3==false)
             System.out.println("No existen múltiplos de 3");
        else
            System.out.println("Hay múltiplos de 3");
    }
    
}
