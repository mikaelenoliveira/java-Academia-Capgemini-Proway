package daoInterfaces.copy;

import java.util.List;

public interface ICrudCarro {
	boolean salvar(Carro carro);
	boolean alterar(Carro carro);
	List<Carro> consultar();
	Carro consultar(int id);
	void excluir(int id);
	
	

}
