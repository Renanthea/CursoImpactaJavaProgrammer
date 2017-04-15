package curso.java.variaveis.inteiros;

public class VariaveisInteiras02 {

	public static void main(String[] args) {
		
		byte b1 = 100;
		byte b2 = 30;
		
		//Typ
		//int soma =  b1 + b2 ; 
		//System.out.println(" A soma de b1 + b2 é = " +  soma);
		
		byte soma = (byte) (b1+ b2); // Type Cast adaptação de um int para um byte ,  Sistema Embarcado 
		 
		
		
		
		
		
		System.out.println(" O valor de  b1 é   =  " + b1 );
		System.out.println(" O valor de  b2 é   =  " + b1 );
		System.out.println(" O valor da soma é  = " + soma );


	}

}
