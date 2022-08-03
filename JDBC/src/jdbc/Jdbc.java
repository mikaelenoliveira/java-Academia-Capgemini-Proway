package jdbc;

import jdbc.dao.DaoContato;
import jdbc.entidades.Contato;
import jdbc.utilidades.Conexao;

public class Jdbc {
	public static void main(String[] args) {
		/*if(Conexao.conectar() !=null) {
			System.out.println("conectado");
		}
		else {
			System.out.println("Erro ao conectar ");
		}*/
		
		Contato c1 = new Contato("Celene", "65 992820140", "celene@gmail.com");
		DaoContato dc = new DaoContato();
		if(dc.salvar(c1)) {
			System.out.println("Contato cadastrado com sucesso");
		}
		
		Contato c2 = new Contato("Briana", "65 55559999", "briana@gmail.com");
		//DaoContato dc = new DaoContato();
		if(dc.salvar(c2)) {
			System.out.println("Contato cadastrado com sucesso");
		}
	}

}
