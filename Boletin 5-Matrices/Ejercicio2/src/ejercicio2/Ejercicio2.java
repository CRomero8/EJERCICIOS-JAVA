
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se obtiene la
        //misma tabla al cambiar las filas por columnas.
        Scanner Entrada=new Scanner(System.in);
        int t[][];
        boolean simetrica;
        int i,j;
        t = new int[4][4];
        for (i=0;i<4;i++){
        for (j=0;j<4;j++){
        System.out.print("Introduzca elemento ["+i+"]["+j+"]: ");
        t[i][j]=Entrada.nextInt();
        }
        }
        simetrica=true;
        i=0;
        while(i<4 && simetrica==true){
        j=0;
        while(j<i && simetrica==true){
        if(t[i][j]!=t[j][i])
        simetrica=false;
        j++;}
        i++;}
        if(simetrica)
        System.out.println("SIMETRICA");
        else
        System.out.println("NO ES SIMETRICA");
        
      }
    
}
