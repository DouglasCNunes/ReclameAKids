package reclameakids.entidades;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="denuncia")
@PrimaryKeyJoinColumn(name="idNotificacao")
public class Denuncia extends Notificacao {
	@ManyToOne
    @JoinColumn(name = "idPublicacao", referencedColumnName = "id")
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
