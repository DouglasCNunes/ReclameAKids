package reclameakids.entidades;

import java.util.ArrayList;
import java.util.List;

public class SugestaoAgrupamento extends Notificacao {
    private List<Produto> produtos;

    public SugestaoAgrupamento(ResponsavelEmpresa autor, String motivo) {
        super(autor, motivo);
        this.produtos = new ArrayList<Produto>();
    }

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
