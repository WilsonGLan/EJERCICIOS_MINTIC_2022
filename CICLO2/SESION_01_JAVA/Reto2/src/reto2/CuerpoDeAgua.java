
package reto2;

public class CuerpoDeAgua {
    private final String [] nombre;
    private final int  [] id;    
    private final double  [] irca;    
    private String mensaje;     

    public CuerpoDeAgua(String[] nombre, int[] id, double[] irca) {
        this.nombre = nombre;
        this.id = id;        
        this.irca = irca;        
        this.mensaje = "";         
    }

    public String nivel(int posicion){        
        if (irca[posicion ] > 80 && irca[posicion ] <= 100) {
            this.mensaje = ("INVIABLE SANITARIAMENTE");
        }else if (irca[posicion ] > 35 && irca[posicion ] <= 80) {
            this.mensaje = ("ALTO");
        }else if (irca[posicion ] > 14 && irca[posicion ] <= 35) {
            this.mensaje = ("MEDIO");
        }else if (irca[posicion ] > 5 && irca[posicion ] <= 14) {
           this. mensaje = ("BAJO");
        }else if (irca[posicion ] >=0 && irca[posicion ] <=5) {
            this.mensaje = ("SIN RIESGO");
        }else {
            this.mensaje = ("NA");
        }
        return this.mensaje;
    }
    
    public int cantMBSR(){
        int contar = 0;
        for (int i = 0; i < this.irca.length; i++) {
            if (this.irca[i] >= 0  && this.irca[i] <= 35 ) {
                contar += 1;
            }
        }
        return contar;
    }

    public void nombreMedio(){
        int contar = 0;
        String municipios="";        
        for (int i = 0; i < this.irca.length; i++) {
            if (this.irca[i] > 14 && this.irca[i]  <= 35) {                
                if (municipios == "") {
                    municipios = this.nombre[i]+ " ";
                } else {
                    municipios +=  this.nombre[i];
                }
                contar += 1;            
                }               
        }         
        if (contar == 0){
            System.out.println("NA");
        }else{
            System.out.println(municipios);
        }
        }  
    
    public void clasificaBaja(){
        double menor = irca[0];
        int buscarIndice = 0;
        for (int i = 1; i < this.irca.length; i++) {
            if ( irca[i] <= menor) {
                menor = irca[i];
                buscarIndice = i;
            }
        }
        System.out.println(this.nombre[buscarIndice]+" "+this.id[buscarIndice]);
    }

    
}
