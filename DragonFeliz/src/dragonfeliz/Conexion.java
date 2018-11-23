/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonfeliz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crash
 */
public class Conexion {
    
    public Connection cadena_conexion () {
        Connection cn1 = null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=eldragonfeliz","sa","slmca");
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println (e);
            e.printStackTrace();
        }
        
        return cn1;
    }
        
}                                                
