package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Plataforma;
import persistencia.ConnectionFactory;

/**
 *
 * @author Alan Quadros <alanquaros@hotmail.com>
 * @date 21/11/2015
 */
public class PlataformaDAO {

     private Connection connection;

     public PlataformaDAO() {
          this.connection = new ConnectionFactory().getConnection();
     }
     
     public void insertPlataforma(Plataforma pla){
          String sql = "insert into PLATAFORMA "
                  + "(id_plataforma, nome_plataforma, tipo, fabricante, data_lanc_plataforma)"
                  + " values(?, ?, ?, ?, ?)";
          
          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, pla.getIdPlataforma());
               stmt.setString(2, pla.getNomePlataforma());
               stmt.setString(3, pla.getTipoPlataforma());
               stmt.setString(4, pla.getFabricante());
               stmt.setDate(5, pla.getDataLancamento());
               
               stmt.execute();
               stmt.close();
               
          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }
     
     public List<Plataforma> getListaPlataforma(){
          try {
               List<Plataforma> plataformas = new ArrayList<Plataforma>();
               PreparedStatement stmt = connection.prepareStatement("select * from PLATAFORMA ");
               ResultSet rs = stmt.executeQuery();
               
               while(rs.next()){
                    Plataforma pla = new Plataforma();
                    pla.setIdPlataforma(rs.getLong("id_plataforma"));
                    pla.setNomePlataforma(rs.getString("nome_plataforma"));
                    pla.setTipoPlataforma(rs.getString("tipo"));
                    pla.setFabricante(rs.getString("fabricante"));
                    pla.setDataLancamento(rs.getDate("data_lanc_plataforma"));
                    plataformas.add(pla);
               }
               rs.close();
               stmt.close();
               return plataformas;
               
          } catch (SQLException se) {
               throw new RuntimeException(se);
          }
     }
     
     public void updatePlataforma(Plataforma pla, long id){
          String sql = "update PLATAFORMA set id_plataforma=?, nome_plataforma=?,"
                  + " tipo=?, fabricante=?, data_lanc_plataforma=? "
                  + "where id_plataforma="+id;
          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, pla.getIdPlataforma());
               stmt.setString(2, pla.getNomePlataforma());
               stmt.setString(3, pla.getTipoPlataforma());
               stmt.setString(4, pla.getFabricante());
               stmt.setDate(5, pla.getDataLancamento());
               
               stmt.execute();
               stmt.close();
               
          } catch (SQLException se) {
               throw new RuntimeException(se.getMessage());
          }
     }
     
     public Plataforma getPlataformas(long id){
          Plataforma pla = new Plataforma();
          if(id == 0){
               return pla;
          }
          
          try {
               PreparedStatement stmt = connection.prepareStatement("select * from PLATAFORMA where id_plataforma ="+id);
               ResultSet rs = stmt.executeQuery();
               
               while(rs.next()){
                    pla.setIdPlataforma(rs.getLong("id_plataforma"));
                    pla.setNomePlataforma(rs.getString("nome_plataforma"));
                    pla.setTipoPlataforma(rs.getString("tipo"));
                    pla.setFabricante(rs.getString("fabricante"));
                    pla.setDataLancamento(rs.getDate("data_lanc_plataforma"));
               }
               rs.close();
               stmt.close();
               return pla;
               
          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }
     
     public void deletarPlataforma(Plataforma pla){
          String sql = "delete from PLATAFORMA where id_plataforma = ? ";
          
          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, pla.getIdPlataforma());
               stmt.execute();
               stmt.close();
               
          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }
}
