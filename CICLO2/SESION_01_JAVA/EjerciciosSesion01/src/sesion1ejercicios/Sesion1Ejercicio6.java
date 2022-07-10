
package sesion1ejercicios;

import java.util.Scanner;
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
