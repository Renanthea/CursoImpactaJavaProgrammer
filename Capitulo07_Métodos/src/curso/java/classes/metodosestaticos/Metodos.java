package curso.java.classes.metodosestaticos;

public class Metodos {
	
	public static String exibirAutoria(String nome){
		
		return "Aplicacção Desenvolvida por : " + nome ; 			
		
	}
	
	//metodo que recebe um texto como parametro e retorna
	// a quantidade de caracteres válidos..
	
public static int ContarDigitos (String texto){
	
	int quantidade = texto.replace(" ", "").length();
	return quantidade;		
		
		
	}


	//metodo que recebe como parametro um texto e retorna true , se este
	//representar um palindromo , e false , caso contrario 


public static boolean verificarPalindromo(String texto){
	StringBuilder sb = new StringBuilder();
	
	String origem = 
			texto.replace(" " , "")
			.toLowerCase();
	
	
	
			
	String destino = 
			sb.append(texto)
			.reverse()
			.toString()
			.replace(" ", "")
			.toLowerCase();
	
	 return origem.equals(destino);
				
      }
	
	
}
