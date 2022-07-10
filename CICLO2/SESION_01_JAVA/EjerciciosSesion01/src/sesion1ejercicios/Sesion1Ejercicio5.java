package sesion1ejercicios;
import java.util.Scanner;

/**
 *
 * @author Wilson Gutierrez
 */

/*
Ejemplo 5: Estructura dependiendo de o Según

Una determinada empresa ha decidido ofrecer descuentos a sus clientes de acuerdo al día de la semana 
en el que se realice la compra, para lo cual se requiere un algoritmo que dado el día de la semana
(en número), y el total a pagar sin descuento, calcule el total incluyendo el descuento. 

El descuento se otorga de acuerdo a la siguiente tabla.

Dia	Descuento
1	5%
2	3%
3	10%
4	4%
5	6%
6	2%
7	1%

*/

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
