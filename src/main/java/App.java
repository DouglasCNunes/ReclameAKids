import java.util.ArrayList;
import java.util.List;

import reclameakids.DAO.CategoriaDAO;
import reclameakids.DAO.FilhoDAO;
import reclameakids.DAO.ICategoriaDAO;
import reclameakids.DAO.IFilhoDAO;
import reclameakids.DAO.IFilhoDAO;
import reclameakids.entidades.Avaliacao;
import reclameakids.entidades.Avaliador;
import reclameakids.entidades.Categoria;
import reclameakids.entidades.Comentario;
import reclameakids.entidades.Denuncia;
import reclameakids.entidades.Empresa;
import reclameakids.entidades.Filho;
import reclameakids.entidades.Produto;

public class App {
	public static void main(String[] args) throws Exception {
        Avaliador avaliador1 = new Avaliador("avaliador1@email.com", "senha", "Avaliador 1", "01/01/1990");
        System.out.println(avaliador1.getDataNascimento());
        Filho filho1 = new Filho(5);
        Filho filho2 = new Filho(10);
        avaliador1.addFilho(filho1);
        avaliador1.addFilho(filho2);
        avaliador1.removeFilho(filho1);
        System.out.println(avaliador1.getAllFilhos().get(0).getIdade());
        Empresa empresa = new Empresa("Empresa", false);
        Categoria categoria1 = new Categoria("Categoria1");
        Categoria categoria2 = new Categoria("Categoria2");
        Produto produto = new Produto("Produto da empresa Empresa", 10, empresa, new ArrayList<Categoria>(){{ add(categoria1); }});
        Avaliacao avaliacao = new Avaliacao("imagem", 5, "Produto muito bom", produto, "18/10/2022", "Muito bom mesmo esse produto hein", avaliador1);
        Avaliador avaliador2 = new Avaliador("avaliador2@email.com", "senha", "Avaliador 2", "01/01/1990");
        Comentario comentario = new Comentario("Avaliacao impropria! >:(", "18/10/2022", avaliador2);
        avaliacao.addComentario(comentario);
        Denuncia denuncia = new Denuncia(avaliador2, "Não gostei", avaliacao);
    
        ICategoriaDAO categoria = new CategoriaDAO();
        
       
        categoria.inserir(categoria1);
        
        categoria1.setNome("aoooba");
        categoria.alterar(categoria1);
        
        IFilhoDAO filho = new FilhoDAO();
        filho.inserir(filho1);
        
        List<Categoria> categorias = categoria.listar(Categoria.class);
        
        for(int i = 0; i< categorias.size(); i++)
        {
        	System.out.println(categorias.get(i).getNome());
        }
        
        Filho teste = filho.recuperar(Filho.class, 2);
        
        System.out.println(teste.getIdade());
        
        categoria.deletar(categoria.recuperar(Categoria.class, 1));
	}

}
