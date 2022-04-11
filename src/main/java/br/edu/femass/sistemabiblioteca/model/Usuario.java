package br.edu.femass.sistemabiblioteca.model;
//import br.edu.femass.sistemabiblioteca.model.Emprestimo;

public class Usuario extends Emprestimo {
    private String prazoDevolucao;
    private Emprestimo emprestimo;

    public Usuario(String dataEmprestimo, String dataDevolucao) {
        super(dataEmprestimo, dataDevolucao);
        this.prazoDevolucao=prazoDevolucao;
    }

    public Usuario(String dataEmprestimo, String dataDevolucao, Integer quantEmprestimo) {
        super(dataEmprestimo, dataDevolucao, quantEmprestimo);
    }

    public void setPrazoDevolucao(String prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }

    public String getPrazoDevolucao() {
        return prazoDevolucao;
    }
}
