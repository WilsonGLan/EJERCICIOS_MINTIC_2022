package sesion1ejercicios;
import java.util.Scanner;
/**
 *
 * @author Wilson Gutierrez
 */
/*
Ejemplo 6: Estructura cíclica

Como parte de un sistema de facturación es necesario conocer el valor unitario y las cantidades a comprar 
de cada uno de los productos para calcular el total a pagar. 

Se requiere un algoritmo que para 1 cliente, calcule el valor a pagar de N tipos de productos comprados 
de acuerdo a la cantidad a llevar de cada tipo.

Ejemplo:
Cantidad de tipo de productos: 3
Cantidad del producto 1: 4. Valor del producto 1: 2450
Cantidad del producto 2: 10. Valor del producto 2: 6540
Cantidad del producto 3: 1. Valor del producto 3: 1050
Total de la factura: 76250

*/

public class Sesion1Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Cantidad de Productos");
        int cantidadTipoProductos=leer.nextInt();
        int cantidadProducto;
        int valorProducto;
        int totalFactura=0;
        
        for(int i=1;i<=cantidadTipoProductos;i++){
            System.out.println("Ingrese la cantidad del producto "+i+": ");
            cantidadProducto=leer.nextInt();
            
            System.out.println("Ingrese valor del producto "+i+": ");
            valorProducto=leer.nextInt();
            
            totalFactura=totalFactura+(cantidadProducto*valorProducto);    
        }
        System.out.println("Total Factura: "+totalFactura);
    }
}
