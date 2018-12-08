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
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kevin Alejandro
 */
public class FXMLVentasController {

    int contador = 0;
    boolean bandera = false;
    
    @FXML
    private Button btn_Add, btn_Pay, btn_return;

    @FXML
    private CheckBox cb_Ajies, cb_Apio, cb_Brocoli, cb_Papa, cb_cebolla;

    @FXML
    private ImageView img_Base, img_Carnes, img_Salsas, img_Toping;

    @FXML
    private ComboBox<?> cbx_Base, cbx_Carnes, cbx_Salsas, cbx_Toping;
    
     @FXML
    private Button btn_CancelarPedido, btn_Cobrar, btn_EliminarFila;
     
    @FXML
    private TableColumn<?, ?> tc_Ingrediente;

    @FXML
    private TableColumn<?, ?> tc_Platillo;

    @FXML
    private TableColumn<?, ?> tc_Precio;

    @FXML
    private TextField tf_1, tf_2, tf_3, tf_4, tf_5;
    
    @FXML
    void OnAction_Pay(ActionEvent event) {
        Stage stage = new Stage();

        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        stage.close();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLCocineroTicket.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Restaurant - El Dragon Feliz - Ticket");
        stage.show();
    }
    
    @FXML
    void ac_ajies(ActionEvent event) {
        if (cb_Ajies.isSelected()==true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        } else {
            this.contador--;
            System.out.println("Contador: " + contador);
                if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        }
        
        
    }

    @FXML
    void ac_apio(ActionEvent event) {
        if (cb_Apio.isSelected()==true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        } else {
            this.contador--;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        }
    }

    @FXML
    void ac_brocoli(ActionEvent event) {
        if (cb_Brocoli.isSelected()==true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        } else {
            this.contador--;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        }
    }

    @FXML
    void ac_cebolla(ActionEvent event) {
        if (cb_cebolla.isSelected()==true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        } else {
            this.contador--;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        }
    }

    @FXML
    void ac_papa(ActionEvent event) {
        if (cb_Papa.isSelected()==true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        } else {
            this.contador--;
            System.out.println("Contador: " + contador);
            if(this.contador>=3) {
                tf_1.setDisable(false);
                tf_2.setDisable(false);
                tf_3.setDisable(false);
                tf_4.setDisable(false);
                tf_5.setDisable(false);
            } else if (this.contador <= 3) {
                tf_1.setDisable(true);
                tf_2.setDisable(true);
                tf_3.setDisable(true);
                tf_4.setDisable(true);
                tf_5.setDisable(true);
            }
        }
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
    void OnAction_CancelarPedido(ActionEvent event) {
        Stage stage = new Stage();

        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        stage.close();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLVentas.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Dragon Feliz - Menú de Venta");
        stage.show();
    }

    @FXML
    void OnAction_Cobrar(ActionEvent event) {
    }

    @FXML
    void On_Action_EliminarFila(ActionEvent event) {
    }


    @FXML
    void initialize() {
        
    }

    
}
