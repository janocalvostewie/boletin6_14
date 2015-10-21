package boletin6_14;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Producto {
    private int precio;
    private String codigo;
    
    //CONSTRUCTORES
    public Producto(){
    
    }
    public Producto(int pre, String co){
        precio = pre;
        codigo = co;
    }
        
    //SETTERS
    public void setPrecio(int pre){
        precio=pre;
    }
    public void setCodigo(String co){
        codigo=co;
    }
    
    //GETTERS
    public float getPrecio(){
        return precio;
    }
    public String getCodigo(){
        return codigo;
    }
    
    //MÉTODOS
    public void sacarFactura(){
        JOptionPane.showMessageDialog(null,"FACTURA\n************\nCódigo del producto: "+codigo+"\nPrecio del Producto: "+precio); 
    }
}
