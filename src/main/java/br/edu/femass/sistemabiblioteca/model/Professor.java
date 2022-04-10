package br.edu.femass.sistemabiblioteca.model;
import java.util.Date;

public class Professor extends Usuario{
    private String nome;

    public Professor(String prazoDevolucao, String nome) {
        super(prazoDevolucao);
        this.nome=nome;
    }

    public String getPrazoDevolucao(Date dataEmprestimo, Date dataDevolucao) {
        return System.currentTimeMillis()-(dataDevolucao=(dataEmprestimo+30));
    }
}
