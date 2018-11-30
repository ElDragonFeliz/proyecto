package dragonfeliz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLVentasController {

    @FXML
    private Button btn_Agregar, btn_Cobrar, btn_Borrar;

    @FXML
    private Button btn_Aguacate, btn_Huevo;

    @FXML
    private Button btn_Algas, btn_Apio, btn_Brocoli, btn_Cebolla, btn_Chicharo, btn_Papa, btn_Zanahoria;

    @FXML
    private Button btn_Arroz, btn_Pasta;

    @FXML
    private Button btn_Base, btn_Carne, btn_Salsas, btn_Toping, btn_Verdura;

    @FXML
    private Button btn_Pescado, btn_Pollo, btn_Puerco, btn_Res, btn_Oveja;

    @FXML
    private Button btn_s1, btn_s2, btn_s3;

    @FXML
    private Button btn_Salir;

    @FXML
    private TableColumn<?, ?> tc_ID;

    @FXML
    private TableColumn<?, ?> tc_Precio;

    @FXML
    private TableColumn<?, ?> tc_Producto;

    @FXML
    private TextField tf_ID;

    @FXML
    private Text tx_Total;

    @FXML
    ChoiceBox choice = new ChoiceBox(FXCollections.observableArrayList("Primera", "segunda" ,"tercera")
    );

    @FXML
    void initialize() {

        btn_Base.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_Arroz.setVisible(true);
                btn_Pasta.setVisible(true);
            }
        });
        btn_Carne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_Puerco.setVisible(true);
                btn_Res.setVisible(true);
                btn_Pollo.setVisible(true);
                btn_Oveja.setVisible(true);
                btn_Pescado.setVisible(true);
                btn_Pescado.setVisible(true);
                btn_Oveja.setVisible(true);
            }
        });
        btn_Verdura.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_Algas.setVisible(true);
                btn_Apio.setVisible(true);
                btn_Brocoli.setVisible(true);
                btn_Cebolla.setVisible(true);
                btn_Chicharo.setVisible(true);
                btn_Zanahoria.setVisible(true);
                btn_Papa.setVisible(true);
            }
        });
        btn_Salsas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_s1.setVisible(true);
                btn_s2.setVisible(true);
                btn_s3.setVisible(true);
            }
        });
        btn_Toping.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_Huevo.setVisible(true);
                btn_Aguacate.setVisible(true);
            }
        });
        btn_Arroz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("SE AGREGO ARROZ");
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
            }
        });
        btn_Base.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_Arroz.setVisible(true);
                btn_Pasta.setVisible(true);
            }
        });
        btn_Carne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_Puerco.setVisible(true);
                btn_Res.setVisible(true);
                btn_Pollo.setVisible(true);
                btn_Oveja.setVisible(true);
                btn_Pescado.setVisible(true);
                btn_Pescado.setVisible(true);
                btn_Oveja.setVisible(true);
            }
        });
        btn_Verdura.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_Algas.setVisible(true);
                btn_Apio.setVisible(true);
                btn_Brocoli.setVisible(true);
                btn_Cebolla.setVisible(true);
                btn_Chicharo.setVisible(true);
                btn_Zanahoria.setVisible(true);
                btn_Papa.setVisible(true);
            }
        });
        btn_Salsas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_s1.setVisible(true);
                btn_s2.setVisible(true);
                btn_s3.setVisible(true);
            }
        });
        btn_Toping.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
                btn_Huevo.setVisible(true);
                btn_Aguacate.setVisible(true);
            }
        });
        btn_Arroz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("SE AGREGO ARROZ");
                ocultar_todo();//To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    void ocultar_todo() {
        btn_Arroz.setVisible(false);
        btn_Pasta.setVisible(false);
        btn_Aguacate.setVisible(false);
        btn_Algas.setVisible(false);
        btn_Apio.setVisible(false);
        btn_Brocoli.setVisible(false);
        btn_Pescado.setVisible(false);
        btn_Cebolla.setVisible(false);
        btn_Chicharo.setVisible(false);
        btn_Huevo.setVisible(false);
        btn_Oveja.setVisible(false);
        btn_Papa.setVisible(false);
        btn_Pollo.setVisible(false);
        btn_Puerco.setVisible(false);
        btn_Res.setVisible(false);
        btn_Zanahoria.setVisible(false);
        btn_s1.setVisible(false);
        btn_s2.setVisible(false);
        btn_s3.setVisible(false);
    }

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

}
