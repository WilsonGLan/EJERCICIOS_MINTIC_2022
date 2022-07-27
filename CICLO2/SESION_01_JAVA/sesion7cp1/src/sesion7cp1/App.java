package sesion7cp1;
import java.util.Scanner;
/**
 *
 * @author Wilson Gutierrez
 */


public class App {

    public static void main(String[] args) {
       Scanner  leer=new Scanner(System.in);
        
        System.out.println("Digite cantidad de productos: ");
        int n=leer.nextInt();
        Producto[] productos=new Producto[n];    
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el codigo:");
            int cod=leer.nextInt();
            System.out.println("Digite el precio de compra:");
            int valor=leer.nextInt();
            System.out.println("Digite el precio de venta:");
            int precioV=leer.nextInt();
            System.out.println("Cantidad en Bodega:");
            int cantB=leer.nextInt();
            System.out.println("Cantidad Minima Requerida:");
            int cantM=leer.nextInt();
            System.out.println("Cantidad Maxima de Inventario:");
            int cantMax=leer.nextInt();
            
            productos[i]=new Producto(cod, valor,precioV, cantB, cantM,cantMax); 
        }
        
        System.out.println("Menu de Opciones");
        System.out.println("Opcion1:Verificar productos a pedir ");
        System.out.println("Opcion2:Producto con mayor cantidad de unidades ");
        System.out.println("Opcion3:Total a pagar por pedido a realizar ");
        System.out.println("Opcion4:Modificar cantidad mínima requerida en bodega");
        System.out.println("Opcion5:Vender producto");
        System.out.println("Digite la opcion deseada: ");
        int op=leer.nextInt();
        
        switch (op) {
            case 1:                        
                for (int i = 0; i < n; i++) {
                    if (productos[i].solicitar()) {
                        System.out.println("Alerta para el codigo: "+productos[i].getCodigo());               
                    } else {
                        System.out.println("No se solicitara producto para el codigo: "+productos[i].getCodigo());
                    }
                }        
                break;
            
            case 2:
                int may=productos[0].getcBodega();
                int codigoMay=productos[0].getCodigo();
                for (int i = 0; i < n; i++) {
                    if (productos[i].getcBodega()>may) {
                        may=productos[i].getcBodega();
                        codigoMay=productos[i].getCodigo();                                       }
                }        
                 System.out.println("Codigo con mayor cantidad en Bodega: "+codigoMay+ " tiene "+ may+" unidades");
                break;
                
            case 3:
                System.out.println("Digite el código del producto: ");
                int cp=leer.nextInt();
                System.out.println("Digite unidades: ");
                int uc=leer.nextInt();
                for (int i = 0; i < n; i++) {
                    if (productos[i].getCodigo()==cp) {
                        System.out.println("El total a pagar es: "+productos[i].totalAPagar(uc));
                    }          
                }               
                break;
            
            case 4:
                System.out.println("Digite codigo del producto a cambiar la cantidad minima en Bodega: ");
                cp=leer.nextInt();
                System.out.println("Digite la nueva cantidad minima requerida: ");
                int cantBN=leer.nextInt();
                for (int i = 0; i < n; i++) {
                    if (productos[i].getCodigo()==cp) {
                        productos[i].setcMinRequerida(cantBN);
                        System.out.println("La nueva cantidad minima es: "+productos[i].getcMinRequerida());

                    }           
                }                
                break;            
            case 5:
                System.out.println("Digite el codigo del producto a vender");
                cp=leer.nextInt();
                System.out.println("Digite unidades a vender: ");
                int uvender=leer.nextInt();
                
                double[] venta=Opciones.venderProducto(productos, cp, uvender);
                if (venta[0]!=-1) {
                    System.out.println("La venta sin descuento es: "+venta[0]);
                    System.out.println("La venta con descuento es: "+venta[1]);                   
                } else {
                    System.out.println("La cantidad en bodega es menor a las unidades a vender. No se pudo realizar la venta");
                }
                
                break;
            
        }
    }    
}
