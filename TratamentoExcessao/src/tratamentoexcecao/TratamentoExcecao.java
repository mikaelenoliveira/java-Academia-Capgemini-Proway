package tratamentoexcecao;

import tratamentoexcecao.excecoes.MinhaExcecao;
import tratamentoexcecao.excecoes.MinhaExcecaocpf;

public class TratamentoExcecao {

	public static void main(String[] args) {
		try {
			testaMinhaExcecao();
		}catch(MinhaExcecao e) {
			System.out.println(e.getMessage());
		}
	}
				
		public static void testaMinhaExcecao() throws MinhaExcecao {
			int a = 10;
			int b = 0;
			if(b ==0) {
				throw new MinhaExcecao("O divisor é zero, não pode");
		}
	}
		
	/*	public static void testaMinhaExcecaocpf() {
			public String cpf = "051.211.641-57";
			throw new MinhaExcecaocpf()
		}
		*/
		
		
	
	public static void testes() {
		Venda venda = new Venda();
		venda.trataExcecao();
		testalancamentoexcecao();
		System.out.println("fim do programa");
	}
	
	private static void testalancamentoexcecao() {
		Venda venda = new Venda();
		try {
			venda.lancaExcecao();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	

}
