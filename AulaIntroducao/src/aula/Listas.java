package aula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		//listaLinkada();
		//listaHash();
		listaHashSet();
	}
	
	static void listaHashSet() {
		HashSet<Integer> numeros = new HashSet<>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(20);
		displaylistaHashSet(numeros);
	}
	
	static void displaylistaHashSet(HashSet<Integer> lista) {
		for(Integer x : lista) {
			System.out.println(x);
		}
	}
	
	static void listaHash() {
		HashMap<String , Double> boletim = new HashMap<String, Double>();
		boletim.put("Mikaelen", 9.5);
		boletim.put("Carlos", 7.5);
		boletim.put("Antonia", 7.8);
		
		System.out.println("=======chaves=======");
		for(String key : boletim.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("=======values=======");
		for(Double media : boletim.values()) {
			System.out.println(media);
		}
		
		System.out.println("=======chaves=======");
		for(String key : boletim.keySet()) {
			System.out.printf("%s - %.2f \n", key, boletim.get(key));
		
		
	}
	
	static void listaLinkada() {
		LinkedList<String> nomes = new LinkedList<>();
		nomes.add("Mikaelen");
		if(!nomes.contains("Mikaelen"))
		nomes.add("Mikaelen");
		nomes.add("Carlos");
		nomes.addFirst("Antonia");
		displayDadosLista(nomes);
		nomes.set(1, "Juliana");
		displayDadosLista(nomes);
		nomes.add(2, "Bruna");
		displayDadosLista(nomes);

		
	}

	static void listaArray() {
		ArrayList<String> carros = new ArrayList<>();
		carros.add("Fusca");
		carros.add("Kombi");
		carros.add("Del Rey");
		carros.add("BMV");
		
		displayDadosLista(carros);
		
		carros.set(1, "Brasilia");
		displayDadosLista(carros);
		
		carros.remove(1);
		displayDadosLista(carros);
		
		List<String> frutas = new ArrayList<>();
		frutas.add("Maça");
		frutas.add("Pera");
		frutas.add("Banana");
		displayDadosLista(frutas);
		
		
	}
	static void displayDadosLista(List<String> x) {
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		
		}
		System.out.println("====================");
	}
}
