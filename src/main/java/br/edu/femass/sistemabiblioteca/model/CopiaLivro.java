package br.edu.femass.sistemabiblioteca.model;

public class CopiaLivro {
    private Integer codigo;
    public static Integer nextCodigo = 1;

    public CopiaLivro() {
        codigo = nextCodigo;
        nextCodigo++;
    }

    public CopiaLivro(Integer codigo) {
        this.codigo=codigo;
    }
}
