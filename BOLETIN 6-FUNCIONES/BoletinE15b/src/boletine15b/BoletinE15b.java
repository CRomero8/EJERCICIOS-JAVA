
package boletine15b;

import java.util.Scanner;

public class BoletinE15b {
    // el mínimo común múltiplo de a y b, es el número más pequeño que
    // es divisible por a y b.
    // Para calcularlo podríamos utilizar algún algoritmo existente o hacerlo
    // un poco por la "cuenta de la vieja".
    // La idea es elegir el mayor de a y b, y multiplicarlo por i, hasta que
    // el número resultante sea divisible por el menor(a,b)
    static int min_comun_multiplo (int a, int b)
    {
        int mcm=1;
        int max;
        int i;
       
        max = maximo (a, b);
        mcm =max;   // en principio el mcm es el mayor de los dos números
        i=1;
        while (mcm%a!=0 || mcm%b!=0)   // si el mcm no es divisible por a y b
        {
            i++;
            mcm=max*i;      // el nuevo mcm sera el mayor por i
           
        }
       
        return(mcm);
    }
      static int maximo (int a, int b){
        int max;
        if(a>b)
            max=a;
        else 
            max=b;
        return(max);
    }
    public static void main(String[] args) {
       Scanner tc=new Scanner(System.in);
        int a, b, c, mcm;
        System.out.print ("Ingrese Número a: ");
        a=tc.nextInt();
        System.out.print ("Ingrese Número b: ");
        b=tc.nextInt();
        System.out.print ("Ingrese Número c: ");
        c=tc.nextInt();
        System.out.println("");
        // reutilizamos la función mcm pensada para dos números y aprovechamos
        // la propiedad conmutativa del mcm.
       mcm = min_comun_multiplo (a, b);
       mcm = min_comun_multiplo (mcm, c);
      
        System.out.println("El mcm es: " +mcm);

    }
    
}
