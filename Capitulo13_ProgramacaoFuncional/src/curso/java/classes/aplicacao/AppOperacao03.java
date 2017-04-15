package curso.java.classes.aplicacao;

import curso.java.interfaces.Operacao03;

public class AppOperacao03 {

	public static void main(String[] args) {
		
		/*
		 * public String veriricar(int n )
		 * return "Curso Java".substring(n);
		 */
		
		Operacao03 op3 = n -> "Java" .substring(n);
		
		System.out.println(op3.verificar(2));		
		
	}
}


	/*
	public String veriricar(int n ){


	return (n>18) ? "Maior de Idade" : "Menor de Idade"
	
	
	}
	
	*/


