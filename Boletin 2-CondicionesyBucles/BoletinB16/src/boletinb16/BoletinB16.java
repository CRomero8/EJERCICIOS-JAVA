package boletinb16;

import java.util.Scanner;

public class BoletinB16 {

    public static void main(String[] args) {
        // Pide un numero (que debe estar entre 0 y 10)
        //y mostrar la tabla de multiplicar de dicho numero
        Scanner Entrada=new Scanner(System.in);
        int num;
        do{
          System.out.print("Ingrese número (de 0 a 10): ");
          num=Entrada.nextInt();
          }
        while(! (0<=num&&num<=10));
          System.out.println("Tabla del: " +num);
        
        for (int i=1;i<=10;i++){
          System.out.println(num + " x " + i + " = " + num*i);  
        }
    }
    
}
