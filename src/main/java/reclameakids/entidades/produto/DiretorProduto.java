package reclameakids.entidades.produto;

import java.util.List;

import reclameakids.entidades.Categoria;
import reclameakids.entidades.Empresa;

public class DiretorProduto {

    public DiretorProduto() {
    }
    
    public Produto builder(String nome, int idadeRecomendada, Empresa empresa, List<Categoria> categorias) throws Exception {

        Produto produto = new Produto();

        BuilderProduto builderProduto = new BuilderProduto(produto);

        //Verificar se ja existe um produto com mesmo nome cadatrado
        builderProduto.adicionarNome(nome);

        //Adicionar valores ao Produto que nao precisam de checagem ou intervecoes
        builderProduto.adicionarValoresBasicos(idadeRecomendada);

        //Garantir que a regra de negocio "produto deve pertencer a uma ou mais categorias" seja cumprida
        builderProduto.adicionarCategorias(categorias);

        //Adicionar empresa pelo nome fantasia dela
        builderProduto.adicionarEmpresa(empresa);

        return produto;
    }
}
