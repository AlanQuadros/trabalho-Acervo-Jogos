/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbapplication;

/**
 *
 * @author rdias
 */
import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class DBApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	String strCPF;

        try {
            

/*      
	// Para inserir uma pessoa crie um Bean e popule os dados a serem gravados
            
        Pessoa pessoa = new Pessoa();
	pessoa.setCpf("987654321");
	pessoa.setNome("Zé da Silva");
	pessoa.setIdade(30);
	pessoa.setEndereco("Av. Ipiranga 9500");

	// O DAO de pessoa obtém a conexão e insere os dados
 	PessoaDAO dao = new PessoaDAO();
 
	// encapsulando todo o acesso ao banco
	dao.insert(pessoa);
 
	System.out.println("Gravado!");          
            
*/

/*
	// Para atualizar os dados de uma pessoa, localize o registro e depois altere os atributos desejados
            
        PessoaDAO dao = new PessoaDAO();
       
        Pessoa dpessoa = dao.consultaCPF("5555555555");
	dpessoas.setEndereco("Novo Endereço, 00");
        
        dao.update(dpessoa);

*/      


/*
	// Para deletar uma pessoa informe o CPF ou consulte pelo CPF
            
        PessoaDAO dao = new PessoaDAO();
        
        Pessoa dpessoa = dao.consultaCPF("5555555555");
        
        dao.delete(dpessoa);

*/      

	// Para listar todo conjunto de Pessoas do Banco
  
//        List<Pessoa> pessoas = dao.getLista();
//
//        for (Pessoa pessoa : pessoas) {
//            System.out.println("Cpf: " + pessoa.getCpf());
//            System.out.println("Nome: " + pessoa.getNome());
//            System.out.println("Idade: " + pessoa.getIdade());
//            System.out.println("Endereço: " + pessoa.getEndereco());            
//        }          

/*
	// Para consultar os dados de uma pessoa através do seu CPF


	System.out.printf("Informe um CPF: "); 
        Scanner ler = new Scanner(System.in);
        strCPF = ler.nextLine(); 

        Pessoa pessoa = dao.consultaCPF("");
        System.out.println("Cpf: " + pessoa.getCpf());
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());  
*/        
        
        } catch (RuntimeException e) {
            throw new RuntimeException(e);                
        }    
    }
    
}
