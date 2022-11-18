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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="avaliador")
@PrimaryKeyJoinColumn(name="idUsuario")
public class Avaliador extends Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String dataNascimento;
    @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
    @JoinColumn(name = "idAvaliador")
    private List<Filho> filhos;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "produtosFavorito", 
        joinColumns = { @JoinColumn(name = "idAvaliador") }, 
        inverseJoinColumns = { @JoinColumn(name = "idProduto")})
    private List<Produto> favoritos;
    
    public Avaliador(String email, String senha, String nome, String dataNascimento) {
        super(email, senha, nome);
        this.dataNascimento = dataNascimento;
        this.filhos = new ArrayList<Filho>();
    }
    
    protected Avaliador() {}

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
