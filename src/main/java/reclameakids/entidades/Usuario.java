package reclameakids.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String email;
	    private String senha;
	    private String nome;
	    
	    // Adicionar foto de perfil ao/se implementar interface gráfica

	    public Usuario(String email, String senha, String nome) {
	        this.email = email;
	        this.senha = senha;
	        this.nome = nome;
	    }
	    
	    protected Usuario(){
	    	
	    }
	    
	    
		public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getSenha() {
	        return senha;
	    }

	    public void setSenha(String senha) {
	        this.senha = senha;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

}
