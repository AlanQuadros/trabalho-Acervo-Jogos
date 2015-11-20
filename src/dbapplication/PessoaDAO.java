/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rdias
 */
public class PessoaDAO {
     // a conexão com o banco de dados
   private Connection connection;
 
   public PessoaDAO() {
     this.connection = new ConnectionFactory().getConnection();
   }
  
   public void insert(Pessoa pessoa) {
     String sql = "insert into pessoas " +
             "(cpf, nome, idade,endereco)" +
             " values (?,?,?,?)";
 
     try {
         // prepared statement para inserção
         PreparedStatement stmt = connection.prepareStatement(sql);
 
         // seta os valores
         stmt.setString(1,pessoa.getCpf());
         stmt.setString(2,pessoa.getNome());
         stmt.setInt(3,pessoa.getIdade());
         stmt.setString(4,pessoa.getEndereco());
          
         // executa
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }

   public void update(Pessoa pessoa) {
     String sql = "update pessoas set cpf=?, nome=?, idade=?, endereco=? " +
             " where cpf=?";
     try {
         PreparedStatement stmt = connection.prepareStatement(sql);
         stmt.setString(1, pessoa.getCpf());
         stmt.setString(2, pessoa.getNome());
         stmt.setInt(3, pessoa.getIdade());
         stmt.setString(4, pessoa.getEndereco());         
         stmt.setString(5, pessoa.getCpf());
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }

   public void delete(Pessoa pessoa) {
     String sql = "delete from pessoas where cpf=?";
     try {
         PreparedStatement stmt = connection.prepareStatement(sql);
         stmt.setString(1, pessoa.getCpf());      
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
   
   
  public List<Pessoa> getLista() {
     try {
         List<Pessoa> pessoas = new ArrayList<Pessoa>();
         PreparedStatement stmt = this.connection.
                 prepareStatement("select * from pessoas ");
         ResultSet rs = stmt.executeQuery();
 
         while (rs.next()) {
             // criando o objeto Contato
             Pessoa pessoa = new Pessoa();
             pessoa.setCpf(rs.getString("cpf"));
             pessoa.setNome(rs.getString("nome"));
             pessoa.setIdade(rs.getInt("idade"));
             pessoa.setEndereco(rs.getString("endereco"));
 
             // adicionando o objeto à lista
             pessoas.add(pessoa);
         }
         rs.close();
         stmt.close();
         return pessoas;
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 } 
  
  public Pessoa consultaCPF(String cpf) {
      
    Pessoa pessoa = new Pessoa();    
    if (cpf == null || cpf.equals("")) {
        return pessoa;
    }
    
    try {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoas where cpf = ? ");
         stmt.setString(1, cpf);
         ResultSet rs = stmt.executeQuery();
                  
         while (rs.next()){            
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setIdade(rs.getInt("idade"));
            pessoa.setEndereco(rs.getString("endereco"));            
         }
         rs.close();
         stmt.close();
         return pessoa;
      
    } catch (SQLException e) {
         throw new RuntimeException(e);
     }        
  }
  
  public Pessoa consultaNome(String nome) {
      
    Pessoa pessoa = new Pessoa();    
    if (nome == null || nome.equals("")) {
        return pessoa;
    }
    
    try {
        PreparedStatement stmt = this.connection.prepareStatement("select * from pessoas where nome like ? ");
         stmt.setString(1, nome);
         ResultSet rs = stmt.executeQuery();
                  
         while (rs.next()){            
            pessoa.setCpf(rs.getString("cpf"));
            pessoa.setNome(rs.getString("nome"));
            pessoa.setIdade(rs.getInt("idade"));
            pessoa.setEndereco(rs.getString("endereco"));            
         }
         rs.close();
         stmt.close();
         return pessoa;
      
    } catch (SQLException e) {
         throw new RuntimeException(e);
     }        
  }
  
   
}
