package sesion1ejercicios;
import java.util.Scanner;
/**
 *
 * @author Wilson Gutierrez
 */

/*
Ejemplo 4: Estructura condicional anidado

En un sistema de inventario es importante conocer si es necesario solicitar un determinado producto a su 
proveedor de acuerdo a una cantidad mínima requerida en bodega. Se requiere un algoritmo que dada una 
cantidad en bodega y una cantidad mínima requerida indique si es necesario o no solicitar el producto al 
proveedor. 

Adicionalmente, en caso de no ser necesario la solicitud del producto, indique cuántas unidades hacen falta 
vender para tener que realizar el pedido y genere una alerta cuando estas unidades sean menores a 10. 

Por el contrario si se debe realizar el pedido, debe solicitar las unidades de compra deseadas, el valor 
de compra del producto y el dinero en caja con el fin de validar si es posible realizar la compra.

Ejemplos: 
*Cantidad en bodega: 500, Cantidad mínima requerida 100. Entonces no es necesario realizar el pedido al
proveedor. Unidades que hacen falta vender: 400. 
*Cantidad en bodega: 55, Cantidad mínima requerida 50. Entonces no es necesario realizar el pedido al 
proveedor. Unidades que hacen falta vender: 5. Alerta generada.
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al 
proveedor. Cantidades de compra deseada: 200. Valor de compra: 3350, Valor en caja: 1.050.000. Si es 
posible realizar el pedido
*Cantidad en bodega: 300, Cantidad mínima requerida 450. Entonces si es necesario realizar el pedido al 
proveedor. Cantidades de compra deseada: 200. Valor de compra: 3350, Valor en caja: 400.000. No es 
posible realizar el pedido

Requerimiento: utilice condicionales anidados.

*/
public class Sesion1Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad minima requerida: ");
        int cantidadMinima=leer.nextInt();
        
        System.out.println("Ingrese la cantidad actual en Bodega: ");
        int cantidadBodega=leer.nextInt();
        
        if (cantidadBodega<cantidadMinima) {
            System.out.println("Realizar pedido a proveedor");
            
            System.out.println("Ingrese la cantidad de unidades a comprar: ");
            int unidadesAComprar=leer.nextInt();
            System.out.println("Ingrese al valor unitario: ");
            int valorUnitario=leer.nextInt();
            System.out.println("Ingrese el dinero en caja: ");
            int dineroCaja=leer.nextInt();
            
            int valorCompra=unidadesAComprar*valorUnitario;
            System.out.println("Valor de la compra: "+valorCompra);
            
            if (valorCompra<dineroCaja) {
                System.out.println("Si es posible realizar la compra");
                
            } else {
                System.out.println("No es posible realizar la compra");
            }                      
        }else{
            int unidadesRestantes=cantidadBodega-cantidadMinima;
            if (unidadesRestantes<10) {
                System.out.println("No es necesario realizar pedido al proveedor. "+"Unidades que hacen falta por vender: "+unidadesRestantes+ ". "+"Alerta Generada");
                
            } else {
                System.out.println("No es necesario realizar pedido al proveedor. "+"Unidades que hacen falta por vender: "+unidadesRestantes);
            }
        } 
    }
}
