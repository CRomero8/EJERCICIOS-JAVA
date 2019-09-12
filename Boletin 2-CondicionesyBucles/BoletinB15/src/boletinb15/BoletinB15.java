package boletinb15;

import java.util.Scanner;

public class BoletinB15 {

    public static void main(String[] args) {
  // Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, 
  //la cantidad dealumnos mayores de 18 años, y
  //la cantidad de alumnos que miden más de 1.75.
        Scanner Entrada=new Scanner(System.in);
        int edad,media_edad,suma_edad,mayor_edad,mayor_175;//mayor_edad: mayores de 18 años
        double altura,media_altura,suma_altura;
        mayor_edad=0;
        media_altura=0;
        mayor_175=0;
        suma_edad=0;
        suma_altura=0;
        
        for (int i=1;i<=5;i++){
            System.out.println("Alumno " +i);
            System.out.print("Ingrese Edad: ");
            edad=Entrada.nextInt();
            System.out.print("Ingrese Altura: ");
            altura=Entrada.nextInt();
            if(edad>18)
                mayor_edad++;
            
            if(altura>175)
                mayor_175++;
            
            suma_edad=suma_edad+edad;
            suma_altura=suma_altura+altura;
        }
        media_edad=suma_edad/5;
        media_altura=suma_altura/5;
        
        System.out.println("La edad media es de: "+media_edad);
        System.out.println("La altura media es de: "+media_altura);
        System.out.println("Mayor de 18 años: "+mayor_edad);
        System.out.println("Mayor de 1.75: "+mayor_175);
               
    }
    
}
