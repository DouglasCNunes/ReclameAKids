package reclameakids.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	 	private String nome;
	    private int idadeRecomendada;
	    @OneToMany(mappedBy = "produto", cascade = { CascadeType.PERSIST })
	    private List<Avaliacao> avaliacoes;
	    @ManyToOne(cascade = { CascadeType.PERSIST })
	    @JoinColumn(name="idEmpresa")
	    private Empresa empresa;
	    @ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "produtosCategoria", 
	        joinColumns = { @JoinColumn(name = "idProduto") }, 
	        inverseJoinColumns = { @JoinColumn(name = "idCategoria")})
	    private List<Categoria> categorias;

	    public Produto(String nome, int idadeRecomendada, Empresa empresa, List<Categoria> categorias) {
	        this.nome = nome;
	        this.idadeRecomendada = idadeRecomendada;
	        this.avaliacoes = new ArrayList<Avaliacao>();
	        this.empresa = empresa;
	        this.categorias = categorias;
	    }
	    
	    protected Produto() {}
	   

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
