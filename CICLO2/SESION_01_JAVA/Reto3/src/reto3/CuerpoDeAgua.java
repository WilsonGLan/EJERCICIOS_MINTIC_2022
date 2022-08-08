
package reto3;

import java.util.List;

/**
 *
 * @author Wilson Gutierrez
 */
public class CuerpoDeAgua extends ObjetoGeografico{
    private String mensaje = "";     

    public CuerpoDeAgua(List<String> nombre, List<Integer> codigo, List<Double> irca) {
        super(nombre, codigo, irca);
    }
     
   
    public String nivel(int posicion){        
        if (getIrca().get(posicion) >80  && getIrca().get(posicion) <= 100) {
            this.mensaje = ("INVIABLE SANITARIAMENTE");
        }else if (getIrca().get(posicion) > 35 && getIrca().get(posicion) <= 80) {
            this.mensaje = ("ALTO");
        }else if (getIrca().get(posicion) > 14 && getIrca().get(posicion) <= 35) {
            this.mensaje = ("MEDIO");
        }else if (getIrca().get(posicion) > 5 && getIrca().get(posicion) <= 14) {
           this. mensaje = ("BAJO");
        }else if (getIrca().get(posicion) >=0 && getIrca().get(posicion) <=5) {
            this.mensaje = ("SIN RIESGO");
        }else {
            this.mensaje = ("NA");
        }
        return this.mensaje;
    }

    public float cantMBSR(){
        float contar = 0;
        for (int i = 0; i < getIrca().size(); i++) {
            if (getIrca().get(i) >= 0  && getIrca().get(i) <= 35 ) {
                contar += 1;
            }
        }
        return contar;
    }
  
    public String nombreMedio(){
        int contar = 0;
        String nombres="";        
        for (int i = 0; i <  getIrca().size(); i++) {
            if (getIrca().get(i) > 14 && getIrca().get(i)  <= 35) {                
                if (nombres == "") {
                    nombres = getNombre().get(i);
                } else {
                    nombres +=  "\n" + getNombre().get(i);
                }
                contar += 1;            
                }               
        }         
        if (contar == 0){
            return "NA";
        }else{
            return nombres;
            }
        }  
     
    public String clasificaBaja(){
        double menor = getIrca().get(0);
        int buscarIndice = 0;
        for (int i = 1; i < getIrca().size(); i++) {
            if ( getIrca().get(i) <= menor) {
                menor = getIrca().get(i) ;
                buscarIndice = i;
            }
        }
        return getNombre().get(buscarIndice) + " " + String.valueOf(String.format("%.02f", getCodigo().get(buscarIndice).floatValue()));
       // System.out.println(this.nombre[buscarIndice]+" "+this.id[buscarIndice]);
    }

}
