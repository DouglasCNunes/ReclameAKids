package reclameakids.entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	 private String nome;
	    private int idadeRecomendada;
	    private List<Avaliacao> avaliacoes;
	    private Empresa empresa;
	    private List<Categoria> categorias;

	    public Produto(String nome, int idadeRecomendada, Empresa empresa, List<Categoria> categorias) {
	        this.nome = nome;
	        this.idadeRecomendada = idadeRecomendada;
	        this.avaliacoes = new ArrayList<Avaliacao>();
	        this.empresa = empresa;
	        this.categorias = categorias;
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

	    public List<Categoria> getCategorias() {
	        return categorias;
	    }

	    public void setCategorias(List<Categoria> categorias) {
	        this.categorias = categorias;
	    }

	    public float avaliacaoMedia() {
	        float media = 0;
	        for (int i = 0; i < this.avaliacoes.size(); i++) {
	            media += this.avaliacoes.get(i).getNotaProduto();
	        }
	        media = media / this.avaliacoes.size();
	        return media;
	    }

}
