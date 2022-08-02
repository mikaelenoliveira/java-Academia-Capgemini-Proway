package exercicios;

import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args){
		
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe seu nome: \n");
		String nome = tela.nextLine();
		System.out.printf("Voce digitou %s \n", nome);
		
		System.out.println("\n Digite sua idade: \n");
		int idade = tela.nextInt();
		String msg = "maior de idade";
		
		if(idade < 18) {
			msg = "menor de idade";
		}
		
		System.out.printf("Voce digitou %s e sua idade é %d. Você é %s", nome, idade, msg);
		tela.close();
}
}


