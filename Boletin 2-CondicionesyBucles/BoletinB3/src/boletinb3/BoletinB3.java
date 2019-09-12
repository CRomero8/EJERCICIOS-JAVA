
package boletinb3;

import java.util.Scanner;

public class BoletinB3 {

    public static void main(String[] args) {
        // Leer números hasta que se ingrese 0,
        //Para cada uno indica par o impar
        int num;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese número: ");
        num=Entrada.nextInt();
        
        while(num!=0){
            if(num%2==0){//Si el resto de dividir entre 2 es 0. Esto indica par
              System.out.println("NÚMERO PAR");
            }
            else{//caso contrario es impar
              System.out.println("NÚMERO IMPAR");  
            }
        // repetimos el proceso y volvemos a leer num  
          System.out.print("Ingrese otro número: ");
          num=Entrada.nextInt();
        }
        //al salir del mientras tenemos la certeza que num es 0 
    }
    
}
