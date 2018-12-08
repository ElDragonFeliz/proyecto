/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantedragonfeliz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Cool IT Help
 */
public class LoginController  {
    
    
    @FXML
    private Pane Pane_Error;

    @FXML
    private Button btn_Cerrar;

    @FXML
    private Button btn_Login;

    @FXML
    private PasswordField tf_Pass;

    @FXML
    private TextField tf_User;

    String user;
    String password;
    
    @FXML
    void OnAction_Cerrar(ActionEvent event) {
        Pane_Error.setVisible(false);
    }

    @FXML
    void OnAction_Login(ActionEvent event) {
        user = tf_User.getText();
        password = tf_Pass.getText();
        System.out.println("USER:" + user + " Pass:" + password);
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
        } else if ((user.equals("Erick")) && (password.equals("12345"))) {
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
        } else if ((user.equals("Albert")) && (password.equals("12345"))) {
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
            Pane_Error.setVisible(true);
        }
    }

    @FXML
    void initialize() {
        Pane_Error.setVisible(false);
    }
    
}