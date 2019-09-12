
package boletinb2;

import java.util.Scanner;

public class BoletinB2 {

    public static void main(String[] args) {
        // Leer un numero e indicar si es positivo o negativo
        //el proceso se repitira hasta que se ingrese 0
        int num;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese número: ");
        num=Entrada.nextInt();
        
        while(num!=0){//mientras num sea distinto de 0
          if(num>0){//mayor que cero:positivo
              System.out.println("Positivo");
          }
          else{//si no es positivo:es negativo
              System.out.println("Negativo");
          }
          // repetimos el proceso y volvemos a leer num  
          System.out.print("Ingrese otro número: ");
          num=Entrada.nextInt();
        }
        // Al salir del mientrs tenemos la certeza q num es 0
    }
    
}
