package reto2;
import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {        
        Scanner  leer=new Scanner(System.in);
        int numCuerpos = Integer.parseInt(leer.nextLine());
        String nombreCA [] = new String[numCuerpos];        
        int  idCA [] = new int[numCuerpos];
        double clasificacionIRCA [] = new double[numCuerpos];   
        String datosNR;

        for (int i = 0; i < numCuerpos; i++) {                        
            datosNR = leer.nextLine();
            String [] listaDatos = datosNR.split(" ");
            nombreCA[i] = listaDatos[0];
            idCA[i] = Integer.parseInt(listaDatos[1]);            
            clasificacionIRCA[i] = Double.parseDouble(listaDatos[3]);
        }
         
        CuerpoDeAgua validarCA = new CuerpoDeAgua(nombreCA, idCA, clasificacionIRCA);
        
        for (int i = 0; i < numCuerpos; i++) {
            System.out.println(validarCA.nivel(i));
        }
        System.out.println(validarCA.cantMBSR());
        
        validarCA.nombreMedio();
        validarCA.clasificaBaja();
    
    }
}
