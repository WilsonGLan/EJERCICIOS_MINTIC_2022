
package reto3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wilson Gutierrez
 */
public class ObjetoGeografico {
    private List<String> nombre = new ArrayList<>();
    private List<Integer> codigo = new ArrayList<Integer>();
    private List<Double> irca  = new ArrayList<Double>();      
    private String municipio;   
    private String TipoCuerpoAgua;
    private String TipoDeAgua;    

    public ObjetoGeografico(List<String> nombre, List<Integer> codigo, List<Double> irca) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.irca = irca;
    }
       

    public List<String> getNombre() {
        return nombre;
    }

    public void setNombre(List<String> nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getCodigo() {
        return codigo;
    }

    public void setCodigo(List<Integer> codigo) {
        this.codigo = codigo;
    }

    public List<Double> getIrca() {
        return irca;
    }

    public void setIrca(List<Double> irca) {
        this.irca = irca;
    }
    
    public String getMunicipio() {
        return municipio;
    }

     public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoCuerpoAgua() {
        return TipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String TipoCuerpoAgua) {
        this.TipoCuerpoAgua = TipoCuerpoAgua;
    }

    public String getTipoDeAgua() {
        return TipoDeAgua;
    }

    public void setTipoDeAgua(String TipoDeAgua) {
        this.TipoDeAgua = TipoDeAgua;
    }

    
}
