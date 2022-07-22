package sesion4cp1;

public class Producto {
    private int codigo;
    private int pCompra;
    private int cBodega;
    private int cMinRequerida;

    public Producto(int codigo, int pCompra, int cBodega, int cMinRequerida) {
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.cBodega = cBodega;
        this.cMinRequerida = cMinRequerida;
    }
    
    public boolean solicitar(){
        if (cMinRequerida>cBodega) {
            return true;            
        } else {
            return false;
        }    
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

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", pCompra=" + pCompra + ", cBodega=" + cBodega + ", cMinRequerida=" + cMinRequerida + '}';
    } 
}
