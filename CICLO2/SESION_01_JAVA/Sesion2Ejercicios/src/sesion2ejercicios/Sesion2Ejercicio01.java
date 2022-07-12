
package sesion2ejercicios;
import java.util.Scanner;

/**
 *
 * @author Wilson Gutierrez
 */
public class Sesion2Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n, i;
    int V[] = new int[100];
    Scanner leer=new Scanner(System.in);
    System.out.println("Cantidad de elementos del vector: ");
    n=leer.nextInt();
    //Llenar un vector
    for (i = 0; i<n; i++) {
      System.out.println("Elemento "+(i+1)+": ");
      V[i]=leer.nextInt();      
    }
    //Escribir un Vector
    for (i = 0; i<n; i++) {
      System.out.println(V[i]);          
    }


    }
    
}
