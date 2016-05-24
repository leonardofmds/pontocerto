/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpontocerto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Leonardo
 */
public class Conexao 
{
    public Connection getConnection() throws SQLException {

    Connection conn = null;
    
    String url = "jdbc:mysql://mysql.hostinger.com.br/u255420641_pc";
    String user = "u255420641_adm";
    String pass = "password";
    
    
    conn = DriverManager.getConnection(url, user, pass);
    
    System.out.println("Connected to database");
    return conn;
}
}
