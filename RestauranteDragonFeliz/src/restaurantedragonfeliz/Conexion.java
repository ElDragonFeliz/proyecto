/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantedragonfeliz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;

/**
 *
 * @author CRASH
 */
public class Conexion {
   /* public void GuardarUsuario(administador_de_usuarios ad) {
        try {
            FileOutputStream fo = new FileOutputStream("usuarios.bin");
            try (ObjectOutputStream oos = new ObjectOutputStream(fo)) {
                oos.writeObject(ad);
                oos.flush();
                oos.close();
            }
        } catch (IOException ex) {
            // write stack trace to standard error
            ex.printStackTrace();
        }
    }

    public administador_de_usuarios RecuperarArchivo(administador_de_usuarios b) {
        try {
            final FileInputStream fis = new FileInputStream("usuarios.bin");
            final ObjectInputStream ois = new ObjectInputStream(fis);
            final Object deserializedObject = ois.readObject();
            out.println("Tipo de objeto " + deserializedObject.getClass().getName());
            if (deserializedObject instanceof administador_de_usuarios) {
                b = (administador_de_usuarios) deserializedObject;
            } else {
                out.println("No se esperaba " + deserializedObject.getClass().getName());
            }
            ois.close();
            if (b != null) {
                //ver el arbol
            } else {
                out.println("VACIO");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
           // Logger.getLogger(FXMLMenuController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("PINCHE ERROR CULERO XD");
        }
        return b;
    }*/
    
}
