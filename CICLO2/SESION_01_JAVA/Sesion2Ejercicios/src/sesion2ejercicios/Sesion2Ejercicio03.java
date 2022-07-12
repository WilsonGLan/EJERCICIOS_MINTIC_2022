package sesion2ejercicios;
import java.util.Scanner;
/**
 *
 * @author Wilson Gutierrez
 */
public class Sesion2Ejercicio03 {
    public static void main(String[] args) {
        int n, m, i, j, M[][] = new int[100][100];
    Scanner leer = new Scanner(System.in);
    System.out.print("Cantidad filas: ");
    n = leer.nextInt();
    System.out.print("Cantidad columnas: ");
    m = leer.nextInt();
    for (i = 0; i < n; i++) {
      for (j = 0; j < m; j++) {
        System.out.print("Elemento [" + (i + 1) + "," + (j + 1) + "]: ");
        M[i][j] = leer.nextInt();
      }
    }
    for (i = 0; i < n; i++) {
      for (j = 0; j < m; j++) {
        System.out.print("\t" + M[i][j]);
      }
      System.out.println("");
    }

    }
}
