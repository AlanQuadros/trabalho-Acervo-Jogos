/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbapplication;
import java.sql.*;
import java.util.Properties;
/**
 *
 * @author rdias
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
	Properties connectionProps = new Properties();
	connectionProps.put("user", "bf280420"); // Coloque aqui o seu usu�rio
	connectionProps.put("password", "bf280420"); // Coloque aqui a sua senha
	Connection conexao = DriverManager.getConnection(
          "jdbc:oracle:thin:@//camburi.pucrs.br:1521/facin11g", connectionProps);

        return conexao;        
        
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
