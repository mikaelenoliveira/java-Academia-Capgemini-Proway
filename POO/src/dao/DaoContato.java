package dao;

import java.util.List;
import java.util.ArrayList;

public class DaoContato {
	private List<Contato> lista = new ArrayList<>();
	
	public List<Contato> consultaTodos(){
		//escrever rotina para consultar do banco de dados e acrescentar na lista
		return lista;
		}

	public boolean salvar(Contato ct) {
		lista.add(ct);
		return true;
	}
	
}
