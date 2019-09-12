
package boletine26;

import java.util.Scanner;

public class BoletinE26 {
    static boolean busca(int t[],int n, int tam){
        int i;
        boolean esta;
       
        i=0;
        while (i<tam && t[i]!=n) // si no es t[i], paso al siguiente
                                      // con cuidado de no salirme de la tabla
            i++;
       
       
        // cuando termina el mientras, puede ser por dos motivos:
        // - que he buscado por toda la tabla sin encontrarlo y al final me salgo de la tabla
        // - o que lo he encontrado
        if (i<tam) // si no llego al final de la tabla es por que lo he encontrado
                        // t[i] == num no es válido, ya que si i está fuera de rango
                        // t[i] es basura
            esta =true;
        else
            esta =false;
        return(esta);
    }
    public static void main(String[] args) {
        // Igual que el ejercicio anterior, pero suponiendo que la tabla 
        //no está siempre llena, y el número de elementos se pasa también como parámetro.
        Scanner tc=new Scanner(System.in);
        int a[]= new int [20];
        int tam;
        int num;
        boolean esta;
       
        a[0] = 1;
        a[1] = 12;
        a[2] = 38;
        a[3] = 5;
        a[4] = 11;
       
        tam = 5;
        System.out.println("La tabla es: ");
        for (int i=0;i<tam;i++)
            System.out.println(a[i]);
        System.out.print("\nIngrese número a buscar: ");
        num=tc.nextInt();
        esta=busca(a, num, tam);
        if (esta)
            System.out.println("El número está");
        else
            System.out.println("El número no está");
    }
    
}
