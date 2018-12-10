/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantedragonfeliz;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CRASH
 */
public final class Platillos implements Serializable{

    String lista;
    ArrayList<Producto> productos = new ArrayList<>();
    Producto p;
    int platillo;
    

    public Platillos(String lista, int platillo) {
        this.lista = lista;  
        this.platillo = platillo;
    }

    public void Separar() {
        String[] products = lista.split("\n");

        //default seach
        for (int i = 0; i < products.length; i++) {
            if (!"null".equals(products[i])) {
                String[] dividir = products[i].split(" ");
                productos.add(new Producto(dividir[0], dividir[1], platillo));
            }
        }
    }
    
    public void Imprimir_Compras(){
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).getProducto() + " XDXD " + productos.get(i).getPrecio());
        }
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

}
