package entidade;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    private List<Notificacao> notificacoes;

    public Administrador(String login, String senha, String nome, String email) {
        super(login, senha, nome, email);
        this.notificacoes = new ArrayList<Notificacao>();
    }

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
