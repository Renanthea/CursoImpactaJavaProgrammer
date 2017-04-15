package curso.java.classes.aplicacao;

import java.util.HashMap;
import java.util.Map;

public class AppMapas01 {

	public static void main(String[] args) {
		// Lista de Nomes de Pessoas , contendo como chave o CPF
		//Object Object
		   Map<String, String> pessoas = new HashMap<>();
		   pessoas.put("37124615945: ", "José");
		   pessoas.put("45451515146: ", "Rafael");
		   pessoas.put("45451515146: ", "Fabiola");
		   pessoas.put("24659786315: ", "Roberto");
		   
		   // Exibindo na tela 
		   //Forma 1 
		   System.out.println(pessoas);
		   
		   //Forma2 : usando o foreach  cada elemento to tipo map representa um entrada no dicionario
		   for (Map.Entry<String, String> item : pessoas.entrySet()) {
			   
			   System.out.println(item.getKey() + " - " + item.getValue());
		   }
		   System.out.println();
			//Forma3: usando expressão lambda ( java 8 ) 
			 pessoas.forEach(
					(c, v) -> System.out.println(c + " - " + v ));			
		   }	
	 }
	 
