package sesion4cp1;
import java.util.Scanner;


public class App {
   
    public static void main(String[] args) {
            
        Scanner  leer=new Scanner(System.in);
        
        System.out.println("Digite cantidad de productos: ");
        int n=leer.nextInt();
        Producto[] productos=new Producto[n];    
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el codigo:");
            int cod=leer.nextInt();
            System.out.println("Digite el precio:");
            int valor=leer.nextInt();
            System.out.println("Cantidad en Bodega:");
            int cantB=leer.nextInt();
            System.out.println("Cantidad Minima Requerida:");
            int cantM=leer.nextInt();
            productos[i]=new Producto(cod, valor, cantB, cantM); 
        }
        
        int men=productos[0].getcBodega();
        int codigoMen=productos[0].getCodigo();
        
        for (int i = 0; i < n; i++) {
            if (productos[i].solicitar()) {
                System.out.println("Alerta para el codigo: "+productos[i].getCodigo());                
            } else {
                System.out.println("No se solicitara producto para el codigo: "+productos[i].getCodigo());
            }
            
            if (productos[i].getcBodega()<men) {
                men=productos[i].getcBodega();
                codigoMen=productos[i].getCodigo();
                
            }
                       
        }
        
        System.out.println("Codigo con menor cantidad en Bodega: "+codigoMen+ " tiene "+ men+" unidades");
    }
    
}
