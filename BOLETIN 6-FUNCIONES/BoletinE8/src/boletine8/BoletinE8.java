
package boletine8;

import java.util.Scanner;

public class BoletinE8 {
    static double[] area_y_volumen_cilindro(double radio, double altura)
    {
        double volumen,area;
        double calculo[];
        
        calculo = new double [2]; // [0] para el volumen y [1] para el área
        calculo[0] =Math.PI*radio*radio*altura; // radio*radio es el radio al cuadrado
                 
        calculo[1] =2*Math.PI*radio*altura + 2*Math.PI*radio*radio;
        return (calculo);
    }
    public static void main(String[] args) {
        // Ídem que devuelva una tabla con el área y el volumen.
        Scanner tc=new Scanner(System.in);
        double radio,alt;
        double resultado[]; //esta tabla no necesita new, ya que apunta a
                            // la tabla creada dentro de la función
        System.out.print("Ingrese radio: ");
        radio=tc.nextDouble();
        System.out.print("Ingrese altura: ");
        alt=tc.nextDouble();
       
        resultado =area_y_volumen_cilindro(radio,alt); // resultado hace referencia a la tabla devuelta
                                                       // por la función.
        System.out.println("El volumen es de: " +resultado[0]);
        System.out.println("El área es de: " +resultado[1]);
    }
    
}
