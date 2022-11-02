package reclameakids.entidades.avaliacao;

import reclameakids.entidades.Avaliador;
import reclameakids.entidades.produto.Produto;

public class DiretorAvaliacao {

    public DiretorAvaliacao() {
    }
    
    public Avaliacao builder(String imagem, int notaProduto, String titulo, String nomeProduto, String data, String descricao, Avaliador publicador) throws Exception {
        //Objeto a ser contruido
        Avaliacao avaliacao = new Avaliacao();

        BuilderAvaliacao builderavaliacao = new BuilderAvaliacao(avaliacao);


        //   << Sequencia de metodos para criar "Avalicacao"

        //Adicionar valores que nao necessitam de checagem ou intervencao
        builderavaliacao.adicionarValoresBasicos(imagem, titulo, descricao, data, publicador);

        //Verificar nota do Produto
        builderavaliacao.adicionarNotaProduto(notaProduto);

        //Verificar se existe o produto;
        builderavaliacao.verificarExisteProduto(nomeProduto);


        return avaliacao;
    }
}
