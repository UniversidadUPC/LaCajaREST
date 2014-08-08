/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.lacaja.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AlfredoRegis
 */
public class Conexion {
 
    Connection con = null;
    
    public Connection conexion(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:8889/PENSIONWEB","root","root");
        }catch (SQLException e) {
           System.out.println("error de conexion :"+e);           
       }
       return con;
    }
}
