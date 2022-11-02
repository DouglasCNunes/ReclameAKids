package reclameakids.entidades.avaliacao;

import java.util.ArrayList;
import java.util.List;

import reclameakids.entidades.Avaliador;
import reclameakids.entidades.Comentario;
import reclameakids.entidades.Publicacao;
import reclameakids.entidades.produto.Produto;

public class Avaliacao extends Publicacao {
    private String imagem;
    private int notaProduto;
    private String titulo;
    private Produto produto;
    private List<Comentario> comentarios;
    private List<Avaliador> descurtidas;

    // Constructor para Avaliação caso Produto e Empresa existam
    public Avaliacao(String imagem, int notaProduto, String titulo, Produto produto, String data, String descricao, Avaliador publicador) {
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

    public Avaliacao() {
        this.comentarios = new ArrayList<Comentario>();
        this.descurtidas = new ArrayList<Avaliador>();
    }
 

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
