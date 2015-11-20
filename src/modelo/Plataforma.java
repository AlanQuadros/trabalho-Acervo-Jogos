/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Alan Quadros
 */
public class Plataforma {
    private long idPlataforma;
    private String nomePlataforma;
    private String tipoPlataforma;
    private String fabricante;
    private Date dataLancamento;

    public Plataforma() {
    }

    public long getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(long idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getNomePlataforma() {
        return nomePlataforma;
    }

    public void setNomePlataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
    }

    public String getTipoPlataforma() {
        return tipoPlataforma;
    }

    public void setTipoPlataforma(String tipoPlataforma) {
        this.tipoPlataforma = tipoPlataforma;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Código Plataforma: "+idPlataforma
                +"\nNome: "+nomePlataforma
                +"\nTipo: "+tipoPlataforma
                +"\nFabricante: "+fabricante
                +"\nData de lançamento: "+dataLancamento;
    }
}
