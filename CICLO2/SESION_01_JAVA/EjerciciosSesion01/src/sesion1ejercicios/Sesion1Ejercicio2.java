package sesion1ejercicios;
import java.util.Scanner;

/**
 *
 * @author Wilson Gutierrez
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
