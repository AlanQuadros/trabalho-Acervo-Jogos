package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Produtora;
import persistencia.ConnectionFactory;

/**
 *
 * @author Alan Quadros <alanquaros@hotmail.com>
 * @date   21/11/2015
 */
public class ProdutoraDAO {
     private Connection connection;

     public ProdutoraDAO() {
          this.connection = new ConnectionFactory().getConnection();
     }
     
     public void inserProdutora(Produtora pro){
          String sql = "insert into PRODUTORA "
                  + "(id_produtora, nome_produtora, pais_origem, site_produtora)"
                  + " values(?, ?, ?, ?)";
          
          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, pro.getId());
               stmt.setString(2, pro.getNome());
               stmt.setString(3, pro.getPais());
               stmt.setString(4, pro.getSite());
               
               stmt.execute();
               stmt.close();
          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }
     
     public List<Produtora> getListaPlataforma(){
          try {
               List<Produtora> produtoras = new ArrayList<Produtora>();
               PreparedStatement stmt = connection.prepareStatement("select * from PRODUTORA ");
               ResultSet rs = stmt.executeQuery();
               
               while(rs.next()){
                    Produtora pro = new Produtora();
                    pro.setId(rs.getLong("id_produtora"));
                    pro.setNome(rs.getString("nome_produtora"));
                    pro.setPais(rs.getString("pais_origem"));
                    pro.setSite(rs.getString("site_produtora"));
                    produtoras.add(pro);
               }
               rs.close();
               stmt.close();
               return produtoras;
               
          } catch (SQLException se) {
               throw new RuntimeException(se);
          }
     }
     
     public void updateProdutora(Produtora pro, long id){
          String sql = "update PRODUTORA set id_produtora=?, nome_produtora=?,"
                  + " pais_origem=?, site_produtora=? "
                  + "where id_produtora="+id;
          
          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, pro.getId());
               stmt.setString(2, pro.getNome());
               stmt.setString(3, pro.getPais());
               stmt.setString(4, pro.getSite());
               stmt.execute();
               stmt.close();
          } catch (SQLException se) {
               throw new RuntimeException(se.getMessage());
          }
     }
     
     public Produtora getProdutora(long id){
          Produtora pro = new Produtora();
          if(id == 0){
               return pro;
          }
          
          try {
               PreparedStatement stmt = connection.prepareStatement("select * from PRODUTORA where id_produtora="+id);
               ResultSet rs = stmt.executeQuery();
               
               while(rs.next()){
                    pro.setId(rs.getLong("id_produtora"));
                    pro.setNome(rs.getString("nome_produtora"));
                    pro.setPais(rs.getString("pais_origem"));
                    pro.setSite(rs.getString("site_produtora"));
               }
               rs.close();
               stmt.close();
               return pro;
          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }
     
     public void deletarProdutora(Produtora pro){
          String sql = "delete from PRODUTORA where id_produtora = ?";
          
          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, pro.getId());
               stmt.execute();
               stmt.close();
               
          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }
}
