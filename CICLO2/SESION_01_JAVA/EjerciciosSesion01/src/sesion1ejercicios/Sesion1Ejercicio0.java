package sesion1ejercicios;
import java.util.Scanner;
/**
 *
 * @author Wilson Gutierrez
 */
public class Sesion1Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadMinima;
        
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad minima requerida: ");
        cantidadMinima=leer.nextInt();
        
        System.out.println("Ingrese la cantidad actual en Bodega: ");
        int cantidadBodega=leer.nextInt();
        
        
        System.out.println("La cantidad minima requerida es : "+cantidadMinima);
        System.out.println("La cantidad actual en Bodega es : "+cantidadBodega);
        
    }
    
}
