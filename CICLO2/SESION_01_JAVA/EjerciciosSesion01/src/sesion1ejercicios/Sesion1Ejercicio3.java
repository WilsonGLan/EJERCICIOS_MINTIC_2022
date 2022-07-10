package sesion1ejercicios;

import java.util.Scanner;

/**
 *
 * @author wilgu
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
