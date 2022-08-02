package aula;

public class EntendendoArrays {
	public static void main(String[] args) {
		String[] cars = {"Fusca","Brasilia","Kombi", "Corcel", "Del rey"};
		
		//cars[4] = "Variant";
		
		System.out.println(cars[4]);
		System.out.println("====Forma indexada====");
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("====Forma não indexada====");
		for(String x : cars) {
			System.out.println(x);
		}
		
		System.out.println(cars.length);
		
	}

}
