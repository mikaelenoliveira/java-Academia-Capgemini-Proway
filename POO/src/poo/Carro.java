package poo;

public class Carro {
	private String placa;
	private String marca;
	private String modelo;
	
	
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Encapsulamento
	public double calcularAutonomia(double kmPorLitro, double qtdeCombustivel ) {
		return qtdeCombustivel*kmPorLitro;
	}
	
	public void acelerar() {
		System.out.printf("Acelerando o %s" , this.modelo + "\n");
	}
	
	public String toString() {
		return "Placa:" + this.placa + "\nMarca:" + this.marca + "\nModelo:" + this.modelo + "\n";
}

	public Carro(String placa, String marca, String modelo) {
		
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Carro(String placa) {
			this.placa = placa;
	}

	public Carro() {
		
	}
}