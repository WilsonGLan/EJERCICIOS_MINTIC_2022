package sesion1ejercicios;
import java.util.Scanner;
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
