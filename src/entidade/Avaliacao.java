package entidade;

import java.util.List;

public class Avaliacao extends Publicacao {
    private String image;
    private int notaProduto;
    private boolean publicada;
    private String titulo;
    private Produto produto;
    private List<Comentario> comentarios;
    private List<Avaliador> descurtidas;


    //Uma avalicacao nao pode ser curtida e descurtidas por um mesmo avaliador
}
