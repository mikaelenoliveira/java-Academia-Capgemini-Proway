package exercicios;

import java.util.Scanner;

public class Ex02 {
public static void main (String[] args){
	
	String continuar = "S";
	while (continuar.equalsIgnoreCase("S")) {
		System.out.print("\n Informe nome: ");
		String nome = new Scanner(System.in).nextLine();
		
		System.out.print("\n Informe a idade: ");
		int idade = new Scanner(System.in).nextInt();
		
		String msg = "maior de idade";
		
		if(idade < 18) {
			msg = "menor de idade";
		}
		
		System.out.printf("Voce digitou %s e sua idade é %d. Você é %s", nome, idade, msg);
				
		System.out.print("\n Deseja informar outro nome? Digite S para sim. \n");
		continuar = new Scanner(System.in).next();
		
	}
	System.out.println("Fim do programa");
	
		
}
}