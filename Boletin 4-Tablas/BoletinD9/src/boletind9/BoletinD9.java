
package boletind9;

import java.util.Scanner;

public class BoletinD9 {

    public static void main(String[] args) {
        //Crear un programa que lea por teclado una tabla de 10 números enteros y
        //la desplace una posición hacia abajo: el primero pasa a ser el segundo, 
        //el segundo pasa a ser el tercero y así sucesivamente. 
        //El último pasa aser el primero.
        Scanner tc=new Scanner(System.in);
        int n[]=new int[5];
        int ultimo;
        // leemos la tabla
        for (int i=0;i<5;i++){
            System.out.print("Ingrese número: ");
            n[i]=tc.nextInt();
        }
        // guardamos el último elemento de la tabla
        ultimo = n[4];
        // desplazamos hacia abajo (de 0 hacia la última posición)
        // al desplazar perdemos el último valor, por eso lo hemos guardado antes.
        for (int i=3;i>=0;i--)
            n[i+1]=n[i];
        // el último valor pasa a ser el primero
        n[0] =ultimo;
      
        System.out.println("La tabla queda:");
        for (int i=0;i<5;i++)
            System.out.println(n[i]);

    }
    
}
