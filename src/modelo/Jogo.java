
package modelo;

import modelo.Genero;
import java.sql.Date;

/**
 *
 * @author Alan Quadros
 */
public class Jogo {
    private long idJogo;
    private String nomeJogo;
    private double metacritica;
    private String esrb;
    private String descricao;
    private int maxPlayers;
    private String personagem;
    private Date dataLancamento;
    private Genero genero;
    private Plataforma plataforma;
    private Produtora produtora;

    public Jogo() {
    }

    public long getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(long idJogo) {
        this.idJogo = idJogo;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public double getMetacritica() {
        return metacritica;
    }

    public void setMetacritica(double metacritica) {
        this.metacritica = metacritica;
    }

    public String getEsrb() {
        return esrb;
    }

    public void setEsrb(String esrb) {
        this.esrb = esrb;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Produtora getProdutora() {
        return produtora;
    }

    public void setProdutora(Produtora produtora) {
        this.produtora = produtora;
    }

    @Override
    public String toString() {
        return "Código do jogo: "+idJogo
                +"\nNome: "+nomeJogo
                +"\nMetacrítica: "+metacritica
                +"\nESRB: "+esrb
                +"\nDescrição: "+descricao
                +"\nMáx. de jogadores: "+maxPlayers
                +"\nPersonagem principal: "+personagem
                +"\nData de lançamento: "+dataLancamento
                +"\n"+genero
                +"\n"+plataforma
                +"\n"+produtora;
    }
}
