
package boletind6;

import java.util.Scanner;

public class BoletinD6 {

    public static void main(String[] args) {
        // Leer los datos correspondiente a dos tablas de 12 elementos numéricos, 
        //y mezclarlos en una tercera de laforma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
            Scanner tc=new Scanner(System.in);
        int a[],b[],c[];
        int i,j;
        a=new int[6];
        b=new int[6];
        c=new int[12];
         System.out.println("Leyendo la tabla A");
        for(i=0;i<6;i++){
            System.out.print("Número: ");
            a[i]=tc.nextInt();
        }
        System.out.println("Leyendo la tabla B");
        for(i=0;i<6;i++){
            System.out.print("Número: ");
            b[i]=tc.nextInt();
        }
        // asignaremos los elementos de la tabla c
        // para las tablas a y b utilizaremos como índice i
        // y para la tabla c utilizaremos como índice j.
        j=0;
        i=0;
        while(i<6){
            //copiamos 3 de a
            for(int k=0;k<3;k++){
                c[j]=a[i+k];
                j++;
            }
            //copiamos 3 de b
            for(int k=0;k<3;k++){
                c[j]=b[i+k];
                j++;
            }
            // como hemos copiado 3 de a y b, incrementamos la i en 3.
            i+=3;
            // la j se incrementa cada vez que se añade un elemento a la tabla c.
        }
        System.out.println("La tabla C queda: ");
        
        for(j=0;j<12;j++)// seguimos utilizando j, para la tabla c. Aunque se podría utilizar i.

            System.out.println(c[j]+" ");
            
        System.out.println(" ");
        
        
    }
    
}
