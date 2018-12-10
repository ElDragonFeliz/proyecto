/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantedragonfeliz;

import java.util.ArrayList;
import javafx.scene.control.TextArea;

/**
 *
 * @author CRASH
 */
public class Ticket {

    TextArea txt_precio,txt_platillo,txt_ingredientes;

    public Ticket(TextArea txt_precio, TextArea txt_platillo, TextArea txt_ingredientes,ArrayList<Producto> productos) {
        this.txt_precio = txt_precio;
        this.txt_platillo = txt_platillo;
        this.txt_ingredientes = txt_ingredientes;
    }
    
    
    
}
