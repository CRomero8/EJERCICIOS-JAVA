
package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        //Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean
        //1 y el resto 0.
        int t[][]=new int[7][7];
        int i,j;
        for (i=0;i<7;i++)
        for (j=0;j<7;j++)
        if (i==j)
        t[i][j] = 1;
        else
        t[i][j] = 0;
        System.out.println("Matriz:");
        for (i=0;i<7;i++)
        {
        for (j=0;j<7;j++)
        System.out.print(t[i][j]+" ");
        System.out.println ();
        }
    }
    
}
