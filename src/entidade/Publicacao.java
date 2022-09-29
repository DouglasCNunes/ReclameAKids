package entidade;

import java.util.List;

public class Publicacao {
    private String descricao;
    private String data;
    private List<Avaliador> curtidas;
    private Avaliador publicador;
    
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
    public List<Avaliador> getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(List<Avaliador> curtidas) {
        this.curtidas = curtidas;
    }
    public Avaliador getPublicador() {
        return publicador;
    }
    public void setPublicador(Avaliador publicador) {
        this.publicador = publicador;
    }





}
