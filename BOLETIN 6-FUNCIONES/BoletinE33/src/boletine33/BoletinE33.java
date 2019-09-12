
package boletine33;

import java.util.Scanner;

public class BoletinE33 {
    static int fibo(int num)
    {
        int res;
        if(num==0)      // primer caso base
            res=0;
        else{
            if(num==1)  // segundo caso base
                 res=1;
            else
                res=fibo(num-1)+fibo(num-2);    // caso general recursivo
        }
        return(res);
    }
    public static void main(String[] args) {
        //  DUF que calcule el n-ésimo término de la serie de Fibonacci.
        //En esta serie el n-ésimo valor se calcula sumando los dos valores anteriores.
        Scanner tc=new Scanner(System.in);
        int num,resultado;
        System.out.print("Vamos calcular fibonacci(n).\nIntroduzca n (se recomienda n<40):  ");
        num=tc.nextInt();
        resultado=fibo(num); // si n es muy grande esto puede tardar bastante.
        System.out.println("\nfibonacci(" + num + ") = " +resultado);
           
    }
    
}
