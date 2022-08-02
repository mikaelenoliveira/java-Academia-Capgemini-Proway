package heranca;

public class Animal {
	private String especie;
	private String raca;
	
	
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void display() {
		System.out.printf("Raça: %s \nEspecie: %s", this.raca, this.especie);
	}

	public Animal(String especie, String raca) {
		this.raca = raca;
		this.especie = especie;
	}

	public Animal() {
		
	}
	
}