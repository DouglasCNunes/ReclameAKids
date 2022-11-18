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
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="administrador")
@PrimaryKeyJoinColumn(name="idUsuario")
public class Administrador extends Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToMany()
    @JoinColumn(name = "idAdministrador")
    private List<Notificacao> notificacoes = new ArrayList<Notificacao>();

    public Administrador(String email, String senha, String nome) {
        super(email, senha, nome);
    }

    
    protected Administrador()
    {}
    
    // constructor passando usuário

    public List<Notificacao> getAllNotificacoes() {
        return notificacoes;
    }

    public void addNotificacao(Notificacao notificacao) {
        this.notificacoes.add(notificacao);
    }

    public boolean removeNotificacoes(Notificacao notificacao) {
        return this.notificacoes.remove(notificacao);
    }

}
