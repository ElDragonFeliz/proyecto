/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonfeliz;

import java.io.File;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Alejandro
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btn_Login;

    @FXML
    private Button btn_Cerrar;

    @FXML
    private TextField pf_Password;

    @FXML
    private TextField tf_USer;

    @FXML
    private Pane P_Error;

    String user;
    String password;

    Alert alert = new Alert(Alert.AlertType.WARNING);

    @FXML
    void OnAction_Login(ActionEvent event) throws IOException {
        user = tf_USer.getText();
        password = pf_Password.getText();
        System.out.println("USER:"+user+" Pass:"+password);
        if ((user.equals("Administrador")) && (password.equals("admin"))) {
            Stage stage = new Stage();

            stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
            stage.close();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("FXMLAdministrador.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLAdministradorController.class.getName()).log(Level.SEVERE, null, ex);
            }
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Restaurant - El Dragon Feliz - Administrador");
            stage.show();
        } else if ((user.equals("Vendedor")) && (password.equals("vender"))) {
            Stage stage = new Stage();

            stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
            stage.close();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("FXMLVentas.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLVentasController.class.getName()).log(Level.SEVERE, null, ex);
            }
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Restaurant - El Dragon Feliz - Ventas");
            stage.show();
        } else {
            P_Error.setVisible(true);
        }
        

    }

    @FXML
    void OnAction_Cerrar(ActionEvent event) throws IOException {
        P_Error.setVisible(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        P_Error.setVisible(false);
        // TODO
    }

    public void warnningAlert(String title, String header, String content) {
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
