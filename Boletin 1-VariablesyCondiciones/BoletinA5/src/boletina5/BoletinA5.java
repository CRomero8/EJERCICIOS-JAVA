/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina5;

import java.util.Scanner;

public class BoletinA5 {

    public static void main(String[] args) {
    //Pedir un numero e indicar si es positivo o negativo.
        int num;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese un  números: ");
        num=Entrada.nextInt();
        
        if (num<0){
           System.out.println("Negativo");
        }
        else{
            // suponemos que el 0 es positivo.
            System.out.println("Positivo");
        }
    
    }
    
}
