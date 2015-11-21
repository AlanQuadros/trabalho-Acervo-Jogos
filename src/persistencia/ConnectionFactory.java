
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
	connectionProps.put("user", "root"); // Coloque aqui o seu usu�rio
	connectionProps.put("password", "123456"); // Coloque aqui a sua senha
	Connection conexao = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/mysql", connectionProps);

        return conexao;        
        
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
