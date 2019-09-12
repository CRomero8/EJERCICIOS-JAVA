
package boletinc3;

public class BoletinC3 {

    public static void main(String[] args) {
        // tabla de multiplicar del 1 a 10
        int tabla,i;
        
        for (tabla=1; tabla<=10; tabla++){
            System.out.println("************");
            System.out.println("Tabla del " +tabla);
            System.out.println("************");
            
            for (i=1;i<=10;i++)               
            {
            System.out.println(tabla + " x " + i + " = " + tabla*i);
            }
        }
    }
    
}
