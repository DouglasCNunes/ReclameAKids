package entidade;

import java.util.ArrayList;
import java.util.List;

public class Avaliador extends Usuario{
    private String dataNascimento;
    private List<Filho> filhos;
    private List<Produto> favoritos;
    
    public Avaliador(String login, String senha, String nome, String email, String dataNascimento,
            List<Produto> favoritos) {
        super(login, senha, nome, email);
        this.dataNascimento = dataNascimento;
        this.filhos = new ArrayList<Filho>();
        this.favoritos = new ArrayList<Produto>();
    }

    public boolean addFilho (Filho filho) {
        return this.filhos.add(filho);
    }

    public boolean removeFilho(Filho filho) {
        return this.filhos.remove(filho);
    } 

    public boolean addFavorito (Produto favorito) {
        return this.favoritos.add(favorito);
    }

    public boolean removeFavorito(Produto favorito) {
        return this.favoritos.remove(favorito);
    }

    // Getters and Setters
    public List<Filho> getAllFilhos () {
        return filhos;
    }

    public List<Produto> getAllFavoritos() {
        return favoritos;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
        
}
