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
    Connection cn = cadena_conexion1 ();
    public int provocarconexion (String user, String pass) {
        int conexion = 0;
        
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = cn.prepareStatement("SELECT * FROM usuarios WHERE usuario='"+user+"' AND contra=('"+pass+"')");
            rs = ps.executeQuery();
            
            System.out.print ("\nConexión SQL Server\n");
                while (rs.next()) {
                    System.out.println("dato encontrado.");
                    conexion = 1;
                }
                cn.close();   
        } catch (SQLException e) {
            System.out.println (e.getMessage());
        }
        
        return conexion;
    }
}
