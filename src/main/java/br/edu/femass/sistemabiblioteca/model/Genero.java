package br.edu.femass.sistemabiblioteca.model;

public enum Genero {
    terror("Terror"),
    romance("Romance"),
    educativo("Educativo"),
    acao("Ação"),
    comedia("Comédia"),
    drama("Drama");

    private String nome;

    Genero(String nome) {
        this.nome = nome;
    }
}
