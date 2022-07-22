package sesion5ejemplostatic;

public class Circulo {
    private double radio;
    public static double pi=3.1415;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        double areaCirc;
        areaCirc=pi*Math.pow(radio, 2); 
        return areaCirc;
    }
    
    public static double perimetro(double radio){
        return 2*pi*radio;
     
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
      
    
    
}
