
package boletinb22;

import java.util.Scanner;

public class BoletinB22 {

    public static void main(String[] args) {
        // Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
        Scanner Entrada=new Scanner(System.in);
        int notas;
        boolean desaprobados;
        desaprobados=false;//suponemos que en principio no hay ningun desaprobado
        
        for (int i=0;i<5;i++){
            System.out.print("Ingrese nota (de 0 a 20): ");
            notas=Entrada.nextInt();
            if(notas<=10)
                desaprobados=true;
        }
        if (desaprobados)
            System.out.println("Hay alumnos desaprobados ");
        else
            System.out.println("No hay desaprobados ");
    }
    
}
