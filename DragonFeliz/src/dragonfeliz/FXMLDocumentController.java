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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
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
    private TextField tf_Password;

    @FXML
    private TextField tf_USer;


    @FXML
    void OnAction_Login(ActionEvent event) throws IOException {
    /*    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLVentas.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setResizable(false);
        stage.setTitle("Restaurant - El Dragon Feliz");
        Image ico = new Image("/img/dragon.png"); 
        stage.getIcons().add(ico);

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
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
