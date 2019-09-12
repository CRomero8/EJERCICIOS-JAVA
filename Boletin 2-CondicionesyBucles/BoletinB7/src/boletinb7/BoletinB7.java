
package boletinb7;

import java.util.Scanner;

public class BoletinB7 {

    public static void main(String[] args) {
        // Pedir números hasta que se ingrese uno negativo,
        //y calcular la media.
        int num,suma,elementos;
        float media; //la media puede tener decimales
        
    // num: guardará los números introducidos por el usuario
    // suma: almacenará la suma de todos los números introducidos
    // elementos: será un contador que indicará el números de números 80 elementos) ingresados
      
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num=Entrada.nextInt();
        
        suma=0;
        elementos=0;
        
        while(num>=0){ //nos interesan los positivos y el cero
            suma+=num;
            elementos++;
            System.out.print("Ingrese otro número: ");
            num=Entrada.nextInt();
        }
        if (elementos==0){//daria un error de division por 0
            System.out.print("IMPOSIBLE HACER LA MEDIA"); 
        }
        else{
            media=(float)suma/elementos;
            System.out.print("La media es de: " + media);
            }

    }
    
}
