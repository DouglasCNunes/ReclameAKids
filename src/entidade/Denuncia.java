package entidade;

public class Denuncia extends Notificacao {
    private Publicacao publicacao;

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }
}