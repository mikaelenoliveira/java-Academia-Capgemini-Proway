package poo;

public class Poo {
	public static void main(String[] args) {
		/*Carro c1 = new Carro();
		c1.placa = "abc-1234";
		c1.marca = "chevrolet";
		c1.modelo = "corsa";
		c1.acelerar();
		
		System.out.println(c1.toString());
		
		Carro c2 = new Carro();
		c2.placa = "def-3456";
		c2.marca = "Ford";
		c2.modelo = "Del Rey";
		c2.acelerar();
		
		System.out.println(c2.toString());
		
		Carro c3 = new Carro("cpt-5436");
		c3.marca = "Jeep";
		c3.acelerar();
		System.out.println(c3.toString());*/
		
		Carro c4 = new Carro("LZZ-1976", "Volks", "Fusca");
		System.out.println(c4.toString());
		c4.setPlaca("mik-1996");
		c4.setModelo("kombi");
		//c4.acelerar();
		System.out.println(c4.getPlaca() + " " + c4.getModelo());
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
