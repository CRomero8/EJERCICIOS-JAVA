
package boletina16;

import java.util.Scanner;

public class BoletinA16 {

    public static void main(String[] args) {
        //  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
        //Con meses de 28, 30 y 31 días.
        //Sin años bisiestos.
     int dia,mes,año;
     Scanner Entrada=new Scanner(System.in);
     System.out.print("Ingrese Día: ");
     dia=Entrada.nextInt();
     System.out.print("Ingrese Mes: ");
     mes=Entrada.nextInt();
     System.out.print("Ingrese Año: ");
     año=Entrada.nextInt();
     // el unico año que no existe es el 0
     if(año==0){
         System.out.println("Fecha Incorrecta");
     }
     else if (mes==2&&(dia>=1&&dia<=28)){
         System.out.println(dia + "/" + mes + "/" + año+": Fecha Correcta");
     }
     else if((mes==4||mes==6||mes==9||mes==11)&&(dia>=1&&dia<=30)){
         System.out.println(dia + "/" + mes + "/" + año+": Fecha Correcta");
     }
     else if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&(dia>=1&&dia<=31)){
         System.out.println(dia + "/" + mes + "/" + año+": Fecha Correcta");
     }
     else{
         System.out.println("Fecha Incorrecta");
     }
    }
    
}
