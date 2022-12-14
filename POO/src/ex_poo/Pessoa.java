package ex_poo;

public class Pessoa {
	private String nome;
	private String fone;
	private String email;
	private double peso;
	private double altura;
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFone() {
		return fone;
	}


	public void setFone(String fone) {
		if(fone.length() != 11)
			System.out.println("Formato invalido");
		else
			this.fone = fone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if(email.contains("@"))	
			this.email = email;
		else
			System.out.println("Formato de e-mail incorreto");
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public void calcularIMC() {
		double imc = this.peso/(this.altura*this.altura);
		System.out.printf("\nO IMC é %.2f \n", imc );
	}
	
	
	@Override
	public String toString() {
		return "nome: " + nome + ", \nfone: " + fone + ", \nemail: " + email + ", \npeso: " + peso + ", \naltura: " + altura
			;
	}
	public Pessoa(String nome, String fone, String email, Double peso, Double altura) {
		
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.peso = peso;
		this.altura = altura;
	}
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

}
