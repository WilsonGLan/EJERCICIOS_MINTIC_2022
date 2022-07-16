package reto1;

import java.util.Scanner;

/**
 * @author Wilson Gutierrez
 */
public class Reto1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamano = entrada.nextInt();
        long porcentajes [] = new long [tamano];
        for (int i = 0; i < tamano; i++){
            porcentajes[i] = entrada.nextInt();
        }
    }
    
    
}
