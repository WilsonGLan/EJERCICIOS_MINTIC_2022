package sesion2cp;
import java.util.Scanner;
/**
 *
 * @author Wilson Gutierrez
 */
public class Sesion2CP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] codProd;
        int[][] tablaCantidadBodega = new int[100][100];
        int[][] tablaCantidadMinima = new int[100][100];
        
        System.out.println("Digite tres códigos separados por espacios: ");
        String linea = leer.nextLine();
        
        codProd = linea.split(" ");
        int productos=codProd.length;
        System.out.println(productos);
        
        System.out.println("Digite Tabla de Cantidades bodega: ");
        linea = leer.nextLine();
        String[] filas = linea.split(";");
        int sedes = filas.length;
        
        for (int i = 0; i < sedes; i++) {
            String cantidades[]=filas[i].split(" ");
            for (int j = 0; j < productos; j++) {
                String num=cantidades[j];
                tablaCantidadBodega[i][j]=Integer.parseInt(num);
            }
        }
        
        System.out.println("Digite Tabla de Cantidades Mínimas: ");
        linea = leer.nextLine();
        filas = linea.split(";");
                
        for (int i = 0; i < sedes; i++) {
            String cantidades[]=filas[i].split(" ");
            for (int j = 0; j < productos; j++) {
                String num=cantidades[j];
                tablaCantidadMinima[i][j]=Integer.parseInt(num);
            }
        }
        
        for (int i = 0; i < sedes; i++) {
            for (int j = 0; j < productos; j++) {
                if (tablaCantidadBodega[i][j]<tablaCantidadMinima[i][j]){
                    System.out.println("Se debe solicitar producto" +
                            codProd[j] + " en la sede " + i);
                }
            }
        }
        
        double prom;
        double sum;
        
        for (int i = 0; i < productos; i++) {
            sum = 0;
            for (int j = 0; j < sedes; j++) {
                sum+=tablaCantidadBodega[i][j];
            }
            prom=sum/sedes;
            System.out.println("El promedio del producto de código " +
                   codProd[i] +
                    " es " +
                    prom);
        }
        
    }
    
    
}
