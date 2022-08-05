package notas;
/**
 *
 * @author Wilson Gutierrez
 */
public class ClaseMateria extends Estudiante {
    private String materia;
    private String area;
    private double nota;

    public ClaseMateria(String nombre, 
                                  double codigo, 
                                  String grado,
                                  String materia, 
                                  String area, 
                                  double nota ) {
        super(nombre, codigo, grado);
        this.materia = materia;
        this.area = area;
        this.nota = nota;
    }
    /*
    public String clasificar(){
        String escala = " ";
        if (nota >= 0 && nota <= 5){
            System.out.println("");
        }
    }
*/
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
