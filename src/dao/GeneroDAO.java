/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Genero;
import persistencia.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "insert into GENEROS "
                +"(id_genero, nome_genero)"
                +" values(?, ?)";
        
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
    
    public List<Genero> getListaGenero(){
        try {
            List<Genero> generos = new ArrayList<Genero>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from GENEROS ");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Genero gen = new Genero();
                gen.setIdGenero(rs.getLong("id_genero"));
                gen.setNomeGenero(rs.getString("nome_genero"));
                generos.add(gen);
            }
            rs.close();
            stmt.close();
            return generos;
        } catch (SQLException se) {
            throw new RuntimeException(se);
        }
    }
    
    public void updateGenero(Genero gen, long id){
        String sql = "update GENEROS set id_genero=?, nome_genero=? where id_genero=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, gen.getIdGenero());
            stmt.setString(2, gen.getNomeGenero());
            stmt.setLong(3, id);
            stmt.execute();
            stmt.close();
            
        } catch (SQLException se) {
            throw new RuntimeException(se.getMessage());
        }
    }
    
    public Genero getGeneros(long id){
         Genero gen = new Genero();
         if(id == 0){
              return gen;
         }
         
         try {
              PreparedStatement stmt = this.connection.prepareStatement("select * from GENEROS where id_genero = ? ");
              stmt.setLong(1, id);
              ResultSet rs = stmt.executeQuery();
              
              while(rs.next()){
                   gen.setIdGenero(rs.getLong("id_genero"));
                   gen.setNomeGenero(rs.getString("nome_genero"));
              }
              rs.close();
              stmt.close();
              return gen;
              
         } catch (SQLException e) {
              throw new RuntimeException(e);
         }
    }
    
    public void deletarGenero(Genero gen){
         String sql = "delete from GENEROS where id_genero = ?";
         
         try {
              PreparedStatement stmt = connection.prepareStatement(sql);
              stmt.setLong(1, gen.getIdGenero());
              stmt.execute();
              stmt.close();
         } catch (SQLException e) {
              throw new RuntimeException(e);
         }
    }
}
