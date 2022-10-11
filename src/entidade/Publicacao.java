package entidade;

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

    public abstract void setCurtida(Avaliador curtida);

    protected boolean addCurtida(Avaliador curtida) {
        return this.curtidas.add(curtida);
    }

    protected boolean removeCurtida(Avaliador curtida) {
        return this.curtidas.remove(curtida);
    }

    public Avaliador getPublicador() {
        return publicador;
    }

    public void setPublicador(Avaliador publicador) {
        this.publicador = publicador;
    }

}
