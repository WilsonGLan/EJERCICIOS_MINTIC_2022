package sesion3cp1;

import java.util.Scanner;

/**
 *
 * @author Wilson Gutierrez 
 */
public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el código: ");
        int cod = leer.nextInt();
        System.out.println("Digite el Precio: ");
        int valor = leer.nextInt();
        System.out.println("Digite la cantidad en bodegal bodega: ");
        int cantB = leer.nextInt();
        System.out.println("Digite la cantidad minima requerida: ");
        int cantM = leer.nextInt();
        
        Producto product = new Producto(cod, valor, cantB, cantM);
        
        if (product.solicitar()){
            System.out.println("Alerta generada");
        }else{
            System.out.println("No es necesario solicitar producto");
        }
    }
    
}
