package ex.jbcd;

import ex.jbcd.dao.DaoDog;
import ex.jbcd.entidades.Dog;
import ex.jbcd.utilidades.Conexao;

public class ExJbdc {
	public static void main(String[] args) {
		/*if (Conexao.conectar() != null) {
			System.out.println("conectado");
		} else {
			System.out.println("Erro ao conectar");
		}*/
		
		DaoDog dg = new DaoDog();

		// Cadastrar um Doguinho no banco
		/*
		 * Dog d1 = new Dog("Pitchula", "Border Colie", "5 meses"); if(dg.salvar(d1)) {
		 * System.out.println("Olá!!!\nSeu doguinho foi cadastrado com sucesso"); }
		 */

		// Consultar todos os doguinhos
		/* System.out.println(dg.consultar()); */

		// Consultar doguinho pelo ID
		/* System.out.println(dg.consultar(5)); */

		// Alterar os dados do doguinho por ID
		/*
		 * Dog dog = dg.consultar(5); System.out.println(dog); dog.setNome("Rapunzel");
		 * dog.setRaca("lhasa apso"); dog.setIdade("35 meses"); if(dg.alterar(dog)) {
		 * System.out.println("Dados do seu doguinho alterados com sucesso.");
		 * System.out.println(dog); }
		 */

		// Excluir cadastro de doguinho
		Dog dog = dg.consultar(6);
		System.out.println(dog);
		dg.excluir(6);
		System.out.println("OOOHH NÃOOO!!! Dados do doguinho excluido com sucesso.");
		dog = dg.consultar(6);
		System.out.println(dog);
	}
}
