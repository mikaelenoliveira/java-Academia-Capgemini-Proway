package daoInterfaces.copy;

import java.util.ArrayList;
import java.util.List;

public class DaoPessoa implements ICrud<Pessoa>{
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	
	@Override
	public boolean salvar(Pessoa obj) {
		pessoas.add(obj);
		
		return false;
	}

	@Override
	public boolean alterar(Pessoa obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pessoa> consultar() {
		// TODO Auto-generated method stub
		return pessoas;
	}

	@Override
	public Pessoa consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}

}
