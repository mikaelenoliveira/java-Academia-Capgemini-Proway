package ex_poo;

public class Poo_pessoa {
	public static void main(String[] args) {
		/*Pessoa p1 = new Pessoa();
		p1.nome = "Mikaelen";
		p1.fone = "65 992820129";
		p1.email = "mika@gmail.com";
		p1.peso = 51.1;
		p1.altura = 1.58;
		p1.calcularIMC();
		System.out.println(p1.toString());*/
		
		Pessoa p2 = new Pessoa("Carlos", "65 992044390" , "carlos@gmail.com" , 89.2, 1.87);
		p2.calcularIMC();
		System.out.println(p2.toString());
		p2.setEmail("carlos.cezar@gmail.com");
		p2.setNome("Carlos Cezar");
		p2.setFone("65 36859292");
		p2.setAltura(1.80);
		p2.setPeso(80.70);
		System.out.println("======================= \n" + "\nNovo Email: " + p2.getEmail() + "\nNovo nome: " + p2.getNome() + "\nNovo telefone: " + p2.getFone() + "\nNova altura: " + p2.getAltura() + "\nNovo peso: " + p2.getPeso());
		p2.calcularIMC();
		
		/*Pessoa p3 = new Pessoa();
		p3.setEmail("Anamaria@gmail.com");
		System.out.println(p3.getEmail());*/
		
		/*Pessoa p3 = new Pessoa();
		p2.nome = "Celene";
		System.out.println(p3.toString());
		double imc */
		
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
