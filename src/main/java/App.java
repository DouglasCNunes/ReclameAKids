import java.util.ArrayList;
import java.util.List;

import reclameakids.DAO.AdministradorDAO;
import reclameakids.DAO.AvaliadorDAO;
import reclameakids.DAO.CategoriaDAO;
import reclameakids.DAO.ComentarioDAO;
import reclameakids.DAO.EmpresaDAO;
import reclameakids.DAO.FilhoDAO;
import reclameakids.DAO.IAdministradorDAO;
import reclameakids.DAO.IAvaliadorDAO;
import reclameakids.DAO.ICategoriaDAO;
import reclameakids.DAO.IComentarioDAO;
import reclameakids.DAO.IEmpresaDAO;
import reclameakids.DAO.IFilhoDAO;
import reclameakids.DAO.INotificacaoDAO;
import reclameakids.DAO.IProdutoDAO;
import reclameakids.DAO.IResponsavelEmpresaDAO;
import reclameakids.DAO.NotificacaoDAO;
import reclameakids.DAO.ProdutoDAO;
import reclameakids.DAO.ResponsavelEmpresaDAO;
import reclameakids.entidades.Administrador;
import reclameakids.entidades.Avaliacao;
import reclameakids.entidades.Avaliador;
import reclameakids.entidades.Categoria;
import reclameakids.entidades.Comentario;
import reclameakids.entidades.Denuncia;
import reclameakids.entidades.Empresa;
import reclameakids.entidades.Filho;
import reclameakids.entidades.Notificacao;
import reclameakids.entidades.Produto;
import reclameakids.entidades.ResponsavelEmpresa;

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
        
        
        
        
        
        //-----------------------------------COMENTARIO-----------------------------------------------
        
        //IAvaliadorDAO avaDAO = new AvaliadorDAO();
        //Avaliador ava = new Avaliador("avaliador1@email.com", "senha", "Avaliador 1", "01/01/1990");
        
        //IComentarioDAO comenDAO = new ComentarioDAO();
        //comenDAO.inserir(new Comentario("Avaliacao impropria! >:(", "18/10/2022", avaDAO.recuperar(Avaliador.class, 1)));
        
        //-----------------------------------AVALIADOR&PRODUTO---------------------------------------------------------------------------------
        
        //IEmpresaDAO empresadao = new EmpresaDAO();
        //empresadao.inserir(empresa);
        
        //IAvaliadorDAO ava = new AvaliadorDAO();
        //ava.inserir(avaliador1);
        
        //IProdutoDAO prod = new ProdutoDAO();
        //Produto produto2 = new Produto("Produto da empresa Empresa", 10, empresadao.recuperar(Empresa.class, 1), new ArrayList<Categoria>(){{ add(categoria1); }});
        //prod.inserir(produto);
        
        
        //------------------------------ADMINISTRADOR&NOTIFICACAO---------------------------------------------------------------------------------
        
        //Administrador adm = new Administrador("email", "senha", "nome");
        //IAdministradorDAO admDAO = new AdministradorDAO();
        //admDAO.inserir(adm);
        
        
        //Notificacao not = new Notificacao(admDAO.recuperar(Administrador.class, 1), "PORQUE SIM KKKKKKKKKKKK");
        //INotificacaoDAO notDAO = new NotificacaoDAO();
        //notDAO.inserir(not);
        
        //adm = admDAO.recuperar(Administrador.class, 1);
        //adm.addNotificacao(notDAO.recuperar(Notificacao.class, 1));
        
        //admDAO.alterar(adm);

        
        //System.out.println(admDAO.recuperar(Administrador.class , 1).getAllNotificacoes());
        
        
        //-------------------------------------EMPRESA&RESPONSAVELEMPRESA-----------------------------------------------------------------------------
        
        //IEmpresaDAO empresadao = new EmpresaDAO();
        //empresadao.inserir(empresa);
        //ResponsavelEmpresa re = new ResponsavelEmpresa("ablueblue@gmail.com", "senhasegura", "carloskkk", empresadao.recuperar(Empresa.class, 1));
        
       // IResponsavelEmpresaDAO reDAO = new ResponsavelEmpresaDAO();
        //reDAO.inserir(re);
        
        
        
        //-------------------------------------CATEGORIA&FILHOS-----------------------------------------------------------------------------
        
        //ICategoriaDAO categoria = new CategoriaDAO();
        
       
        //categoria.inserir(categoria1);
        
        //categoria1.setNome("aoooba");
        //categoria.alterar(categoria1);

        //IFilhoDAO filho = new FilhoDAO();
        //filho.inserir(filho1);
        
        //List<Categoria> categorias = categoria.listar(Categoria.class);
        
        //for(int i = 0; i< categorias.size(); i++)
        //{
        //	System.out.println(categorias.get(i).getNome());
        //}
        
       // Filho teste = filho.recuperar(Filho.class, 1);
        
       // System.out.println(teste.getIdade());
        
       //categoria.deletar(categoria.recuperar(Categoria.class, 1));
	
	
	}
	

}
