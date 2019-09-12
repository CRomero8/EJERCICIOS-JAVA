package boletind2;

import java.util.Scanner;

public class BoletinD2 {

    public static void main(String[] args) {
        // leer 5 números y mostrarlos en orden inverso al ingreso.
        Scanner Entrada=new Scanner(System.in);
        int t[]=new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Ingrese un número: ");
            t[i]=Entrada.nextInt();
        }
        System.out.println("Los números en orden inverso: ");
        for (int i=4;i>=0;i--)
            System.out.println(t[i]);
    }
    
}
