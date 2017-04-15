package curso.java.arrays.aplicacao;

public class AppArray09 {

	public static void main(String[] args) {
		//Array Bidimensional
		
		int [] [] numeros  = new int [3] [];
		numeros [0] =  new int [] { 2,5,8,7} ; 
		numeros [1] = new int  [ ]{8,9};
		numeros [2] = new int [] { 3,5,6 };
		
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j]+ "");
				
			}
			
			System.out.println();
		}			

	}

}
