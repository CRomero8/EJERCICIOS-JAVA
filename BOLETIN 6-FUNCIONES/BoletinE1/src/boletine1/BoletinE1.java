
package boletine1;

import java.util.Scanner;

public class BoletinE1 {

    public static void main(String[] args) {
        // Realizar una función, a la que se le pase como parámetro 
        //un número N, y muestre por pantalla N
        //veces, el mensaje: “Módulo ejecutándose”
        Scanner tc=new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero: ");
        num=tc.nextInt();
        System.out.println("---------------------------");
        mostrar(num);
        System.out.println("---------------------------");
    }
    static void mostrar(int num){
        for (int i=0;i<num;i++){
            System.out.println("Módulo ejecutándose");
        }

    }
    
}
