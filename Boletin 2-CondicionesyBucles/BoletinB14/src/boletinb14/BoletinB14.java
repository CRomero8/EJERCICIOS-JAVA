
package boletinb14;

import java.util.Scanner;

public class BoletinB14 {

    public static void main(String[] args) {
        // pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de S/.1000
        Scanner Entrada=new Scanner(System.in);
        int sueldo,suma,mayor_1000;
        suma=0;
        mayor_1000=0;
        
        for (int i=1;i<=5;i++){
        System.out.print("Ingrese un Sueldo: ");
        sueldo=Entrada.nextInt();
        if(sueldo>1000)
              mayor_1000++; 
              suma=suma+sueldo;
        }
        System.out.println("Mayores de S/.1000 hay: "+mayor_1000);
        System.out.println("La suma es de: "+suma);
    }
    
}
