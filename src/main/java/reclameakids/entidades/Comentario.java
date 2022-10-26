package reclameakids.entidades;

public class Comentario  extends Publicacao{

	  public Comentario(String descricao, String data, Avaliador publicador) {
	    super(descricao, data, publicador);
	  }



	@Override
	  public void setCurtida(Avaliador avaliadorCurtida) {
	    if (isCurtida(avaliadorCurtida))
	      removeCurtida(avaliadorCurtida);
	    else 
	      addCurtida(avaliadorCurtida);
	  }

}
