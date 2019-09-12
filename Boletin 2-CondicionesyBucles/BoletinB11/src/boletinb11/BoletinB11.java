
package boletinb11;

public class BoletinB11 {

    public static void main(String[] args) {
        // Diseñar un programa que muestre el producto de los 10 primeros
        //numeros impares
        long producto=1; 
    //producto guardara la multiplicacion de los 10 primeros num impares
   //es muy importante acordarse de inicializarlo a 1.
   //ya que si lo hacemos a 0 el producto siempre valdra 0
         // para calcular los 10 primeros números impares utilizamos un for que:
         
        // comience en 1
        // y en cada vuelta se incremente en 2, así obtenemos
        // 1, 3, 5, 7, 9, 11, 13, 15, 17, 19.
        
        for (int i=1;i<10;i+=2){
            producto=producto*i;
        }
        System.out.println("La multiplicación de los 10 primeros impares: " + producto);
    }
    
}
