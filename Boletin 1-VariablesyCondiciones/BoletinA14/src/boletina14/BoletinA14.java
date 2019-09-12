/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina14;

import java.util.Scanner;

public class BoletinA14 {

    public static void main(String[] args) {
        // Pedir un nota de 0 a 10 y mostrarla de la forma:insuficiente,
        //suficiente, bien.
        int nota;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese una nota: ");
     nota=Entrada.nextInt();
     //tanto lo ifs como los elses encierran a una sola instruccion
     //y no es necesario utilizar llaves{}
     
     if (nota>=0&&nota<5){
         System.out.println("INSUFICIENTE");
     }
     else if(nota==5){
         System.out.println("SUFICIENTE");
     }
     else if(nota==6){
         System.out.println("BIEN");
     }
     else if(nota==7||nota==8){
         System.out.println("NOTABLE");
     }
     else if(nota==9||nota==10){
         System.out.println("SOBRESALIENTE");
     }
    }
    
}
