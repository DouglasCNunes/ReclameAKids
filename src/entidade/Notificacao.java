package entidade;

public abstract class Notificacao {
    private Usuario autor;
    private String motivo;
    
    public Usuario getAutor() {
        return autor;
    }
    public abstract void setAutor(Usuario autor);

    
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }   


}
