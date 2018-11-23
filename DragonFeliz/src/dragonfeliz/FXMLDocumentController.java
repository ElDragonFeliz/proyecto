/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonfeliz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Alejandro
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btn_Login;

    @FXML
    public TextField tf_Password;

    @FXML
    public TextField tf_USer;

//    @FXML
//    void OnAction_Login(ActionEvent event) {
//        String usuario = tf_Password.getText();
//        String contra = tf_Password.getText();
//        Datosconexion da = new Datosconexion();
//        
//        if (da.provocarconexion(usuario, contra) == 1) {
//            JOptionPane.showMessageDialog(null, "Inició sesión.");
//        } else {
//            JOptionPane.showMessageDialog(null, "No se inició sesión.");
//        }
//        
//    }
    public TextField getTf_USer() {
        return tf_USer;
    }

    public TextField getTf_Password() {
        return tf_Password;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btn_Login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String usuario = tf_USer.getText();
                String contra = tf_Password.getText();
                Datosconexion da = new Datosconexion();
                System.out.println("usuario: " + usuario);
                System.out.println("contraseña: " + contra);
                if (da.provocarconexion(usuario, contra) == 1) {
                    JOptionPane.showMessageDialog(null, "Inició sesión.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se inició sesión.");
                }
            }
        });

    }

}
