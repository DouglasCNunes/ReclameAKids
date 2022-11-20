package reclameakids.entidades.produto;

import java.util.ArrayList;
import java.util.List;

import reclameakids.entidades.Categoria;
import reclameakids.entidades.Empresa;

public class BuilderProduto {
    private Produto produto;

    public BuilderProduto(Produto produto) {
        this.produto = produto;
    }
    

    public void adicionarValoresBasicos(int idadeRecomendada) {
        produto.setIdadeRecomendada(idadeRecomendada);
    }


    public void adicionarNome(String nome) throws Exception {
        //Listar todos os produtos da Persistencia
        List<Produto> listaProduto = new ArrayList<>();  //Adicionar valores da persistencia em listaProduto

        for (int i = 0; i < listaProduto.size(); i++) {
            if(listaProduto.get(i).getNome()==nome) {
                throw new Exception("Produto já cadastrado");
            }
        }
    }


    public void adicionarCategorias(List<Categoria> categorias) throws Exception {
        if(!categorias.isEmpty()) {
            produto.setCategorias(categorias);
        } else {
            throw new Exception("Lista de Categorias vazia");
        }
    }


    public void adicionarEmpresa(Empresa empresa) throws Exception  {
        //Listar todos os produtos da Persistencia
        List<Empresa> listaEmpresa = new ArrayList<>(); //Adicionar valores da persistencia em listaEmpresa

        //Verificar se a empresa (nome fantasia) existe na persistencia, se sim, ela será adicionada
        for (int i = 0; i < listaEmpresa.size(); i++) {
            if(listaEmpresa.get(i).getNomeFantasia()==empresa.getNomeFantasia()) {
                produto.setEmpresa(listaEmpresa.get(i));
                break; //encontrou o produto, finalizar busca
            } else {
                throw new Exception("Empresa não encontrado");
            }    
        }
    }
}
