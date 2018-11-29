/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonfeliz;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CRASH
 */
public class Conexion {
    
    public Connection cadena_conexion1 () {
        Connection cn1 = null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn1 = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dragon","alberto","slmca");
        } catch (Exception e) {
            System.out.println (e);
        }
        
        return cn1;
    }
    
}
