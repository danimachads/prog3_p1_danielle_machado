package br.edu.femass.sistemabiblioteca.model;

public class Livro {

    private String titulo;
    private Integer ano;
    private Integer edicao;
    private Genero genero;

    public Livro(String titulo, Integer ano, Integer edicao) {
        this.titulo=titulo;
        this.ano=ano;
        this.edicao=edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    //public void setTitulo(String titulo) {
    //    this.titulo = titulo;
    //}

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
