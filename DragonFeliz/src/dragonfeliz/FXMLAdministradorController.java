/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonfeliz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kevin Alejandro
 */
public class FXMLAdministradorController implements Initializable {

    @FXML
    private Pane P_Opcion1, P_Modificar;

    @FXML
    private Button btn_Admin;

    @FXML
    private Button btn_Cancelar;

    @FXML
    private Button btn_Empleados;

    @FXML
    private Button btn_Inventario;

    @FXML
    private Button btn_Listo;

    @FXML
    private Button btn_Modificar;

    @FXML
    private Button btn_Reporte;

    @FXML
    private Button btn_Salir;

    @FXML
    private Button btn_VentasDia;

    @FXML
    private Text t_Modifica;

    @FXML
    private Text t_Modificar;

    @FXML
    private TextArea ta_VentaDia;

    @FXML
    private TextField tf_ModificarPass;

    @FXML
    private TextField tf_ModificarUser;
    
     @FXML
    void OnAction_Salir(ActionEvent event) {
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
    void OnAction_Modificar(ActionEvent event) {
        P_Opcion1.setVisible(true);
        btn_Admin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                P_Opcion1.setVisible(false);
                P_Modificar.setVisible(true);
            }
        });
    }


    @FXML
    void OnAction_Inventario(ActionEvent event) {
    }
    

    @FXML
    void OnAction_Reportes(ActionEvent event) {
    }

    @FXML
    void OnAction_VentasDia(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
