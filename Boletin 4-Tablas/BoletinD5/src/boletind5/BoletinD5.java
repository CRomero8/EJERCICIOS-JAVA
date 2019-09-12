
package boletind5;

import java.util.Scanner;

public class BoletinD5 {

    public static void main(String[] args) {
        // Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera 
        //de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
        Scanner tc=new Scanner(System.in);
        int a[],b[],c[];
        int i,j;
        a=new int[5];
        b=new int[5];
        c=new int[10];
        
        System.out.println("Leyendo la tabla A");
        for(i=0;i<5;i++){
            System.out.print("Número: ");
            a[i]=tc.nextInt();
        }
        System.out.println("Leyendo la tabla B");
        for(i=0;i<5;i++){
            System.out.print("Número: ");
            b[i]=tc.nextInt();
        }
        // asignaremos los elementos de la tabla c
        // para las tablas a y b utilizaremos como índice i
        // y para la tabla c utilizaremos como índice j.
        j=0;
        for (i=0;i<5;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.println("La tabla C queda: ");
        
        for(j=0;j<10;j++)
            System.out.println(c[j]+" ");
            
        System.out.println(" ");
        
    }  
}
