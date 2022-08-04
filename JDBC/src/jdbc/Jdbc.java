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
		
		DaoContato dc = new DaoContato();
		/*Contato c1 = new Contato("Celene", "65 992820140", "celene@gmail.com");
		if(dc.salvar(c1)) {
			System.out.println("Contato cadastrado com sucesso");
		}
		
		/*Contato c2 = new Contato("Briana", "65 55559999", "briana@gmail.com");
		//DaoContato dc = new DaoContato();
		if(dc.salvar(c2)) {
			System.out.println("Contato cadastrado com sucesso");
		}*/
		
		//Consultar todos os ids
		//System.out.println(dc.consultar()); 
		
		//Consultar por um ID
		//System.out.println(dc.consultar(4));
		
		//alterar um contato por ID
		/*Contato contato = dc.consultar(4);
		System.out.println(contato);
		contato.setNome("Raissa");
		contato.setFone("65 994506568");
		contato.setEmail("raissa@gmail.com");
		if(dc.alterar(contato)) {
			System.out.println("Contato alterado com sucesso");
			System.out.println(contato);
			
		}*/
		
		//excluir um contato por ID
		Contato contato = dc.consultar(5);
		System.out.println(contato);
		dc.excluir(5);
		contato = dc.consultar(5);
		System.out.println(contato);
				
	}

}
