package sesion1ejercicios;
import java.util.Scanner;
/**
 *
 * @author Wilson Gutierrez
 */

/*
Ejemplo 7: Integración estructuras condicionales y cíclicas (while if-else) (for if-else)

Como parte de un sistema de facturación es necesario conocer el valor unitario y las cantidades a comprar
de cada uno de los productos para calcular el total a pagar. 

Se requiere un algoritmo que para un conjunto de clientes, calcule para cada uno de ellos el valor a pagar 
de N tipos de productos comprados de acuerdo a la cantidad a llevar de cada tipo. Al finalizar la atención 
de los clientes, se debe indicar el total vendido por la empresa. Para las compras superiores a 100.000 la 
empresa ha decido otorgar un 10% de descuento sobre el total de la compra.

Nota: Se deben atender a los clientes hasta que el usuario indique lo contrario.

Ejemplo:
Cliente 1:
Cantidad de tipo de productos: 3
Cantidad del producto 1: 4. Valor del producto 1: 2450
Cantidad del producto 2: 10. Valor del producto 1: 6540
Cantidad del producto 3: 1. Valor del producto 1: 1050
Total de la factura: 76250

Cliente 2:
Cantidad de tipo de productos: 2
Cantidad del producto 1: 5. Valor del producto 1: 10560
Cantidad del producto 2: 7. Valor del producto 1: 650
Total de la factura: 57350

Total vendido:133600

*/

public class Sesion1Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        boolean clientesXAtender=true;
        int cantidadClientes=1;
        int totalVendido=0;
        
        while(clientesXAtender){
            System.out.println("Cliente "+cantidadClientes);
            
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
            
            System.out.println("Hay clientes por atender? (si/no) ");
            String nuevoCliente=leer.next();
            if (nuevoCliente.equals("no")) {
                clientesXAtender=false;                
            }
            cantidadClientes++;
            totalVendido=totalVendido+totalFactura;
        }
        System.out.println("Total vendido: "+totalVendido);
        
    }
    
    
}
