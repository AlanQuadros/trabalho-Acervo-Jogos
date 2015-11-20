/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Alan Quadros
 */
public class GeneroDAO {
    
    private Connection connection;

    public GeneroDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void insertGenero(Genero genero) throws SQLException{
        String sql = "insert into generos "
                +"(id_genero, nome_genero)"
                +" values(null, ?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, genero.getIdGenero());
            stmt.setString(2, genero.getNomeGenero());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException se) {
            throw new RuntimeException(se);
        }
        
    }
}
