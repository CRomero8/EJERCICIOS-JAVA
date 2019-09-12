/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletina16boolean;

import java.util.Scanner;

public class BoletinA16boolean {

    public static void main(String[] args) {
        // Usando boolean
        int dia,mes,año;
        int dias_del_mes;
        boolean fecha_correcta=true;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese Día: ");
     dia=Entrada.nextInt();
     System.out.print("Ingrese Mes: ");
     mes=Entrada.nextInt();
     System.out.print("Ingrese Año: ");
     año=Entrada.nextInt();
     dias_del_mes=0; //si se utiliza un mes fuera del rango 1-12
                        //supondremos que los dias del mes son 0
     if (año==0){
         fecha_correcta = false;
     }
     if (dia<1||dia>31){
         fecha_correcta = false;
     }
     if (mes<1||mes>12){
         fecha_correcta = false;
     }
     if (mes==2){
         dias_del_mes=28;
     }
     if(mes==4||mes==6||mes==9||mes==11){
         dias_del_mes=30;
     }
     if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10){
         dias_del_mes=31;
     }
     if(dia>dias_del_mes){
         fecha_correcta=false;
     }
     if(fecha_correcta){
         System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
     }
     else{
         System.out.println("Fecha Incorrecta");
     }
    }
    
}
