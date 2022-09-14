/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author aliso
 */
public class conect {
    
    public static final String DRIVER = "\"com.mysql.cj.jdbc.Driver\"";
    public static final String URL = "jdbc:mysql://localhost:3306/db_pedido";
    public static final String USER = "root";
    public static final String PASS = "root";
    
public static Connection getConnection() throws ClassNotFoundException{

    Connection conn = null;
   try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       conn=DriverManager.getConnection(URL, USER, PASS);
   }catch(SQLException erro){
       JOptionPane.showMessageDialog(null,"Erro na conexão com o banco de dados"+ erro.getMessage());
   }
   return conn;
 }
    
}
