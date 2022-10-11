package entidade;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao extends Publicacao {
    private String imagem;
    private int notaProduto;
    private boolean publicada;
    private String titulo;
    private Produto produto;
    private List<Comentario> comentarios;
    private List<Avaliador> descurtidas;

    // Uma avalicacao nao pode ser curtida e descurtidas por um mesmo avaliador

    public Avaliacao(String imagem, int notaProduto, String titulo, Produto produto, String data, String descricao,
            Avaliador publicador) {
        super(descricao, data, publicador);
        this.imagem = imagem;
        this.notaProduto = notaProduto;
        this.titulo = titulo;
        this.produto = produto;
        this.comentarios = new ArrayList<Comentario>();
        this.descurtidas = new ArrayList<Avaliador>();
    }

    public List<Avaliador> getAllDescurtidas() {
        return descurtidas;
    }

    private boolean removeDescurtidas(Avaliador descurtida) {
        return this.descurtidas.remove(descurtida);
    }


    //Renomear e modularizar
    @Override
    public void setCurtida(Avaliador novaCurtida) {
        List<Avaliador> descurtidas = getAllDescurtidas();
        boolean isDescurtida = false;
        // verifica se o avalidor descurtiu
        for (Avaliador descurtida : descurtidas) {
            if (descurtida == novaCurtida) {
                isDescurtida = true;
            }
        }

        if (isDescurtida) {
            removeDescurtidas(novaCurtida);
        }

        List<Avaliador> curtidas = getAllCurtidas();
        boolean isCurtida = false;

        // Verifica se o avaliador curtiu
        for (Avaliador curtida : curtidas) {
            if (curtida == novaCurtida) {
                isCurtida = true;
            }
        }

        if (isCurtida) {
            removeCurtida(novaCurtida);
        } else {
            addCurtida(novaCurtida);
        }

    }
}
