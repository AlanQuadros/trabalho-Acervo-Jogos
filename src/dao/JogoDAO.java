package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Genero;
import modelo.Jogo;
import modelo.Plataforma;
import modelo.Produtora;
import persistencia.ConnectionFactory;

/**
 *
 * @author Alan Quadros <alanquaros@hotmail.com>
 * @date 21/11/2015
 */
public class JogoDAO {

     private Connection connection;

     public JogoDAO() {
          this.connection = new ConnectionFactory().getConnection();
     }

     public void insertJogo(Jogo j) {
          String sql = "insert into JOGO "
                  + "(id_jogo, nome_jogo, metacritica, esrb, descricao, max_players, personagem, data_lancamento, id_genero, id_plataforma, id_produtora)"
                  + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, j.getIdJogo());
               stmt.setString(2, j.getNomeJogo());
               stmt.setInt(3, j.getMetacritica());
               stmt.setString(4, j.getEsrb());
               stmt.setString(5, j.getDescricao());
               stmt.setInt(6, j.getMaxPlayers());
               stmt.setString(7, j.getPersonagem());
               stmt.setDate(8, j.getDataLancamento());
               stmt.setLong(9, j.getGenero().getIdGenero());
               stmt.setLong(10, j.getPlataforma().getIdPlataforma());
               stmt.setLong(11, j.getProdutora().getId());

               stmt.execute();
               stmt.close();

          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }

     public List<Jogo> getListaJogo() {
          try {
               List<Jogo> jogos = new ArrayList<>();
               PreparedStatement stmt = connection.prepareStatement("SELECT * FROM JOGO J INNER JOIN GENEROS G"
                       + " ON J.ID_GENERO = G.ID_GENERO INNER JOIN PLATAFORMA PLA"
                       + " ON J.ID_PLATAFORMA = PLA.ID_PLATAFORMA INNER JOIN PRODUTORA PRO"
                       + " ON J.ID_PRODUTORA = PRO.ID_PRODUTORA"
                       + " ORDER BY J.ID_JOGO ASC");
               ResultSet rs = stmt.executeQuery();

               while (rs.next()) {
                    Genero g = new Genero();
                    g.setIdGenero(rs.getLong("id_genero"));
                    g.setNomeGenero(rs.getString("nome_genero"));
                    
                    Plataforma pla = new Plataforma();
                    pla.setIdPlataforma(rs.getLong("id_plataforma"));
                    pla.setNomePlataforma(rs.getString("nome_plataforma"));
                    pla.setTipoPlataforma(rs.getString("tipo"));
                    pla.setFabricante(rs.getString("fabricante"));
                    pla.setDataLancamento(rs.getDate("data_lanc_plataforma"));
                    
                    Produtora pro = new Produtora();
                    pro.setId(rs.getLong("id_produtora"));
                    pro.setNome(rs.getString("nome_produtora"));
                    pro.setPais(rs.getString("pais_origem"));
                    pro.setSite(rs.getString("site_produtora"));
                    
                    Jogo j = new Jogo();
                    j.setIdJogo(rs.getLong("id_jogo"));
                    j.setNomeJogo(rs.getString("nome_jogo"));
                    j.setMetacritica(rs.getInt("metacritica"));
                    j.setEsrb(rs.getString("esrb"));
                    j.setDescricao(rs.getString("descricao"));
                    j.setMaxPlayers(rs.getInt("max_players"));
                    j.setPersonagem(rs.getString("personagem"));
                    j.setDataLancamento(rs.getDate("data_lancamento"));
                    j.setGenero(g);
                    j.setPlataforma(pla);
                    j.setProdutora(pro);
                    
                    jogos.add(j);
               }
               rs.close();
               stmt.close();
               return jogos;

          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }

     }
     
     public void upateJogo(Jogo j, long id){
          String sql = "update JOGO set id_jogo=?, nome_jogo=?,"
                  + " metacritica=?, esrb=?, descricao=?, max_players=?,"
                  + " personagem=?, data_lancamento=?, id_genero=?,"
                  + " id_plataforma=?, id_produtora=?"
                  + " where id_jogo="+id;
          
          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.setLong(1, j.getIdJogo());
               stmt.setString(2, j.getNomeJogo());
               stmt.setInt(3, j.getMetacritica());
               stmt.setString(4, j.getEsrb());
               stmt.setString(5, j.getDescricao());
               stmt.setInt(6, j.getMaxPlayers());
               stmt.setString(7, j.getPersonagem());
               stmt.setDate(8, j.getDataLancamento());
               stmt.setLong(9, j.getGenero().getIdGenero());
               stmt.setLong(10, j.getPlataforma().getIdPlataforma());
               stmt.setLong(11, j.getProdutora().getId());

               stmt.execute();
               stmt.close();
          } catch (SQLException ex) {
               throw new RuntimeException(ex.getMessage());
          }
     }
     
     public Jogo getJogo(long id){
          Jogo j = new Jogo();
          
          if(id == 0){
               return j;
          }
          
          try {
               PreparedStatement stmt = connection.prepareStatement("SELECT * FROM JOGO WHERE ID_JOGO="+id);
               ResultSet rs = stmt.executeQuery();
               
               while(rs.next()){
                    Genero g = new Genero();
                    g.setIdGenero(rs.getLong("id_genero"));
                    g.setNomeGenero(rs.getString("nome_genero"));
                    
                    Plataforma pla = new Plataforma();
                    pla.setIdPlataforma(rs.getLong("id_plataforma"));
                    pla.setNomePlataforma(rs.getString("nome_plataforma"));
                    pla.setTipoPlataforma(rs.getString("tipo"));
                    pla.setFabricante(rs.getString("fabricante"));
                    pla.setDataLancamento(rs.getDate("data_lanc_plataforma"));
                    
                    Produtora pro = new Produtora();
                    pro.setId(rs.getLong("id_produtora"));
                    pro.setNome(rs.getString("nome_produtora"));
                    pro.setPais(rs.getString("pais_origem"));
                    pro.setSite(rs.getString("site_produtora"));
                    
                    j.setIdJogo(rs.getLong("id_jogo"));
                    j.setNomeJogo(rs.getString("nome_jogo"));
                    j.setMetacritica(rs.getInt("metacritica"));
                    j.setEsrb(rs.getString("esrb"));
                    j.setDescricao(rs.getString("descricao"));
                    j.setMaxPlayers(rs.getInt("max_players"));
                    j.setPersonagem(rs.getString("personagem"));
                    j.setDataLancamento(rs.getDate("data_lancamento"));
                    j.setGenero(g);
                    j.setPlataforma(pla);
                    j.setProdutora(pro);
               }
               rs.close();
               stmt.close();
               return j;
          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }

     public void deletarJogo(long id){
          String sql = "delete from JOGO where id_jogo = "+id;
          
          try {
               PreparedStatement stmt = connection.prepareStatement(sql);
               stmt.execute();
               stmt.close();
               
          } catch (SQLException ex) {
               throw new RuntimeException(ex);
          }
     }
}
