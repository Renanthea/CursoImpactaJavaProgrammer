package curso.java.classes.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class AppConjuntos03 {

	public static void main(String[] args) {

		Set<Integer> numeros = new TreeSet<>(); //Elemento deve implementar 
												//Comparable <T>
		
		System.out.println(numeros.add(420));
		System.out.println(numeros.add(874));
		System.out.println(numeros.add(874)); // false pq já tem um elemento inserido 
		System.out.println(numeros.add(936));
		System.out.println(numeros.add(392));
		
		for (Integer numero : numeros) {
			System.out.println(numero + " : " + numero.hashCode());
		}	
		System.out.println(numeros); //Exibir elementos entre Colchetes ,
									// para uso de teste de visualização			
		

	}

}
