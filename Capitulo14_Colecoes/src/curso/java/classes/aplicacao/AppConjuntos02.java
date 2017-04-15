package curso.java.classes.aplicacao;


import java.util.LinkedHashSet;
import java.util.Set;

public class AppConjuntos02 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new LinkedHashSet<>();
		System.out.println(numeros.add(123));
		System.out.println(numeros.add(874));
		System.out.println(numeros.add(874)); // false pq já tem um elemento inserido 
		System.out.println(numeros.add(936));
		System.out.println(numeros.add(392));
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}	
		System.out.println(numeros); //Exibir elementos entre Colchetes ,
									// para uso de teste de visualização					

	}

}
