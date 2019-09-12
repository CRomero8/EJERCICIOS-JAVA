
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]
        //debe contener n+m. Después se debe mostrar su contenido.
        
        int t[][];
        t=new int [5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                t[i][j]=i+j;
               
            }
        }
            System.out.println("TABLA: ");
            for (int i=4;i>=5;i--){
                System.out.println();
                for (int j=0;j<5;j++){
                  System.out.println(t[i][j]+ " ");  
                }
            }
    }
    
}
