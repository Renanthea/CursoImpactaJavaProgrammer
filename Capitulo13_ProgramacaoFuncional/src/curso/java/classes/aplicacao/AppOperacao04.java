package curso.java.classes.aplicacao;

import curso.java.interfaces.Operacao04;


public class AppOperacao04 {

	public static void main(String[] args) {
	
		
		/*
		 * public String buscar (String s) { 
		 * 
		 * 
		 	return new StringBuilder(s).reverse(.toString();
		 * } 
		 */
		
		
		Operacao04 op4 = s -> new StringBuilder(s).reverse().toString();	
		System.out.println(op4.buscar("Java Programmer"));
		
		
		/*
		 * public String buscar(String s){
		 * 	String s1 = s.toUpperCase();
		 * 	return s1.substring(2,s1.length());
		 * }
		 * 
		 */
		
		op4 = s -> { 
			
			String s1 = s.toUpperCase();
			return s1.substring(2,s1.length());
			
			
		};
		System.out.println(op4.buscar("Java Programmer"));
	}

}
