package sesion3clases;
/**
 *
 * @author Wilson Gutierrez
 */
public class Sesion3Clases_01 {
    public static void main(String[] args) {
        Carro carro1=new Carro("Azul","Nissan",2018,4500); //Instanciamos carro1
        //System.out.println(carro1);
//        carro1.color="Azul";
//        carro1.marca="Nissan";
//        carro1.modelo=2018;
//        carro1.precio=4500;
        
        System.out.println(carro1.marca);
        carro1.saludar();
        
        Carro carro2=new Carro("Verde","Chevrolet",2021,3500);
//        carro2.color="Verde";
//        carro2.marca="Chevrolet";
//        carro2.modelo=2021;
//        carro2.precio=3500;
        System.out.println(carro2.marca);
        carro2.saludar();
        
        System.out.println("El valor de los dos carros es: "+(carro1.precio+carro2.precio));
    }
    
}

class Carro{
    String color;
    String marca;
    Integer modelo;
    Integer precio;
    
    public Carro(String color, String marca, Integer modelo, Integer precio){       
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    
    public void saludar(){
        System.out.println("El carro esta saludando y dice soy modelo: "+this.modelo);
    
    }
    
}