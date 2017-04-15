package curso.java.classes.aplicacao;

import curso.java.arrays.metodos.Metodos;
import curso.java.interfaces.AcessoMetodoEstatico;

public class AppAcessoMetodoEstatico {

	public static void main(String[] args) {
		
		
		AcessoMetodoEstatico acesso = Metodos:: calcularIRPF ;		
		double imposto = acesso.calcular(4500);
		System.out.println(imposto);
				
		

	}

}
