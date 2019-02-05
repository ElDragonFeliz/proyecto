/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantedragonfeliz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kevin Alejandro
 */
public class FXMLVentasController {
    int cobrar = 1;
    int contador = 0;
    int platillo = 1;
    boolean bandera = false;
    
    @FXML
    TextArea txt_precio,txt_platillo,txt_ingredientes, txt;
    @FXML
    private Button btn_Add, btn_Pay, btn_return;
    @FXML
    private CheckBox cb_Ajies, cb_Apio, cb_Brocoli, cb_Papa, cb_cebolla;

    @FXML
    private ImageView img_Base, img_Carnes, img_Salsas, img_Toping;

    @FXML
    private ComboBox<String> cbx_Base, cbx_Carnes, cbx_Salsas, cbx_Toping;

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
    
    String check1 = "";
    String check2 = "";
    String check3 = "";
    String check4 = "";
    String check5 = "";
    int cant1, cant2, cant3, cant4, cant5;
    
    @FXML
    void OnAction_Pay(ActionEvent event) {
        tf_1.setText("0");
        tf_2.setText("0");
        tf_3.setText("0");
        tf_4.setText("0");
        tf_5.setText("0");
        String [] product = new String [100];
        String [] cost = new String [100];
        String [] platillos = new String [100];
        if(cbx_Base.getValue()!=null) {
            if (cbx_Base.getSelectionModel().getSelectedIndex() == 0){
                product[0] = "Arroz";
                cost [0] = "120";
                platillos[0] = String.valueOf(platillo);
            } else {
                product[0] = "Fideos";
                cost [0] = "120"; 
                platillos[0] = String.valueOf(platillo);
            }
        }
        if(cbx_Carnes.getValue()!=null) {
            if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 0){
                product[1] = "Albóndigas";
                cost [1] = "90"; 
                platillos[0] = String.valueOf(platillo);
            } else if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 1) {
                product[1] = "Camarón";
                cost [1] = "110"; 
                platillos[0] = String.valueOf(platillo);
            } else if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 2) {
                product[1] = "Res";
                cost [1] = "80"; 
                platillos[0] = String.valueOf(platillo);
            } else if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 3) {
                product[1] = "Pollo";
                cost [1] = "75"; 
                platillos[0] = String.valueOf(platillo);
            } else if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 4) {
                product[1] = "Cerdo";
                cost [1] = "65"; 
                platillos[0] = String.valueOf(platillo);
            }
        }
        if(cbx_Salsas.getValue()!=null) {
            if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 0){
                product[2] = "Ciruela";
                cost [2] = "20"; 
                platillos[0] = String.valueOf(platillo);
            } else if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 1) {
                product[2] = "Soya";
                cost [2] = "10"; 
                platillos[0] = String.valueOf(platillo);
            } else if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 2) {
                product[2] = "Chili Sauce";
                cost [2] = "15"; 
                platillos[0] = String.valueOf(platillo);
            }
        }
        if(cbx_Toping.getValue()!=null) {
            if (cbx_Toping.getSelectionModel().getSelectedIndex() == 0){
                product[3] = "Huevos";
                cost [3] = "25"; 
                platillos[0] = String.valueOf(platillo);
            } else if (cbx_Carnes.getSelectionModel().getSelectedIndex() == 1) {
                product[3] = "Aguacate";
                cost [3] = "35"; 
                platillos[0] = String.valueOf(platillo);
            }
        }
        
        if(cb_Ajies.isSelected()!=false) {
            product[50] = "Ajies";
            cost[50] = "15";
            platillos[0] = String.valueOf(platillo);
        } if (cb_Apio.isSelected()!=false) {
            product[51] = "Apio";
            cost[51] = "13";
            platillos[0] = String.valueOf(platillo);
        } if (cb_Brocoli.isSelected()!=false) {
            product[52] = "Brocoli";
            cost[52] = "8";
            platillos[0] = String.valueOf(platillo);
        } if (cb_cebolla.isSelected()!=false) {
            product [53] = "Cebolla";
            cost[53] = "8";
            platillos[0] = String.valueOf(platillo);
        } if (cb_Papa.isSelected()!=false) {
            product [54] = "Papa";
            cost[54] = "10";
            platillos[0] = String.valueOf(platillo);
        }
        
        System.out.println("Platillo: "+platillos[0]);
//        if(cbx_Carnes.getValue()!=null)
//            product [1] = cbx_Carnes.getSelectionModel().getSelectedItem();
//         if(cbx_Salsas.getValue()!=null)
//            product [2] = cbx_Salsas.getSelectionModel().getSelectedItem();
//        if(cbx_Toping.getValue()!=null)
//            product [3] = cbx_Toping.getSelectionModel().getSelectedItem();
        
        //Dividir_Productos dividir = new Dividir_Productos(base);
        //System.out.println(base);

        if (cb_Ajies.isSelected()) {
            this.check1 = cb_Ajies.getText();
            System.out.println(check1);
            if (contador >= 3) {
                cant1 = Integer.parseInt(tf_1.getText());
                System.out.println(cant1);
            }
        } else {
            check1 = " ";
            System.out.println(check1);
        }
        if (cb_Apio.isSelected()) {
            check2 = cb_Apio.getText();
            System.out.println(check2);
            if (contador >= 3) {
                cant2 = Integer.parseInt(tf_2.getText());
                System.out.println(cant2);
            }
        } else {
            check2 = " ";
            System.out.println(check1);
        }
        if (cb_Brocoli.isSelected()) {
            check3 = cb_Brocoli.getText();
            System.out.println(check3);
            if (contador >= 3) {
                cant3 = Integer.parseInt(tf_3.getText());
                System.out.println(cant3);
            }
        } else {
            check3 = " ";
            System.out.println(check1);
        }
        if (cb_cebolla.isSelected()) {
            check4 = cb_cebolla.getText();
            System.out.println(check4);
            if (contador >= 3) {
                cant4 = Integer.parseInt(tf_4.getText());
                System.out.println(cant4);
            }
        } else {
            check4 = " ";
            System.out.println(check1);
        }
        if (cb_Papa.isSelected()) {
            check5 = cb_Papa.getText();
            System.out.println(check5);
            if (contador >= 3) {
                cant5 = Integer.parseInt(tf_5.getText());
                System.out.println(cant5);
            }
        } else {
            check5 = " ";
            System.out.println(check1);
        }
//        String base = (String) cbx_Base.getValue() + "\n" + cbx_Carnes.getValue() + "\n" + cbx_Salsas.getValue() + "\n" + cbx_Toping.getValue();
//        txt.setText(txt.getText() + base);
//        String checks = ("\n" + check1 + "\n" + check2 + "\n" + check3 + "\n" + check4 + "\n" + check5);

        FileWriter fichero = null;
        FileWriter fichero2 = null;
        FileWriter fichero3 = null;
        PrintWriter pw = null;
        PrintWriter pw2 = null;
        PrintWriter pw3 = null;
        try
        {
            fichero = new FileWriter("./productos.txt");
            pw = new PrintWriter(fichero);
            //System.out.println("producto2: ");
            for (int i=0; i<product.length; i++) {
                if(product[i]!=null) {
                    //System.out.println(product[i]);
                    pw.print(product[i] + "\n");
                }
                
            }
            fichero2 = new FileWriter("./precios.txt");
            pw2 = new PrintWriter(fichero2);
            int contador = 0;
            //System.out.println("Costo2: ");
            for (int i=0; i<cost.length; i++) {
                if(cost[i]!=null) {
                    //System.out.println(cost[i]);
                    pw2.print(cost[i] + "\n");
                    contador++;
                }
                
            }
            System.out.println("Contador: " + contador);
            fichero3 = new FileWriter("./Platillos.txt");
            pw3 = new PrintWriter(fichero3);
            for (int i=0; i<platillos.length; i++) {
                if(platillos[i]!=null) {
                    for (int j=0; i<contador; i++){
                        pw3.print(platillos[i] + "\n");
                    }
                    
                }
            }
//            for (int i = 0; i < base.length(); i++) {
//                if (base.charAt(i)=='n')
//                    i = i + 4;
//                pw.print(base.charAt(i));
//            }
//            for (int i = 0; i < checks.length(); i++) {
//                pw.print(checks.charAt(i));
//            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero || null!=fichero2 || null!=fichero3) {
              fichero.close();
              fichero2.close();
              fichero3.close();
           }
           
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        
        Stage stage = new Stage();

        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        stage.close();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLCocineroTicket.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(CocineController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Restaurant - El Dragon Feliz - Ticket");
        stage.show();
    }

    public void LlenarTabla() {

    }

    @FXML
    void ac_ajies(ActionEvent event) {
        if (cb_Ajies.isSelected() == true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if (this.contador >= 3) {
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
            if (this.contador >= 3) {
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
        if (cb_Apio.isSelected() == true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if (this.contador >= 3) {
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
            if (this.contador >= 3) {
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
        if (cb_Brocoli.isSelected() == true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if (this.contador >= 3) {
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
            if (this.contador >= 3) {
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
        if (cb_cebolla.isSelected() == true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if (this.contador >= 3) {
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
            if (this.contador >= 3) {
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
        if (cb_Papa.isSelected() == true) {
            this.contador++;
            System.out.println("Contador: " + contador);
            if (this.contador >= 3) {
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
            if (this.contador >= 3) {
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
        this.platillo++;
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
