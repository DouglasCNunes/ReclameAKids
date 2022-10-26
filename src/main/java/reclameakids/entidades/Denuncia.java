package reclameakids.entidades;

public class Denuncia extends Notificacao {
    private Publicacao publicacao;

    public Denuncia(Usuario autor, String motivo, Publicacao publicacao) {
        super(autor, motivo);
        this.publicacao = publicacao;
    }


	public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

}
