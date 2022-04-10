package br.edu.femass.sistemabiblioteca.dao;
import br.edu.femass.sistemabiblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroDao implements Dao<Livro> {
    private static List<Livro> livros = new ArrayList<Livro>();

    @Override
    public void gravar(Livro objeto) throws Exception {
        livros.add(objeto);
    }

    @Override
    public List<Livro> listar() throws Exception {
        return livros;
    }

    @Override
    public void exlcuir(Livro objeto) throws Exception {
        livros.remove(objeto);
    }
}
