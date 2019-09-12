package boletinb19;

import java.util.Scanner;

public class BoletinB19 {

    public static void main(String[] args) {
        // Dadas 6 notas, escribir la cantidad de alumnos aprobados, 
        //condicionados (=4) y suspensos
        int nota,aprobados,desaprobados,condicionados;
        Scanner Entrada=new Scanner(System.in);
        aprobados=0;
        desaprobados=0;
        condicionados=0;
        
        for(int i=1;i<=6;i++){
            System.out.print("Ingrese nota entre 0 y 20: ");
            nota=Entrada.nextInt();
            if(nota==4)
                condicionados++;
            else if(nota>10)
                aprobados++;
            else if(nota<10)//este if sobra, ya que es el unico caso posible
                desaprobados++;
                
        }
        System.out.println("Aprobados: "+ aprobados);
        System.out.println("Desaprobados: "+ desaprobados);
        System.out.println("Condicionados: "+ condicionados);
    }
    
}
