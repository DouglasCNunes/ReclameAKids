package entidade;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int idadeRecomendada;
    private List<Avaliacao> avaliacoes;
    private Empresa empresa;
    private Categoria categoria;

    

    public Produto(String nome, int idadeRecomendada,Empresa empresa,
            Categoria categoria) {
        this.nome = nome;
        this.idadeRecomendada = idadeRecomendada;
        this.avaliacoes = new ArrayList<Avaliacao>();
        this.empresa = empresa;
        this.categoria = categoria;
    }

    public List<Avaliacao> getAllAvaliacoes() {
        return avaliacoes;
    }

    public boolean addAvaliacao(Avaliacao avaliacao) {
        return this.avaliacoes.add(avaliacao);
    }

    public boolean removeAvalicao(Avaliacao avaliacao) {
        return this.avaliacoes.remove(avaliacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeRecomendada() {
        return idadeRecomendada;
    }

    public void setIdadeRecomendada(int idadeRecomendada) {
        this.idadeRecomendada = idadeRecomendada;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
