package br.edu.femass.sistemabiblioteca.model;
//import br.edu.femass.sistemabiblioteca.model.Emprestimo;

import java.util.Date;

public class Usuario extends Emprestimo {
    private String prazoDevolucao;
    private Emprestimo emprestimo;

    public Usuario(String dataEmprestimo, String dataDevolucao, String prazoDevolucao) {
        super(dataEmprestimo, dataDevolucao);
        this.prazoDevolucao=prazoDevolucao;
    }

    public Usuario(Date dataEmprestimo, Date dataDevolucao, Integer quantEmprestimo) {
        super(dataEmprestimo, dataDevolucao, quantEmprestimo);
    }

    public Usuario(String dataEmprestimo, String dataDevolucao) {
        super(dataEmprestimo, dataDevolucao);
    }

    public void setPrazoDevolucao(String prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }

    public String getPrazoDevolucao() {
        return prazoDevolucao;
    }
}
