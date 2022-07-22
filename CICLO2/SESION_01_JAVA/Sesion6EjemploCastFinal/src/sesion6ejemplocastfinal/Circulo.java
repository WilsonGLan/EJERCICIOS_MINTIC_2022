
package sesion6ejemplocastfinal;

public class Circulo {
    private float radio;
    public final float PI=(float)3.141519;

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float area(){       
        return (float)Math.pow(radio, 2)*PI;
        
        
    }

}