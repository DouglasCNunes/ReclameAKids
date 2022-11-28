package reclameakids.entidades;

import reclameakids.aplicacao.Observavel;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notificacao")
@Inheritance(strategy = InheritanceType.JOINED)
public class Notificacao extends Observavel{
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@ManyToOne
	    @JoinColumn(name = "idUsuario", referencedColumnName = "id")
	 	private Usuario autor;
	    private String motivo;
	    private boolean resolvida;
	    
	    public Notificacao(Usuario autor, String motivo, List<Administrador> responsaveis) {
	        this.autor = autor;
	        this.motivo = motivo;
			for(Administrador ob : responsaveis) {
				this.addObservador(ob);
			}
			this.notificarObservadores();
	    }
	    
	    protected Notificacao() {
	    	
	    }

	   

		public Usuario getAutor() {
	        return autor;
	    }

	    public void setAutor(Usuario autor) {
	        this.autor = autor;
	    }
	    
	    public String getMotivo() {
	        return motivo;
	    }

	    public void setMotivo(String motivo) {
	        this.motivo = motivo;
	    }

	    public boolean isResolvida() {
	        return resolvida;
	    }

	    public void setResolvida(boolean resolvida) {
	        this.resolvida = resolvida;
			
	    }

}
