package reclameakids.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String cnpj;
	    private String ie;
	    private String razaoSocial;
	    private String nomeFantasia;
	    @OneToOne(mappedBy = "empresa")
	    private ResponsavelEmpresa responsavelEmpresa;
	    private boolean valida;

	    public Empresa(String  nomeFantasia, boolean valida) {
	        this.nomeFantasia = nomeFantasia;
	        this.valida = valida;
	    }
	    
	    protected Empresa() {}

	 

		public String getCnpj() {
	        return cnpj;
	    }

	    public void setCnpj(String cnpj) {
	        this.cnpj = cnpj;
	    }

	    public String getIe() {
	        return ie;
	    }

	    public void setIe(String ie) {
	        this.ie = ie;
	    }

	    public String getRazaoSocial() {
	        return razaoSocial;
	    }

	    public void setRazaoSocial(String razaoSocial) {
	        this.razaoSocial = razaoSocial;
	    }

	    public String getNomeFantasia() {
	        return nomeFantasia;
	    }

	    public void setNomeFantasia(String nomeFantasia) {
	        this.nomeFantasia = nomeFantasia;
	    }

	    public ResponsavelEmpresa getResponsavelEmpresa() {
	        return responsavelEmpresa;
	    }

	    public void setResponsavelEmpresa(ResponsavelEmpresa responsavelEmpresa) {
	        this.responsavelEmpresa = responsavelEmpresa;
	    }

	    public boolean isValida() {
	        return valida;
	    }

	    public void setValida(boolean valida) {
	        this.valida = valida;
	    }

}
