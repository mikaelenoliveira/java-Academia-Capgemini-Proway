package com.testes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	Calculadora calculadora;
	double n1 = 0;
	double n2 = 0;
	double resultadoEsperado = 0;
	double resultadoExecucao = 0;
	
	@BeforeEach
	void setup() {
		calculadora = new Calculadora();
		n1 = 10;
		n2 =20;
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da soma esta CORRETO")
	public void testarSomaComResultadoCorreto() {
		//preparação do teste
		double n1 = 10;
		double n2 =20;
		double resultadoEsperado = 30.0;
		
		//execução
		double resultadoExecução = calculadora.somar(n1, n2);
		//verificação (ASSERTION)
		assertEquals(resultadoEsperado, resultadoExecução);
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da soma esta INCORRETO")
	public void testarSomaComResultadoIncorreto() {

		double resultadoEsperado = 40;
		assertNotEquals(resultadoEsperado, calculadora.somar(n1, n2));
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da subtração esta CORRETO")
	public void testarSubtracaoComResultadoCorreto() {
		double resultadoEsperado = -10.0;
		assertEquals(resultadoEsperado, calculadora.subtrair(n1, n2));
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da subtração esta INCORRETO")
	public void testarSubtracaoComResultadoIncorreto() {
		double resultadoEsperado = 20;
		assertNotEquals(resultadoEsperado, calculadora.subtrair(n1, n2));
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da MULTIPLICAÇÃO esta CORRETO")
	public void testarMultiplicacaoComResultadoCorreto() {
		double resultadoEsperado = 200;
		assertEquals(resultadoEsperado, calculadora.multiplicar(n1, n2));
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da MULTIPLICAÇÃO esta INCORRETO")
	public void testarMultiplicacaoComResultadoIncorreto() {
		double resultadoEsperado = 100;
		assertNotEquals(resultadoEsperado, calculadora.multiplicar(n1, n2));
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da DIVISÃO ==0 esta CORRETO")
	public void lancaExceptionQuandoDivisorZero() {
		Exception exception = assertThrows(Exception.class, () -> calculadora.dividir(n1,0));
		assertEquals("Não é possivel dividir por zero", exception.getMessage());
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da DIVISÃO !=0 esta CORRETO")
	public void testarDivisaoCorretaQuandoDivisorDiferenteZero() {
		n1 = 20;
		n2 = 10;
		resultadoEsperado = 2;
		try {
			assertEquals(resultadoEsperado, calculadora.dividir(n1, n2));
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Teste p/ verificar se o resultado da DIVISÃO !=0 esta INCORRETO")
	public void testarDivisaoComResultadoIncorreto() throws Exception {
		double resultadoEsperado = 10;
		assertNotEquals(resultadoEsperado, calculadora.dividir(n1, n2));
	}
	
}
