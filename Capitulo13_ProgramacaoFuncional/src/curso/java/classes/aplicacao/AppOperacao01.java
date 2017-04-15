package curso.java.classes.aplicacao;

import curso.java.interfaces.Operacao01;

public class AppOperacao01 {

	public static void main(String[] args) {
		
		Operacao01 op1 = ( a , b) -> a* b ;	//Expressão lambda	
		
		double resultado = op1.calcular(5, 2);
		
		op1 = (x , y) -> x * y + 10;
		
		
		System.out.println(op1.calcular(3, 8));

	}

}
