package br.edu.femass.sistemabiblioteca.dao;
import java.util.List;

public interface Dao<T> {
    public void gravar(T objeto) throws Exception;
    public List<T> listar() throws Exception;
    public void exlcuir(T objeto) throws Exception;
}
