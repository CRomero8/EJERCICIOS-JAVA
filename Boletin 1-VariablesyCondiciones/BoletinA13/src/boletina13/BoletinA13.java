
package boletina13;

import java.util.Scanner;

public class BoletinA13 {

    public static void main(String[] args) {
        // Pedir un numero entre 0 y 9999 y decir si es capicua.
        int num;
        int dm,um,c,d,u;
        boolean capicua = false;//suponemos que el numero no es capicua
        Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese un número entre 0 y 99,999: ");
     num=Entrada.nextInt();
     u=num%10; //unidad
     num=num/10;
     d=num%10; //decenas
     num=num/10;
     c=num%10; //centena
     num=num/10;
     um=num%10; //unidad de millar
     num=num/10;
     dm=num; //decenas de millar
     
     //El numero sera capicua si las cifras son 2 a 2 por los estremos 
     //si el numero tiene 5 cifras (dm,um,c,d,u)
     if (dm==u&&um==d){ 
         capicua=true;
     }
     //si el numero tiene 4 cifras (0,um,c,d,u)
     if (dm==0&&um==u&&c==d){
         capicua=true;
     }
     //si el nuemro tiene 3 cifras(0,0,c,d,u)
     if (dm==0&&um==0&&c==u){
         capicua=true;
     }
     //si el numero tiene 2 cifras(0,0,0,d,u)
     if (dm==0&&um==0&&c==0&&d==u){
         capicua=true;
     }
     // se entiende que un numero de una cifra no es capicua
     if (capicua){
         System.out.println("El numero es capicua");  
     }
     else{
         System.out.println("El numero NO es capicua");  
     }
    
    }
    
}
