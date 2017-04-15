package curso.java.operadores.relacionais;

public class OperadoresRelacionais01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10 , b = 12 , c = 15;
		boolean b1 =  ( a == b ); // false 
		boolean b2 = ( a <= c ); //true
		boolean b3 = ( a >13 || b != 10 ); // true 
		boolean b4 = ( c > b && a >=10 ); //true 
		
		System.out.println(" o valor de b1 é  = "  + b1 );
		System.out.println(" o valor de b2 é  = "  + b2 );
		System.out.println(" o valor de b3 é  = "  + b3 );
		System.out.println(" o valor de b4 é  = "  + b4 );

	}

}
