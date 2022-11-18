package reclameakids.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity	
@Table(name = "comentario")
@PrimaryKeyJoinColumn(name="idPublicacao")
public class Comentario  extends Publicacao{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	
	  public Comentario(String descricao, String data, Avaliador publicador) {
	    super(descricao, data, publicador);
	  }
	  
	  	protected Comentario() {
			
		} 


	@Override
	  public void setCurtida(Avaliador avaliadorCurtida) {
	    if (isCurtida(avaliadorCurtida))
	      removeCurtida(avaliadorCurtida);
	    else 
	      addCurtida(avaliadorCurtida);
	  }

}
