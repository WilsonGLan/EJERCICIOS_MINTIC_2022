
package reto2;

public class CuerpoDeAgua {
    private String [] nombre;
    private int  [] id;
    private String  [] municipio;
    private double  [] irca;
    private int tamano;

    public CuerpoDeAgua(String[] nombre, int[] id, String[] municipio, double[] irca, int tamano) {
        this.nombre = nombre;
        this.id = id;
        this.municipio = municipio;
        this.irca = irca;
        this.tamano = tamano;
    }

    public void nivel(int posicion){
        if (irca[posicion ] > 80 && irca[posicion ] <= 100) {
            System.out.println("INVIABLE SANITARIAMENTE");
        }else if (irca[posicion ] > 35 && irca[posicion ] <= 80) {
            System.out.println("ALTO");
        }else if (irca[posicion ] > 14 && irca[posicion ] <= 35) {
            System.out.println("MEDIO");
        }else if (irca[posicion ] > 5 && irca[posicion ] <= 14) {
            System.out.println("BAJO");
        }else if (irca[posicion ] >=0 && irca[posicion ] <=5) {
            System.out.println("SIN RIESGO");
        }else {
            System.out.println("NA");
        }
    }
    
}
