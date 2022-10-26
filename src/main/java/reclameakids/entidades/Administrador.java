package reclameakids.entidades;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    private List<Notificacao> notificacoes;

    public Administrador(String email, String senha, String nome) {
        super(email, senha, nome);
        this.notificacoes = new ArrayList<Notificacao>();
    }

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
