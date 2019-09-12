

package boletind4;
import java.util.Scanner;
public class BoletinD4 {

    public static void main(String[] args) {
        // Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: 
        //el primero, el último, el segundo, elpenúltimo, el tercero, etc.
        Scanner tc=new Scanner(System.in);
        int i, n[]=new int[10];
        
        for(i=0;i<10;i++){
            System.out.print("Ingrese un número: ");
            n[i]=tc.nextInt();
        }
        System.out.println("El resultado es: ");
        for(i=0;i<=4;i++){
            System.out.println(n[i]);
            System.out.println(n[9-i]);
        }
        
    }
    
}
