
package boletine19;

import java.util.Scanner;

public class BoletinE19 {
    static int a_elevado_n(int a, int n){
        int res;
        res=1; // el resultado se inicializa a 1, ya que iremos multiplicando
        if(n==0)  // por definición cualquier número elevado a 0 es 1
            res=1;
        else
            for (int i=1;i<=n;i++)
                res=res*a;
        return(res);
    }
    public static void main(String[] args) {
        //DUF que calcule a
        Scanner tc=new Scanner(System.in);
        int num,exp,res;
        System.out.print("Ingrese base: ");
        num=tc.nextInt();
        System.out.print("Ingrese su exponente: ");
        exp=tc.nextInt();
       
        res=a_elevado_n (num,exp);
        System.out.println(num + " elevado a " + exp +" = " +res);

    }
    
}
