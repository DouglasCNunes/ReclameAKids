package reclameakids.entidades;

import java.util.ArrayList;
import java.util.List;

public class Avaliador extends Usuario{
    private String dataNascimento;
    private List<Filho> filhos;
    private List<Produto> favoritos;
    
    public Avaliador(String email, String senha, String nome, String dataNascimento) {
        super(email, senha, nome);
        this.dataNascimento = dataNascimento;
        this.filhos = new ArrayList<Filho>();
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
