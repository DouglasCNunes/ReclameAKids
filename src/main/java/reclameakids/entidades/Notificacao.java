package reclameakids.entidades;

public class Notificacao {
	 	private Usuario autor;
	    private String motivo;
	    private boolean resolvida;
	    
	    public Notificacao(Usuario autor, String motivo) {
	        this.autor = autor;
	        this.motivo = motivo;
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
