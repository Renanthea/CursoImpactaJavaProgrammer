package curso.java.classes.aplicacao;

import curso.java.interfaces.Operacao02;

public class AppOperacao02 {

	public static void main(String[] args) {
		
		Operacao02 op2 = s -> s.replace(" ", "").length(); 
		
		System.out.println(op2.verificar("Interface Funcional deve ter 1 método"));
	}

}
