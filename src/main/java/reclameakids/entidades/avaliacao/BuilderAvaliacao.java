package reclameakids.entidades.avaliacao;

import java.util.ArrayList;
import java.util.List;

import reclameakids.entidades.Avaliador;
import reclameakids.entidades.produto.Produto;

public class BuilderAvaliacao {

    private Avaliacao avaliacao;

    public BuilderAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }


    //Adicionar valores a avaliacao que nao precisam de checagem ou intervencao    
    public boolean adicionarValoresBasicos(String imagem, String titulo, String descricao, String data, Avaliador publicador) {
        avaliacao.setImagem(imagem);
        avaliacao.setTitulo(titulo);
        avaliacao.setDescricao(descricao);
        avaliacao.setData(data);
        avaliacao.setPublicador(publicador);
        return true;
    }


    public void adicionarNotaProduto(int nota) throws Exception {
        if(nota>0 && nota<=10) {
            avaliacao.setNotaProduto(nota);
        } else {
            throw new Exception("Nota do produto deve ser entre 1 a 10.");
        }
    }


    public void verificarExisteProduto(String nomeProduto) throws Exception {
        //Listar todos os produtos da Persistencia
        List<Produto> listaProduto = new ArrayList<>();

        //Verificar se o nome do produto existe na persistencia, se sim, o produto será adicionado a avaliacao e a avalicao ao produto
        for (int i = 0; i < listaProduto.size(); i++) {
            if(listaProduto.get(i).getNome()==nomeProduto) {
                avaliacao.setProduto(listaProduto.get(i));
                listaProduto.get(i).addAvaliacao(avaliacao);
                break; //encontrou o produto, finalizar busca
            } else {
                throw new Exception("Produto não encontrado");
            }
        }
    }



}
