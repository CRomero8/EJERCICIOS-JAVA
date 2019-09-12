
package boletina19;

import java.util.Scanner;

public class BoletinA19 {

    public static void main(String[] args) {
        // Pedir dos fechas y mostrar el número de días que hay de diferencia. 
        //Suponiendo todos los meses de 30 días.
        int dia1,mes1,año1;
        int dia2,mes2,año2;
        int total_dias;
     Scanner Entrada=new Scanner(System.in);
     System.out.println("FECHA 1:");
     System.out.print("Ingrese Día: ");
     dia1=Entrada.nextInt();
     System.out.print("Ingrese Mes: ");
     mes1=Entrada.nextInt();
     System.out.print("Ingrese Año: ");
     año1=Entrada.nextInt();
     
     System.out.println("FECHA 2:");
     System.out.print("Ingrese Día: ");
     dia2=Entrada.nextInt();
     System.out.print("Ingrese Mes: ");
     mes2=Entrada.nextInt();
     System.out.print("Ingrese Año: ");
     año2=Entrada.nextInt();
     // suponemos que las fecha introducidas son correctas
        // convertimos las dos fechas a días y calculamos la diferencia
     total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(año2-año1);
     System.out.println ("Días de diferencia: " + total_dias);

    }
    
}
