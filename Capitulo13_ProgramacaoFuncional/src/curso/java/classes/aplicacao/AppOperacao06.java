package curso.java.classes.aplicacao;

import curso.java.interfaces.Operacao06;

public class AppOperacao06 {

	public static void main(String[] args) {
		
		Operacao06 op6 = () -> Math.random() *100;
		
		System.out.println(op6.calcular());
		

	}

}
