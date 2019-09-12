
package boletine31;

import java.util.Scanner;

public class BoletinE31 {
    static int factorial(int num){
        int res;
        if(num==0)  // caso base: 0! es igual a 1
            res=1;
        else
            res=num*factorial(num-1);   // n!= n*(n-1)*(n-2)... un ejemplo 3!=3*2*1
                                        // también ocurre que n!=n*(n-1)!
                                        // como ejemplo 4!=4*3!
        return(res);
    }
    public static void main(String[] args) {
        //Calcular el factorial de n recursivamente.
        Scanner tc=new Scanner(System.in);
        int num,resultado;
        System.out.print("Ingrese el número: ");
        num=tc.nextInt();
       
        resultado=factorial(num);
        System.out.println(num+"! es igual a "+resultado);

    }
    
}
