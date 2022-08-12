package tratamentoexcecao;

public class Venda {
	
	public void trataExcecao() {
		Calculadora calculadora = new Calculadora();
		
		try {
			calculadora.dividir(10,0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void lancaExcecao() throws Exception{
		Calculadora calculadora = new Calculadora();
		calculadora.dividir(30,2);
	}

}
