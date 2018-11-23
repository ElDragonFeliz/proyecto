/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonfeliz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author crash
 */
public class Datosconexion extends Conexion {
    Connection cn1 = cadena_conexion ();
    public int provocarconexion (String usuario, String contrasenia) {
        int conexion = 0;
        System.out.println(usuario + contrasenia);
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = cn1.prepareStatement("SELECT * FROM usuarios WHERE usuario='"+usuario+"'AND contrasenia=('"+contrasenia+"')");
            rs = ps.executeQuery();
            
                while (rs.next()) {
                    conexion = 1;
                }
                cn1.close();
            
        } catch (SQLException e) {
            System.out.println (e.getMessage());
            e.printStackTrace();
        }
        
        return conexion;
    }
    
}
