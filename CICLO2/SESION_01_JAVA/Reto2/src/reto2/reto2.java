package reto2;
import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {        
        Scanner  leerCantidad=new Scanner(System.in);
        int numCuerpos = leerCantidad.nextInt();
        String nombreCA [] = new String[numCuerpos];
        String munCA [] = new String[numCuerpos];
        int  idCA [] = new int[numCuerpos];
        double clasificacionIRCA [] = new double[numCuerpos];
        
        for (int i = 0; i < numCuerpos; i++) {
            Scanner  leerDatos=new Scanner(System.in);
            String datosNR = leerDatos.nextLine();
            String [] listaDatos = datosNR.split(" ");
            nombreCA[i] = listaDatos[0];
            idCA[i] = Integer.parseInt(listaDatos[1]);
            munCA[i] = listaDatos[2];
            clasificacionIRCA[i] = Double.parseDouble(listaDatos[3]);
        }
        
        //CuerpoDeAgua validarCA = new CuerpoDeAgua(nombreCA, idCA, munCA, clasificacionIRCA);

        
    }
    
}
