/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class consulta {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    private String nomePaciente;
    private String cpf;

    private Date dataConsulta;
    private String Valor;
     private boolean consultaPaga;
    private boolean consultaRealizada;
    private String receitaObservacoes;

    public consulta(String nomePaciente, Date dataConsulta) {
        this.nomePaciente = nomePaciente;
        this.dataConsulta = dataConsulta;
        this.cpf = "";
        this.receitaObservacoes = "";
        this.consultaRealizada = false;
        this.consultaPaga = false;
        this.Valor = "";
    }

    public consulta() {
    }

    public int getId() {
        return id;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public void setConsultaPaga(boolean consultaPaga) {
        this.consultaPaga = consultaPaga;
    }

    public String getValor() {
        return Valor;
    }

    public boolean isConsultaPaga() {
        return consultaPaga;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

   

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public void setReceitaObservacoes(String receitaObservacoes) {
        this.receitaObservacoes = receitaObservacoes;
    }

    // Construtores, getters e setters

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getCpf() {
        return cpf;
    }


    public Date getDataConsulta() {
        return dataConsulta;
    }


    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public String getReceitaObservacoes() {
        return receitaObservacoes;
    }
}


