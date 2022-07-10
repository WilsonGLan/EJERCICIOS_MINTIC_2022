package sesion1ejercicios;
import java.util.Scanner;

/**
 *
 * @author Wilson Gutierrez
 */

/*
En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su 
proveedor de acuerdo a una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una 
cantidad en bodega y una cantidad mínima requerida indique si es necesario o no solicitar el producto al 
proveedor.

Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al proveedor.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al proveedor.

Requerimiento: utilice condicionales dobles.

*/
public class Sesion1Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad minima requerida: ");
        int cantidadMinima= leer.nextInt();
        
        System.out.println("Ingrese la cantidad actual en bodega: ");
        int cantidadBodega= leer.nextInt();
        
        if (cantidadBodega<cantidadMinima){
            System.out.println("Realizar pedido a proveedor");
        }else{
            System.out.println("No es necesario realizar pedido a proveedor");
        }        
    }
}
