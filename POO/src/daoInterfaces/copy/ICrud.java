package daoInterfaces.copy;

import java.util.List;

public interface ICrud<T> {
	boolean salvar(T obj);
	boolean alterar(T obj);
	List<T> consultar();
	T consultar(int id);
	void excluir(int id);
	
	
}
