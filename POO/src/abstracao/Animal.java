package abstracao;

public abstract class Animal {
		private String raca;
		private String especie;
		
		public String getRaca() {
			return raca;
		}
		public void setRaca(String raca) {
			this.raca = raca;
		}
		public String getEspecie() {
			return especie;
		}
		public void setEspecie(String especie) {
			this.especie = especie;
		}
		
		public void sleep() {
			System.out.println("oinc oinc ");
			
		}
		public abstract void sound();
	}


