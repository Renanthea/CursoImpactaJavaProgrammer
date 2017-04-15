package curso.java.operadores.ternario;

public class OperadorTernario02 {

	public static void main(String[] args) {
		/*
		 * Um Ingresso é vendido por um valor que depende da idade de uma pessoa:
		 * Até 18 anos : 30,00
		 * Acima de 18 , até 59 anos : RS 40,00
		 * A partir de 60 anos : 5,00
		 * 
		 * 
		 */
		int idade = 20 ; 
		double valor = (idade <= 18 ) ?
					   30 : 
					   (idade > 59 ) ? 5 : 40;
		System.out.println("valor do ingresso é : =  " + valor);
		

	}

}
