package curso.java.operadores.relacionais;

public class OperadoresRelacionais02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10 , b = 12 , c = 15;
		
		boolean b1 = (a++ >=11 ); //true
		boolean b2 = ( b == 12 ||/*short circuit*/ ++c > 0 );
		
		
		System.out.println(" o valor de b1 é  = " + b1 );
		System.out.println(" o valor de a é   = " + a );
		System.out.println("----------" );
		System.out.println(" o valor de b2 é   = " + b2 );
		System.out.println(" o valor de c é   = " + c );
		System.out.println("----------" );
		boolean b3 = ( a != 11 && ++b > 10 );
		System.out.println(" o valor de b3 é  = " + b3 );
		System.out.println(" o valor de b é   = " + b );
		System.out.println(" o valor de a é   = " + a );
		System.out.println("----------" );
		
		
		
		int x = 1 , y = 1 , z =1 ;
		boolean b4 = (x == 1 && ++y < 0 &&  ++z == 2 );
		System.out.println(" o valor de b4 é  = " + b4);
		System.out.println(" o valor de x é   = " + x);
		System.out.println(" o valor de y é   = " + y);
		System.out.println(" o valor de z é   = " + z);	

		
	}

}
