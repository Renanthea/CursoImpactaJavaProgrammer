package curso.java.classes.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppListas02 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		//incluindo nomes
		nomes.add("Josue");
		nomes.add("Cleber");
		nomes.add("Luciano");
		nomes.add("Paulo");
		nomes.add("Salvador");
		nomes.add("Anderson");
		
		//Incluindo um nome na primeira posição
		 nomes.add(0, "Renan");
		
		 //ordenando a lista de nomes 
		 
		 Collections.sort(nomes);
		 
		 //Removendo todos os nomes iniciando com J 
		 
		 nomes.removeIf(n -> n.startsWith("J"));
		 
		 
		 //Listando os nomes da lista final
		 
		 for (String nome : nomes) {
			System.out.println(nome);
			
		}
		 
		 

	}

}
