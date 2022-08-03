package interfaces;

import java.util.List;

public class Animal implements IAnimal, ICrud {

	@Override
	public void sound() {
		System.out.println("oinc oinc");
		
	}

	@Override
	public void sleep() {
		System.out.println("animal dormindo");
		
	}

	@Override
	public void sound(String x) {
		System.out.println(x);
		
	}

	@Override
	public boolean salvar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultarUm(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void apagar(int id) {
		// TODO Auto-generated method stub
		
	}

}
