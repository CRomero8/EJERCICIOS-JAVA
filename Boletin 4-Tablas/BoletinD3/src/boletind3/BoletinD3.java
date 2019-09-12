
package boletind3;
import java.util.Scanner;
public class BoletinD3 {

    public static void main(String[] args) {
        // 3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, 
        //la mediade los negativos y contar el número de ceros.
        Scanner tc=new Scanner(System.in);
        int []n = new int [5];
        int sps=0,contps=0,sng=0,contng=0,contz=0;
        
            for (int i=0;i<5;i++){
                System.out.print("Ingrese un número: ");
                n[i]=tc.nextInt();
            }
            for (int i=0;i<5;i++){
                if (n[i]==0)
                    contz++;
                else if(n[i]>0){
                    sps=sps+n[i];
                    contps++;
                }else{
                    sng=sng+n[i];
                    contng++;
                }
                    
            }
            if(contps==0)
                System.out.println("No se puede realizar la media de números positivos");
            else
                System.out.println("La media de los positivos: "+(float)sps/contps);
            if(contng==0)
                System.out.println("No se puede realizar la media de números negativos");
            else
                System.out.println("La media de los negativos: "+(float)sng/contng);
            
            System.out.println("La cantidad de ceros es de: "+ contz);
    }
    
}
