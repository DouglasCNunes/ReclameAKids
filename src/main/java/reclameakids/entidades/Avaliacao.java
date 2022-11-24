package reclameakids.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="avaliacao")
@PrimaryKeyJoinColumn(name="idPublicacao")
public class Avaliacao extends Publicacao {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String imagem;
    private int notaProduto;
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "id")
    private Produto produto;
    @OneToMany()
    @JoinColumn(name = "idAvaliacao")
    private List<Comentario> comentarios;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "avaliacoesdescurtida", 
        joinColumns = { @JoinColumn(name = "idAvaliacao") }, 
        inverseJoinColumns = { @JoinColumn(name = "idAvaliador")})
    private List<Avaliador> descurtidas;

    // Constructor para Avaliação caso Produto e Empresa existam
    public Avaliacao(String imagem, int notaProduto, String titulo, Produto produto, String data, String descricao,
            Avaliador publicador) {
        super(descricao, data, publicador);
        this.imagem = imagem;
        this.notaProduto = notaProduto;
        this.titulo = titulo;
        this.produto = produto;
        this.comentarios = new ArrayList<Comentario>();
        this.descurtidas = new ArrayList<Avaliador>();
        // setando avalição no produto
        produto.addAvaliacao(this);
    }

    // Constructor para avaliação caso produto não exista e empresa exista

    // Constructor para avaliação caso produto e empresa não existam

   
    protected Avaliacao() {}
    
    
	public List<Avaliador> getAllDescurtidas() {
        return descurtidas;
    }

    private boolean removeDescurtidas(Avaliador descurtida) {
        return this.descurtidas.remove(descurtida);
    }

    private boolean isDescurtida(Avaliador avalidorDescurtida) {
        List<Avaliador> descurtidas = getAllDescurtidas();
        boolean isDescurtida = false;
        // verifica se o avalidor descurtiu
        for (Avaliador descurtida : descurtidas) {
            if (descurtida == avalidorDescurtida) {
                isDescurtida = true;
            }
        }
        return isDescurtida;
    }

    // Renomear e modularizar
    @Override
    public void setCurtida(Avaliador avalidorCurtida) {
        if (isDescurtida(avalidorCurtida)) {
            removeDescurtidas(avalidorCurtida);
        }

        if (isCurtida(avalidorCurtida)) {
            removeCurtida(avalidorCurtida);
        } else {
            addCurtida(avalidorCurtida);
        }
    }

    public boolean addComentario(Comentario comentario) {
        return this.comentarios.add(comentario);
    }

    public boolean removeComentario(Comentario comentario) {
        return this.comentarios.remove(comentario);
    }
    
    // Getters and Setters
    public String getImagem() {
        return imagem;
    }

    public int getNotaProduto() {
        return notaProduto;
    }


    public String getTitulo() {
        return titulo;
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Comentario> getAllComentarios() {
        return comentarios;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setNotaProduto(int notaProduto) {
        this.notaProduto = notaProduto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


}
