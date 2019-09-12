package boletinb20;

import java.util.Scanner;

public class BoletinB20 {

    public static void main(String[] args) {
        // Pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo
        int sueldo,sueldo_max;
        int n;
        Scanner Entrada=new Scanner(System.in);
        sueldo_max=0;//como los sueldos son positivos, inicializamos el sueldo
                        //maximo a cero
        System.out.print("Número de Sueldo: ");
        n=Entrada.nextInt();
        System.out.println("**************************");
        
        for(int i=1;i<=n;i++){
            System.out.print("Ingrese Sueldo: ");
            sueldo=Entrada.nextInt();
            
            if(sueldo>sueldo_max)
                sueldo_max=sueldo;
                //si leemos un sueldo mayor que el maximo,este sueldo sera el nuevo maximo            
        }
        System.out.println("El sueldo máximo es: " +sueldo_max);
    }
    
}
