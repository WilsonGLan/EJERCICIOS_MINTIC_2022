
package notas;

/**
 *
 * @author Wilson Gutierrez
 */
public class Estudiante {
    private String nombre;
    private double codigo;
    private String grado;

    public Estudiante(String nombre, double codigo, String grado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    

}
