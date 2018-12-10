/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantedragonfeliz;

import java.io.Serializable;

/**
 *
 * @author CRASH
 */
public class Producto implements Serializable{
    String producto;
    String precio;
    int platillo;

    public Producto(String producto, String precio, int platillo) {
        this.producto = producto;
        this.precio = precio;
        this.platillo = platillo;
    }

    public String getPrecio() {
        return precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPlatillo() {
        return platillo;
    }

    public void setPlatillo(int platillo) {
        this.platillo = platillo;
    }
    
    
}
