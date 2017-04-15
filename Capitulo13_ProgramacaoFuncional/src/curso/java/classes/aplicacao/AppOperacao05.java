package curso.java.classes.aplicacao;

import curso.java.interfaces.Operacao05;

public class AppOperacao05 {

	public static void main(String[] args) {
		
		Operacao05 op5 = s -> System.out.println(s.toUpperCase());
		
		op5.exibir("Método exibir() , interface Operacao05");
		
	}

}
