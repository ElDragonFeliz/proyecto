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
    private TextField tf_Password;

    @FXML
    private TextField tf_USer;
    
    @FXML
    private Pane P_Error;
    

    String user;
    String password;

    Alert alert = new Alert(Alert.AlertType.WARNING);

    @FXML
    void OnAction_Login(ActionEvent event) throws IOException {

<<<<<<< HEAD
        user = tf_USer.getText();
        password = tf_Password.getText();
        
        if (user.length() == 0 || password.length() == 0 || user.length() == 0 && password.length() == 0) {
            //warnningAlert("Error", "Introduzca Usuario y/o Contraseña", "Se necesitan parametros");
            P_Error.setVisible(true);
        } else {
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

        }
=======
        stage.show(); */
        String user = tf_USer.getText();
        String pass = tf_Password.getText();
        Datosconexion da = new Datosconexion();
        if (da.provocarconexion(user, pass) == 1) {
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
            JOptionPane.showMessageDialog (null, "Contraseña incorrecta.");
        }
        
        
>>>>>>> 4f00bf32cae12a943dc1725ecac28241a404b181
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
