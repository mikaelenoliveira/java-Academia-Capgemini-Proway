package daoInterfaces.copy;

import java.util.List;
import java.util.ArrayList;

public class DaoContato implements ICrud<Contato>{
	private List<Contato> contatos = new ArrayList<>();


	@Override
	public boolean salvar(Contato obj) {
		contatos.add(obj);
		return false;
	}

	@Override
	public boolean alterar(Contato obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contato> consultar() {
		return contatos;
	}

	@Override
	public Contato consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}
}
	

