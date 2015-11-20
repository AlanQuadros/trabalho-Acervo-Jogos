
package persistencia;
import java.sql.*;
import java.util.Properties;
/**
 *
 * @author Alan Quadros
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
