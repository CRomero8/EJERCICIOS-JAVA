
package boletine7;

import java.util.Scanner;

public class BoletinE7 {
    static void area_o_volumen_cilindro(double radio, double altura, char opcion){
       
         double volumen,area;
         switch (opcion){
                 
            case 'v':
                volumen =Math.PI*radio*radio*altura; // radio*radio es el radio al cuadrado
                System.out.println("El volumen es de: " +volumen);
                break;
                 
            case 'a':
                area = 2*Math.PI*radio*altura + 2*Math.PI*radio*radio;
                System.out.println("El área es de: "+area);
                break;
            default:
                System.out.println("Indicador del cálculo erróneo");
        }
    }
                     
    public static void main(String[] args) {
//. Realizar una función que calcule (muestre en pantalla) el área o el volumen de un cilindro, según
//se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v'
//(para el volumen). Además hemos de pasarle a la función el radio y la altura.
       Scanner tc=new Scanner(System.in);
        double radio,alt;
        char tipo_calculo;
        System.out.print("Introduzca radio: ");
        radio=tc.nextDouble();
        System.out.print("Introduzca altura: ");
        alt=tc.nextDouble();
        System.out.print("Que desea calcular (a/v): ");
        tipo_calculo =tc.next().charAt(0);
        System.out.println("");
       
        area_o_volumen_cilindro(radio,alt,tipo_calculo);
 

    }
    
}
