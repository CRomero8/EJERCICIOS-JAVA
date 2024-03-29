
package boletine11;

import java.util.Scanner;

public class BoletinE11 {
     // el máximo común divisor de dos números es el número más grande que
    // es capaz de dividir a ambos números
    // Para calcularlo podríamos utilizar algún algoritmo existente o hacerlo
    // un poco por la "cuenta de la vieja".
    // La idea es dividir por todos los números desde 1 hasta mínimo(a, b)
    // y quedarnos con el mayor.
    static int max_comun_divisor (int a, int b){
        int mcd=1;
        int min;
        min = minimo (a,b);
        mcd=1; // existe un mcd seguro, el 1, que divide a y b.
        for (int i=2;i<=min;i++)
            if( a%i==0 && b%i==0) // si i divide a "a" y "b"
                    mcd=i;        // i será el nuevo mcd.
        return(mcd);
    }
      static int minimo(int a, int b){
        int min;
        if(a>b)
            min=b;
        else
            min=a;
        return(min);
    }
    public static void main(String[] args) {
        //Escribir una función que calcule el máximo común divisor 
        //de dos números.
        Scanner tc=new Scanner(System.in);
        int a, b, mcd;
        System.out.print("Ingrese número: ");
        a=tc.nextInt();
        System.out.print("Ingrese otro número: ");
        b=tc.nextInt();
        System.out.println("");
        mcd = max_comun_divisor (a, b);
        System.out.println("El mcd de "+a+" y "+b+" es: "+mcd);  
    }
    
}
