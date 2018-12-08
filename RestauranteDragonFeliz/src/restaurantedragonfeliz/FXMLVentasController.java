/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantedragonfeliz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kevin Alejandro
 */
public class FXMLVentasController {

    @FXML
    private Button btn_Add, btn_Pay, btn_return;

    @FXML
    private CheckBox cb_Ajies, cb_Apio, cb_Brocoli, cb_Papa, cb_cebolla;

    @FXML
    private ImageView img_Base, img_Carnes, img_Salsas, img_Toping;

    @FXML
    private ComboBox<?> cbx_Base, cbx_Carnes, cbx_Salsas, cbx_Toping;

    @FXML
    void OnAction_Pay(ActionEvent event) {
        
    }

    @FXML
    void OnAction_Return(ActionEvent event) {
        Stage stage = new Stage();

        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        stage.close();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Restaurant - El Dragon Feliz - Login");
        stage.show();
    }

    @FXML
    void On_Action_Add(ActionEvent event) {
        
    }

    @FXML
    void initialize() {

    }

    
}
