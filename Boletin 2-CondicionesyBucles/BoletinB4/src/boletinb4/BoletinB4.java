
package boletinb4;

import java.util.Scanner;

public class BoletinB4 {

    public static void main(String[] args) {
        // Pedir números hasta que se ingrese un negativo
        //mostar cuantos numeros se han ingresado
        int num,contador;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese número: ");
        num=Entrada.nextInt();
        
        contador=0; //al inicio el numero de numeros ingresados es 0
        while(num>0){ //mientras num sea positiva
            contador++; //contador toma el valor que tuviera en este momento mas uno
                        //En definitiva, contador se incrementa en uno.
            System.out.print("Ingrese otro número: ");
            num=Entrada.nextInt();
        }
        System.out.println("Se han Ingresado: "+ contador + " números");
        //sin tener en cuenta el último número negativo
    }
    
}
