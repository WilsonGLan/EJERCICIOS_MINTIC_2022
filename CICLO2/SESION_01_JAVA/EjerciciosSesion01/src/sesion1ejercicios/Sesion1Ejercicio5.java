package sesion1ejercicios;

import java.util.Scanner;
public class Sesion1Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Ingrese el dia de la semana: ");
        int diaSemana=leer.nextInt();        
        System.out.println("Valor de la compra: ");
        int valorCompra=leer.nextInt();        
        double porcentajeDescuento=0;
        
        //Usando el switch case para trabajar con opciones de selección.
        switch (diaSemana) {
            case 1:
                porcentajeDescuento=0.05;
                break;
            case 2:
                porcentajeDescuento=0.03;
                break;
            case 3:
                porcentajeDescuento=0.1;
                break;  
            case 4:
                porcentajeDescuento=0.04;
                break;
            case 5:
                porcentajeDescuento=0.06;
                break;
            case 6:
                porcentajeDescuento=0.02;
                break;
            case 7:
                porcentajeDescuento=0.01;
                break;
        }        
        double valorDescuento=valorCompra*porcentajeDescuento;
        double valorAPagar=valorCompra-valorDescuento;        
        System.out.println("Valor a Pagar: "+valorAPagar); 
        System.out.println("En esta compra obtuvo: "+porcentajeDescuento*100+"% de descuento");  
    }
}
