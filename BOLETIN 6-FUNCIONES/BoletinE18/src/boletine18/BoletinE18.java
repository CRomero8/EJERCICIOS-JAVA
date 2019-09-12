package boletine18;

import java.util.Scanner;

public class BoletinE18 {
        static boolean es_primo(int num){
        boolean primo;
        int i;
        primo=true;
        i=2;
       
        while(i<num && primo==true){
            if(num%i==0)        // si num es divisible por i
                primo=false;    // si llego aquí es que num es divisible-> no es primo
               i++;
        }
        return(primo);
    }
    public static void main(String[] args) {
        // 18.Diseña una función (en adelante DUF) 
        //que decida si un número es primo.
        Scanner tc=new Scanner(System.in);
        boolean res;
        int num;
        System.out.print("Ingrese Número: ");
        num=tc.nextInt();
        if(es_primo(num))
            System.out.println("Es primo");
        else
            System.out.println("No es primo");

        
    }
    
}
