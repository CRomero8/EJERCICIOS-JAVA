
package boletine5;

import java.util.Scanner;

public class BoletinE5 {

    static void ver (int a,int b){
        // Función a la que se le pasan dos enteros y 
        //muestra todos los números comprendidos entre ellos,inclusive.
        int mayor, menor;
        // desconocemos el orden en el que vienen a y b.
        // Lo que haremos es poner los valores correctos en mayor, menor.
       
        if(a>b){ // a es el mayor. Se podría utilizar la función maximo() implementada anteriormente.
            mayor=a;
            menor=b;
        }
        else{   // en este caso b será el mayor
         mayor=b;
            menor=a;
        }
        for (int i=menor;i<=mayor;i++)
            System.out.print(i+"  ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        int a,b;
        System.out.print("Ingrese primer numero: ");
        a=tc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        b=tc.nextInt();
       
        ver(a,b);

        
    }
    
}
