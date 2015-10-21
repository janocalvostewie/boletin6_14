package boletin6_14;

/**
 *
 * @author Jano
 */
public class Boletin6_14 {
    public static void main(String[] args) {
        Producto primerProducto= new Producto(24,"C1" );
        Producto segundoProducto= new Producto(234,"H23" );
        Producto tercerProducto= new Producto(109,"M30" );
        primerProducto.sacarFactura();
        segundoProducto.sacarFactura();
        tercerProducto.sacarFactura();
        segundoProducto.setCodigo("K123");
        segundoProducto.setPrecio(247);
        segundoProducto.sacarFactura();
    }
    
}
