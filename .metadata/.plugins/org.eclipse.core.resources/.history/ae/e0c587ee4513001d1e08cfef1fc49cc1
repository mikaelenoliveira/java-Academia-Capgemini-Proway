package dao;

import java.util.List;

public class Dao {
	public static void main(String[] args) {
		usaCarros();
		usaContatos();
		
	}
	static void usaContatos() {
		Contato ct1 = new Contato("Ana", "ana@gmail.com");
		Contato ct2 = new Contato("Mika", "mika@gmail.com");
		
		DaoContato dc = new DaoContato();
		
		dc.salvar(ct1);
		dc.salvar(ct2);
		listarContatos(dc.consultaTodos());

	}
	
	static void usaCarros() {
		Carro cr1 = new Carro("abc-1234", "BMW", "X1");
		Carro cr2 = new Carro("def-4567", "Toyota", "Corolla");
		DaoCarro dc = new DaoCarro();
		dc.inserir(cr1);
		dc.inserir(cr2);
		listarCarros(dc.pegaTodos());
	}
		
	
	static void listarContatos(List<Contato> lista) {
		for(Contato contato: lista) {
			System.out.printf("\nnome: %s email: %s", contato.getNome(),contato.getEmail());
			
		}
	}
	
	static void listarCarros(List<Carro> lista) {
		for(Carro carro: lista) {
			System.out.printf("\nPlaca: %s Marca: %s Modelo: %s", carro.getPlaca(), carro.getMarca(), carro.getModelo());
			
		}
	}

}
