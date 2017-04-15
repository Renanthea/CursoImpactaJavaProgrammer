package curso.java.classes.aplicacao;

import curso.java.classes.metodosestaticos.Metodos;

public class AppMetodos {

	public static void main(String[] args) {
		
		
		int quant1 = Metodos.ContarDigitos("Java                    Programmer");
		
		int quant2 = Metodos.ContarDigitos("Java   Programmer");
		
		System.out.println(quant1);
		System.out.println(quant2);
		
		System.out.println(Metodos.verificarPalindromo("A base do teto desaba "));
		
		
						
	 }
					
}
