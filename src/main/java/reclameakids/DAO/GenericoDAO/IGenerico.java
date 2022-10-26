package reclameakids.DAO.GenericoDAO;

import java.util.List;

public interface IGenerico<T> {
	public void inserir(T obj);
	public void alterar(T obj);
	public void deletar(T obj);
	public List<T> listar(Class clazz);
	public T recuperar(Class clazz ,int id);
}
