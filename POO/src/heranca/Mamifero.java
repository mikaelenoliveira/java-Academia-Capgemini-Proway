package heranca;

public class Mamifero extends Animal {
	private int mamas;
	
	
	
	public int getMamas() {
		return mamas;
	}


	public void setMamas(int mamas) {
		this.mamas = mamas;
	}


	public void display() {
		System.out.println("=============");
		super.display();
		System.out.printf("\nMamas: %s", this.mamas);
		System.out.println("\n=============");
	}


	public Mamifero() {
		
	}

	public Mamifero(String especie, String raca, int mamas) {
		super(especie, raca);
		this.mamas = mamas;
	}

}
