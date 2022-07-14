package sesion3clases;
/**
 *
 * @author Wilson Gutierrez
 */
import java.util.Scanner;
import java.util.Arrays;

public class Notas {
    //Metodo para clasificar las notas y promedio
    public static void clasificar(double num){
        if (num>=0 && num<=5) {
            System.out.println(" => Baja");
            return;           
        }        
        if (num>5 && num<=8) {
            System.out.println(" => Media");
            return;            
        }        
        if (num>8 && num<=10) {
            System.out.println(" => Alta");
            return;
        }    
    }

    
    public static void main(String[] args) {
        int n;
        double sum=0;
        double prom;
        
        Scanner leer=new Scanner(System.in);
        System.out.print("Numero de notas :");
        //Leemos la cantidad de notas
        n=leer.nextInt();
        System.out.println("Escriba las notas: ");
        double notas[]=new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nota "+ (i+1) + ": ");
            notas[i]=leer.nextDouble();
            sum+=notas[i];            
        }
        prom=sum/n;
        System.out.println("Resultados");
        System.out.print(prom);
        clasificar(prom);
        Arrays.sort(notas);
        System.out.print(notas[0]);        
        clasificar(notas[0]);//Clasifica la nota menor
        System.out.print(notas[n-1]);
        clasificar(notas[n-1]);//Clasifica la nota mayor
    }    
}
