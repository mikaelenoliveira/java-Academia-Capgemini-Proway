package daoInterfaces.copy;

import java.util.ArrayList;
import java.util.List;

public class DaoCarro implements ICrud<Carro> {
	private List<Carro> carros = new ArrayList<>();

	@Override
	public boolean salvar(Carro obj) {
		carros.add(obj);
		return false;
	
	}

	@Override
	public boolean alterar(Carro obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Carro> consultar() {
		return carros;
	}

	@Override
	public Carro consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
