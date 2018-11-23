package dragonfeliz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class FXMLVentasController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_Agregar;

    @FXML
    private Button btn_Aguacate;

    @FXML
    private Button btn_Algas;

    @FXML
    private Button btn_Apio;

    @FXML
    private Button btn_Arroz;

    @FXML
    private Button btn_Base;

    @FXML
    private Button btn_Borrar;

    @FXML
    private Button btn_Brocoli;

    @FXML
    private Button btn_Carne;

    @FXML
    private Button btn_Cebolla;

    @FXML
    private Button btn_Chicharo;

    @FXML
    private Button btn_Cobrar;

    @FXML
    private Button btn_Huevo;

    @FXML
    private Button btn_Oveja;

    @FXML
    private Button btn_Papa;

    @FXML
    private Button btn_Pasta,btn_Pescado,btn_Pollo,btn_Puerco,btn_Res;

    @FXML
    private Button btn_Salsas, btn_Toping, btn_Verdura,btn_Zanahoria;

    @FXML
    private Button btn_s1,btn_s2,btn_s3;

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
    void initialize() {
       btn_Base.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               ocultar_todo();//To change body of generated methods, choose Tools | Templates.
               btn_Arroz.setVisible(true);
               btn_Pasta.setVisible(true);
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
    
    
    void ocultar_todo(){
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
    
    
    

}
