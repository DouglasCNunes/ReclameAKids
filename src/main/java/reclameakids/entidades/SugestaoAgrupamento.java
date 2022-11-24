package reclameakids.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="sugestaoagrupamento")
@PrimaryKeyJoinColumn(name="idNotificacao")
public class SugestaoAgrupamento extends Notificacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 @ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "produtosSugestaoagrupamento", 
	        joinColumns = { @JoinColumn(name = "idSugestaoagrupamento") }, 
	        inverseJoinColumns = { @JoinColumn(name = "idProduto")})
    private List<Produto> produtos;

    public SugestaoAgrupamento(ResponsavelEmpresa autor, String motivo) {
        super(autor, motivo);
        this.produtos = new ArrayList<Produto>();
    }
    
    protected SugestaoAgrupamento() {};

    public List<Produto> getProdutos() {
        return produtos;
    }

    public boolean addProduto(Produto produto) {
        return this.produtos.add(produto);
    }

    public boolean removeProduto(Produto produto) {
        return this.removeProduto(produto);
    }

}
