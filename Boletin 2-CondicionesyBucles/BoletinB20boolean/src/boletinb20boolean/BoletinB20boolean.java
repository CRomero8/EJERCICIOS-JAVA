
package boletinb20boolean;

import java.util.Scanner;

public class BoletinB20boolean {

    public static void main(String[] args) {
        // otra forma del ejercicio 20 usando boolean
        boolean primer_sueldo_asignado;
        //esta bandera indica si hemos asignado el el primer sueldo como sueldo maximo
        //con esto podemos tener sueldos negativos
        int sueldo,sueldo_max=0;
        int n;
        Scanner Entrada=new Scanner(System.in);
        primer_sueldo_asignado=false;
        
        System.out.print("Número de sueldos: ");
        n=Entrada.nextInt();
        System.out.println("**************************");
        
        for(int i=1;i<=n;i++){
            System.out.print("Ingrese Sueldo: ");
            sueldo=Entrada.nextInt();
            if (primer_sueldo_asignado==false){
                //asignamos como maximo el primer sueldo leido
                sueldo_max=sueldo;
                primer_sueldo_asignado=true;
            }
            if (sueldo>sueldo_max)
                sueldo_max=sueldo;
                //si leemos un sueldo mayor que el maximo, este sueldo sera el nuevo maximo
               
        }
        System.out.println("El sueldo máximo es: " +sueldo_max);
    }
    
}
