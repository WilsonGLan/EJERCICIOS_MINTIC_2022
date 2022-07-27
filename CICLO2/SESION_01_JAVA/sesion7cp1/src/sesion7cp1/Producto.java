
package sesion7cp1;

/**
 *
 * @author Wilson Gutierrez
 */
public class Producto {
    private int codigo;
    private int pCompra;
    private int pVenta;
    private int cBodega;
    private int cMinRequerida;
    private int cMaxPermitida;
    public static double pDescuento=0.01;

    public Producto(int codigo, int pCompra, int pVenta, int cBodega, int cMinRequerida, int cMaxPermitida) {
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
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
        if (cMinRequerida<0) {
            this.cMinRequerida=0;            
        } else {
            this.cMinRequerida = cMinRequerida;
        }
    }

    public int getcMaxPermitida() {
        return cMaxPermitida;
    }

    public void setcMaxPermitida(int cMaxPermitida) {
        this.cMaxPermitida = cMaxPermitida;
    }

    public int getpVenta() {
        return pVenta;
    }

    public void setpVenta(int pVenta) {
        this.pVenta = pVenta;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", pCompra=" + pCompra + ", pVenta=" + pVenta + ", cBodega=" + cBodega + ", cMinRequerida=" + cMinRequerida + ", cMaxPermitida=" + cMaxPermitida + '}';
    }   
    
}
