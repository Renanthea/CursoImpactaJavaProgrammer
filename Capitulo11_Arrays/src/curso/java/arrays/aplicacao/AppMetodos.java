package curso.java.arrays.aplicacao;

import curso.java.arrays.metodos.Metodos;

public class AppMetodos {

	public static void main(String[] args) {
		
		System.out.println(Metodos.calcularSoma(new double []{2,4,5,6,8}));
		System.out.println("------------------------");
		System.out.println(Metodos.buscarMaiorNome(new String [] {"Ze" , "Toni" , "Olhonete de Fatima ", "Ana"} ));
		System.out.println(Metodos.buscarMaiorNumero(2,8));
		System.out.println("------------------------");
		System.out.println(Metodos.buscarMaiorNumero(5,4,7,2,8,9,11,14));
		System.out.println("------------------------");
		System.out.println(Metodos.calcularIRPF(5400));
		System.out.println("------------------------");
		System.out.println(Metodos.buscarMaiorNumero2(15, 16,96,3,6,57));
		
	}

}
