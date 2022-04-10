package br.edu.femass.sistemabiblioteca.model;
import java.util.Date;
import java.lang.Integer;

public class Emprestimo {
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Integer quantEmprestimo;

    public Emprestimo(Date dataEmprestimo, Date dataDevolucao, Integer quantEmprestimo) {
        this.dataEmprestimo=dataEmprestimo;
        this.dataDevolucao=dataDevolucao;
        this.quantEmprestimo=quantEmprestimo;
    }

    public Emprestimo(Date dataEmprestimo, Date dataDevolucao) {
        this.dataEmprestimo=dataEmprestimo;
        this.dataDevolucao=dataDevolucao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Integer getQuantEmprestimo() {
        if(quantEmprestimo<5)
        {
            return this.quantEmprestimo=quantEmprestimo;
        }
    }

    public void setQuantEmprestimo(Integer quantEmprestimo) {
        this.quantEmprestimo = quantEmprestimo;
    }
}
