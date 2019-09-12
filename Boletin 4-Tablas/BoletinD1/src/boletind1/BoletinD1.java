
package boletind1;
import java.util.Scanner;
public class BoletinD1 {

    public static void main(String[] args) {
        // leer 5 numeros y mostrarlos en el mismo orden introducido.
        Scanner Entrada=new Scanner(System.in);
        int num[];
        num=new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Ingrese un número: ");
            num[i]=Entrada.nextInt();
        }
        System.out.println("Los números son: ");
        for (int i=0;i<5;i++)
            System.out.println(num[i]);
    }
    
}
