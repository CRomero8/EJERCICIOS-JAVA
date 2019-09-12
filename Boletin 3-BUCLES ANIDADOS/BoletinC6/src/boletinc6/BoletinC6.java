
package boletinc6;

import java.util.Scanner;

public class BoletinC6 {

    public static void main(String[] args) {
 //Realizar un programa que nos pida un número n, 
 //y nos diga cuantos números hay entre 1 y n que son primos. 
        Scanner Entrada=new Scanner(System.in);
        int j,num,cont_primos;
        boolean primo;
        
        cont_primos=0;
        System.out.print("Ingrese número: ");
        num=Entrada.nextInt();
        
        // vamos procesando todos los números entre 1..num
        for (int i=2;i<=num;i++){
        //para cada numero i, calcularemos si es primo
        //veremos si el numero i es divisible en el rango 2..i-1
        //el bucle while se puede hacer con menos vuelta . consulatar algoritmos para primos
        primo=true;
        j=2;
        while (j<=i-1 && primo==true){
            if (i%j==0)
                primo=false;
        j++;    
        }
        if (primo==true){
            cont_primos++; //si es primo incrementamos el contador de primos
            System.out.println(i+(" es primo"));
        }
        }
        System.out.println("En el rango 2..." + num + ", hay "+ cont_primos + " Números primos");
    }
    
}
