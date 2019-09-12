package boletinb21;

import java.util.Scanner;

public class BoletinB21 {

    public static void main(String[] args) {
        // Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
        Scanner Entrada=new Scanner(System.in);
           int num;
           boolean hay_negativo;
        // la variable hay_negativo según los dos posibles valores indica:
        // false: no se ha introducido ningún número negativo
        // true: al menos hay un número negativo
        hay_negativo=false;
        //suponemos que no habra ningun neativo
        
        for (int i=1;i<=5;i++){
            System.out.print("Ingrese Número: ");
            num=Entrada.nextInt();
            
            if(num<0)
                hay_negativo=true;
            //si num es menor que cero, cambiamos el valor de hay_negativo a true            
        }
        if (hay_negativo==true)
            System.out.println("Se ha ingresado número(s) negativo(s)");
        else
            System.out.println("No hay ningún número negativo"); 
    }
    
}
