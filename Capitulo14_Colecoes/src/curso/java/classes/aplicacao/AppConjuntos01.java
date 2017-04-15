package curso.java.classes.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppConjuntos01 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>(); //Estrutura de Dados: 
												//Complexidade de Algoritmos o(2) 
		numeros.add(123);
		numeros.add(874);
		numeros.add(874);
		numeros.add(936);
		numeros.add(392);
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}		

	}

}
