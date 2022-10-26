package reclameakids.entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Publicacao {
	private String descricao;
    private String data;
    private List<Avaliador> curtidas;
    private Avaliador publicador;

    public Publicacao(String descricao, String data, Avaliador publicador) {
        this.descricao = descricao;
        this.data = data;
        this.publicador = publicador;
        this.curtidas = new ArrayList<>();
    }

    

	public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Avaliador> getAllCurtidas() {
        return curtidas;
    }

    public abstract void setCurtida(Avaliador avaliadorCurtida);

    protected boolean addCurtida(Avaliador avaliadorCurtida) {
        return this.curtidas.add(avaliadorCurtida);
    }

    protected boolean removeCurtida(Avaliador avaliadorCurtida) {
        return this.curtidas.remove(avaliadorCurtida);
    }

    public Avaliador getPublicador() {
        return publicador;
    }

    public void setPublicador(Avaliador publicador) {
        this.publicador = publicador;
    }

    protected boolean isCurtida(Avaliador avaliadorCurtida) { // Determina se o avaliador logado curtiu a publicação
        List<Avaliador> curtidas = getAllCurtidas();
        boolean isCurtida = false;

        // Verifica se o avaliador curtiu
        for (Avaliador curtida : curtidas) {
            if (curtida == avaliadorCurtida) {
                isCurtida = true;
            }
        }

        return isCurtida;
    }


}
