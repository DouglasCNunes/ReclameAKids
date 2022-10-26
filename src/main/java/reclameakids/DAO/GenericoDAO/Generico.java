package reclameakids.DAO.GenericoDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class Generico<T> implements IGenerico<T> {

	protected static Session session;
	protected Transaction transacao;
	
	@Override
	public void inserir(T obj) {
	
		session = HibernateUtil.getSession();
		transacao = session.beginTransaction();
		session.save(obj);
		session.flush();
		transacao.commit();
		session.close();
		
	}

	@Override
	public void alterar(T obj) {
		session = HibernateUtil.getSession();
		transacao = session.beginTransaction();
		
		session.update(obj);
		
		transacao.commit();
		session.close();
		
	}

	@Override
	public void deletar(T obj) {
		session = HibernateUtil.getSession();
		transacao = session.beginTransaction();
		
		session.delete(obj);
		
		transacao.commit();
		session.close();

		
	}

	@Override
	public List<T> listar(Class clazz) {
		
		session = HibernateUtil.getSession();
		transacao = session.beginTransaction();
		
		List lista = session.createCriteria(clazz).list();
		
		transacao.commit();
		session.close();

		return lista;
	}

	@Override
	public T recuperar(Class clazz ,int id) {
		session = HibernateUtil.getSession();
		transacao = session.beginTransaction();
		
		T entidade = (T)session.get(clazz, id);
		
		transacao.commit();
		session.close();
		
		return entidade;
	}

}
