package heranca;

public class Heranca {
	public static void main(String[] args) {
		/*Animal an1 = new Animal();
		an1.especie = "Felino";
		an1.raca = "Siamês";
		an1.display();
		System.out.println("\n=============");*/
		
		Animal an2 = new Animal("Bovino \n","Nelore");
		an2.display();
		
		Mamifero m1 = new Mamifero();
		m1.setMamas(14);
		m1.setEspecie("Suina");
		m1.setRaca("piatã");
		m1.display();
		//System.out.printf("\nEspecie: %s \nRaça: %s \nMamas: %d", m1.especie, m1.raca, m1.mamas);
		
		
		Mamifero m2 = new Mamifero("Equino \n", "Crioulo", 2);
		m2.display();
		
		
		Aves av1 = new Aves();
		av1.setColoracaoPenas("Azul e amarelo");
		av1.setEspecie("Periquito");
		av1.setRaca("Calopsita"); 
		av1.display();
		System.out.println("============");
		//System.out.printf("\nEspecie: %s \nRaça: %s \nCor das penas: %s", av1.especie, av1.raca, av1.coloracaoPenas);
		
		Aves av2 = new Aves ("Maritaca", "Papagaio", "Verde e amarelo" );
		av2.display();
	}

}
