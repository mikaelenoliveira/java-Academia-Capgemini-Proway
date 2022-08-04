package ex.jbcd.entidades;

public class Dog {
	private int id;
	private String nome;
	private String raca;
	private String idade;

	public Dog(String nome, String raca, String idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}

	public Dog() {

	}

	@Override
	public String toString() {
		return "\n=======" + "\nDog \nid=" + id + ", \nnome=" + nome + ", \nraca=" + raca + ", \nidade=" + idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

}
