package com.testes;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayTest {
	String[] frutas = {"Maça", "Banana", "Pera"};
	
	@Test
	@DisplayName("Verfica se array tem 3 elementos")
	public void teste1() {
		assertTrue(frutas.length == 3);
		
	}
	
	@Test
	@DisplayName("Verfica se array tem a palavra Maça")
	public void teste2() {
		System.out.println(frutas.toString().contains("Maça"));
		assertTrue(verificaSeFrutaeEstaNoVetor("Maça"));
		
	}
	
	public boolean verificaSeFrutaeEstaNoVetor(String fruta) {
		for(String s : frutas) {
			if(s.equals(fruta))
				return true;
		}
		return false;
	}
}
