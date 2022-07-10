package sesion1ejercicios;

import java.util.Scanner;

/**
 *
 * @author Wilson Gutierrez
 */

/*
Ejemplo 3: Estructura condicional múltiple.

En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su 
proveedor de acuerdo a una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una 
cantidad en bodega y una cantidad mínima requerida indique si es necesario o no solicitar el producto al 
proveedor. En caso de no ser necesario la solicitud del producto, indique cuántas unidades hacen falta 
vender para tener que realizar el pedido y genere una alerta cuando estas unidades sean menores a 10.

Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al 
proveedor. Unidades que hacen falta vender: 400. 
*Cantidad en bodega: 55, Cantidad mínima requerida 50. Entonces no es necesario realizar el pedido al 
proveedor. Unidades que hacen falta vender: 5. Alerta generada.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al 
proveedor.

Requerimiento: utilice condicionales múltiples.

*/
public class Sesion1Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad minima requerida: ");
        int cantidadMinima= leer.nextInt();
        
        System.out.println("Ingrese la cantidad actual en bodega: ");
        int cantidadBodega= leer.nextInt();
        
        if (cantidadBodega<cantidadMinima){
            System.out.println("Realizar pedido a proveedor");
        }else{
            int unidadesRestantes = cantidadBodega - cantidadMinima;
            if (unidadesRestantes<10) {
                System.out.println("No es necesario realizar pedido al proveedor. "+"Unidades que hacen falta por vender: "+unidadesRestantes+". Alerta Generada");
            }else{
                System.out.println("No es necesario realizar pedido al proveedor. "+"Unidades que hacen falta por vender: "+unidadesRestantes);                            
            }
        } 
    }
    
}
