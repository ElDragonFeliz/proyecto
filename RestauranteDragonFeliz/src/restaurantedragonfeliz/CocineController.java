/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantedragonfeliz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class CocineController {
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_CancelarPedido;

    @FXML
    private Button btn_Cobrar;

    @FXML
    private Button btn_EliminarFila;

    @FXML
    private TextArea txt_ingredientes;

    @FXML
    private TextArea txt_platillo;

    @FXML
    private TextArea txt_precio;
    
    

    @FXML
    void OnAction_CancelarPedido(ActionEvent event) {
    }

    @FXML
    void OnAction_Cobrar(ActionEvent event) {
        
    }

    @FXML
    void On_Action_EliminarFila(ActionEvent event) {
    }

    
    
    @FXML
    void initialize() throws IOException {
        String cadena, cadena2;
        FileReader f = new FileReader("./productos.txt");
        FileReader g = new FileReader("./precios.txt");
        BufferedReader b = new BufferedReader(f);
        BufferedReader c = new BufferedReader(g);
        while((cadena = b.readLine())!=null) {
            txt_ingredientes.setText(txt_ingredientes.getText() + cadena + "\n");
        }
        while ((cadena2 = c.readLine())!=null) {
            txt_precio.setText(txt_precio.getText() + cadena2 + "\n");
        }
        b.close();
        c.close();
    }

}
