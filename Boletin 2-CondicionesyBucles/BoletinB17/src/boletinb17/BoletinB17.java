package boletinb17;

import java.util.Scanner;

public class BoletinB17 {

    public static void main(String[] args) {
// Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
//En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
//Se pide de 5 facturas ingresadas: Facturación total, cantidad en litros vendidos del artículo 1
//y cuantas facturas se emitieron de más de S/.600.
        Scanner Entrada=new Scanner(System.in);
        int codigo; //el cod. del articulo en cada factura
        int litros; // la cantidad de litros en cada factura
        float precio; //el precio por litro en cada factura
        float importe_factura;// guardara el importe de la factura con la que estemos trabajando
        float facturacion_total;//el importe de todas lasfacturas 
        int litros_cod1; //el total ce litros vendidos del producto 1 en todas las facturas
        int mas_600;//contador qe sirve para llevar la cuenta d cuantas facturas hay de mas de S/.600 
        
        facturacion_total=0;
        litros_cod1=0;
        mas_600=0;
        
        for (int i=1;i<=2;i++){
            System.out.println("Factura N° " + i);
            System.out.print("Código del Producto: ");
            codigo=Entrada.nextInt();
            System.out.print("Cantidad en Litros: ");
            litros=Entrada.nextInt();
            System.out.print("Precio (Litro): ");
            precio=Entrada.nextInt();
            
            importe_factura=litros*precio;
            facturacion_total+=importe_factura;
            
            if (codigo==1)
                litros_cod1+=litros;
            
            if (importe_factura>=600)
                mas_600++;
            }
        System.out.println("Resumen de ventanas");
        //facturacion total
        System.out.println("La facturacion total es de: " + facturacion_total + " S/.");
        //litros del producto 1
        System.out.println("Ventas del producto 1: " + litros_cod1 + " Litros ");
        //factura de mas de 600 soles
        System.out.println("Factura superior a S/.600: " + mas_600);
    }
    
}
