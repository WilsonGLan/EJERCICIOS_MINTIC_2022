package sesion5cp1;

public class Producto {
    private int codigo;
    private int pCompra;
    private int cBodega;
    private int cMinRequerida;
    private int cMaxPermitida;
    public static double pDescuento=0.01;

    public Producto(int codigo, int pCompra, int cBodega, int cMinRequerida, int cMaxPermitida) {
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.cBodega = cBodega;
        this.cMinRequerida = cMinRequerida;
        this.cMaxPermitida = cMaxPermitida;
    }

    
    
    public boolean solicitar(){
        if (cMinRequerida>cBodega) {
            return true;            
        } else {
            return false;
        }    
    }
    
    public int totalAPagar(int unidades){
        return unidades*pCompra;
    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getpCompra() {
        return pCompra;
    }

    public void setpCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public int getcBodega() {
        return cBodega;
    }

    public void setcBodega(int cBodega) {
        this.cBodega = cBodega;
    }

    public int getcMinRequerida() {
        return cMinRequerida;
    }

    public void setcMinRequerida(int cMinRequerida) {
        this.cMinRequerida = cMinRequerida;
    }

    public int getcMaxPermitida() {
        return cMaxPermitida;
    }

    public void setcMaxPermitida(int cMaxPermitida) {
        this.cMaxPermitida = cMaxPermitida;
    }
    
    

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", pCompra=" + pCompra + ", cBodega=" + cBodega + ", cMinRequerida=" + cMinRequerida + '}';
    } 
}
