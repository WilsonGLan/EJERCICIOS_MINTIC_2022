package sesion1ejercicios;
import java.util.Scanner;
/**
 *
 * @author Wilson Gutierrez
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
