package heranca;

public class Aves extends Animal {
	String coloracaoPenas;
	
	
	
	public String getColoracaoPenas() {
		return coloracaoPenas;
	}

	public void setColoracaoPenas(String coloracaoPenas) {
		this.coloracaoPenas = coloracaoPenas;
	}

	public void display() {
		System.out.printf("\nColoração das penas: %s \n", this.coloracaoPenas);
		
	}

	public Aves() {
		
	}

	
	public Aves(String especie, String raca, String coloracaoPenas) {
		super(especie, raca);
		this.coloracaoPenas = coloracaoPenas;
	}

	
}
