package br.edu.femass.sistemabiblioteca.model;
import java.util.Date;
import java.lang.Integer;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Emprestimo {
    private String dataEmprestimo;
    public String dataDevolucao;
    private Integer quantEmprestimo;

    public Emprestimo(String dataEmprestimo, String dataDevolucao, Integer quantEmprestimo) {
        this.dataEmprestimo=dataEmprestimo;
        this.dataDevolucao=dataDevolucao;
        this.quantEmprestimo=quantEmprestimo;
    }

    public Emprestimo(String dataEmprestimo, String dataDevolucao) {
        this.dataEmprestimo=dataEmprestimo;
        this.dataDevolucao=dataDevolucao;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
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

    /*public CharSequence DateFormat() {
        if(dataDevolucao!= null) {
            Date dataDevolucao = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String dataFormatada = dateFormat.format(dataDevolucao);
            return (dataFormatada);
        }
        if(dataEmprestimo!= null) {
            Date dataEmprestimo = new Date();
            DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String dataFormatada1 = dateFormat1.format(dataEmprestimo);
            return (dataFormatada1);
        }
    }*/
}
