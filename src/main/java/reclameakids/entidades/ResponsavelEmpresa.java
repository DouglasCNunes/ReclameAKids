package reclameakids.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="responsavelEmpresa")
@PrimaryKeyJoinColumn(name="idUsuario")
public class ResponsavelEmpresa extends Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
    @JoinColumn(name = "idEmpresa", referencedColumnName = "id")
    private Empresa empresa;

    public ResponsavelEmpresa(String email, String senha, String nome, Empresa empresa) {
        super(email, senha, nome);
        this.empresa = empresa;
    }
    
    protected ResponsavelEmpresa()
    {}

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
