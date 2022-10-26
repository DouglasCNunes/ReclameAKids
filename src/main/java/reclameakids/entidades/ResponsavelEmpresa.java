package reclameakids.entidades;

public class ResponsavelEmpresa extends Usuario {
    private Empresa empresa;

    public ResponsavelEmpresa(String email, String senha, String nome, Empresa empresa) {
        super(email, senha, nome);
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
