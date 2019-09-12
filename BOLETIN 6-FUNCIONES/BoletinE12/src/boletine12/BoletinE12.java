
package boletine12;

import java.util.Scanner;

public class BoletinE12 {
    // el máximo común divisor de tres números es el número más grande que
    // es capaz de dividir a todos números
    // Para calcularlo podríamos utilizar algún algoritmo existente o hacerlo
    // un poco por la "cuenta de la vieja".
    // La idea es dividir por todos los números desde 1 hasta mínimo(a, b, c)
    // y quedarnos con el mayor.
    static int max_comun_divisor (int a, int b, int c)
    {
        int mcd=1;
        int min;
        // para no implementar la función mínimo para tres números
        // utilizaremos la función con solo dos parámetros;
        min = minimo (a,minimo(b,c));
        mcd=1; // existe un mcd seguro, el 1, que divide a y b.
        for (int i=2;i<=min;i++)
            if( a%i==0 && b%i==0 && c%i==0) // si i divide a 'a', a 'b' y a 'c'
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
        //Ídem con tres números.
        Scanner tc=new Scanner(System.in);
        int a, b,c , mcd;
        System.out.print("Ingrese Número a: ");
        a=tc.nextInt();
        System.out.print("Ingrese Número b: ");
        b=tc.nextInt();
        System.out.print("Ingrese Número c: ");
        c=tc.nextInt();
        System.out.println("");
        mcd = max_comun_divisor (a, b, c);
        System.out.println("El mcd de ("+a+", "+b+", "+c+") es: "+mcd);
           
    }
    
}
