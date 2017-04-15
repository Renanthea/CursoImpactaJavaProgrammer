package curso.java.operadores.aritimeticos;

public class OperadoresInclementais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 10 , y = 3;
		 x++ ; 
		 ++y;
		 
		 
		 System.out.println(" o valor de x é   = " + x );
		 System.out.println(" o valor de y é   = " + y);
		 System.out.println("------------ " );
		 
		 int j = x++; // x = 12   -  primeiro atribui , depois incrementa 
		 int k = ++y; //   x = 5  -  primeiro incrementa , depois atribui 
		 
		 System.out.println(" o valor de x é   = " + x );
		 System.out.println(" o valor de y é   = " + y);
		 System.out.println(" o valor de j é   = " + j );
		 System.out.println(" o valor de k é   = " + k);
		 System.out.println("------------ " );
		 
		 System.out.println(x++);  // Primeiro atribui , depois incrementa 
		 System.out.println(++y);  // Primeiro incrementa , depois atribui 
		 
		 
		 
	}

}
