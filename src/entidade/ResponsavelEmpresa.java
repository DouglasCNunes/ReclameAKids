package entidade;

public class ResponsavelEmpresa extends Usuario {
    private Empresa empresa;

    public ResponsavelEmpresa(String login, String senha, String nome, String email, Empresa empresa) {
        super(login, senha, nome, email);
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}
