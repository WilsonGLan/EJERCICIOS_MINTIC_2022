package sesion7cp1;
/**
 *
 * @author Wilson Gutierrez
 */
public class Opciones {
    
    public static double [] venderProducto(Producto[]productos,int cp,int uvender){
        double[] respuesta=new double[2];
        
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getCodigo()==cp) {
                if (productos[i].getcBodega()>=uvender) {
                    respuesta[0]=productos[i].getpVenta()*uvender;
                    respuesta[1]=(productos[i].getpVenta()*uvender)*(1-Producto.pDescuento);
                    productos[i].setcBodega(productos[i].getcBodega()-uvender);                    
                } else {
                    respuesta[0]=-1;                   
                }                
            } 
            
        }
        
        return respuesta;
    }   
}



