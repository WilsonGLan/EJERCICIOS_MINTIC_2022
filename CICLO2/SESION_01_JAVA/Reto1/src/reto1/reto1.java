package reto1;
import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int total = 0;
        float promedio ;
        long elemento , mayor = 0, menor = 0;
        String pantalla;
        
        int tamano = Integer.parseInt(entrada.nextLine());  
        long porcentajes [] = new long [tamano];
        for (int i = 0; i < tamano; i++){
            porcentajes[i] = Long.parseLong(entrada.nextLine()); 
        }
        
        for (int i = 0; i < tamano; i++){
            total += porcentajes[i];
        }
        
        promedio = total / tamano;            
        pantalla = validar(promedio);        
        System.out.println(pantalla);
        
        elemento = porcentajes[0];
        for (int i = 1; i < tamano; i++){
            if (elemento <= porcentajes[i]) {
                elemento = porcentajes[i];
                mayor = elemento;
            }else{
                mayor = elemento;
            }
        }
        
        pantalla = validar(mayor);        
        System.out.println(pantalla);
        
        
        elemento = porcentajes[0];
        for (int i = 1; i < tamano; i++){
            if (elemento <= porcentajes[i]) {
                menor = elemento;
            }else{
                elemento = porcentajes[i];
                menor = elemento;
            }
        }
                
        pantalla = validar(menor);        
        System.out.println(pantalla);
        
    }
    
            static String validar(float valor){
        String nivelRiesgo = "";
        if (valor > 80 && valor <= 100){
            nivelRiesgo = "INVIABLE SANITARIAMENTE";
        }else if (valor > 35 && valor <= 80) {
            nivelRiesgo = "ALTO";
        }else if (valor > 14 && valor <= 35) {
            nivelRiesgo = "MEDIO";
        }else if (valor > 5 && valor <= 14) {
            nivelRiesgo = "BAJO";
        }else if (valor > 0 && valor <= 5) {
            nivelRiesgo = "SIN RIESGO";
        }
        return nivelRiesgo;
    }
    
}
