package entidade;

import java.util.ArrayList;
import java.util.List;

public class SugestaoAgrupamento extends Notificacao {
    private List<Produto> produtos;

    public SugestaoAgrupamento(ResponsavelEmpresa autor, String motivo) {
        super(autor, motivo);
        this.produtos = new ArrayList<Produto>();
    }

    @Override
    public void setAutor(Usuario autor) {
        // TODO Auto-generated method stub
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public boolean isProduto(Produto novoProduto) {
        boolean isProduto = false;
        for (Produto produto : produtos) {
            if (produto == novoProduto){
                isProduto = true;
            }
        }

        return isProduto;
    }

    public void addProduto(Produto produto) {
        if (!isProduto(produto)) {
            this.addProduto(produto);
        } 
    }
}
