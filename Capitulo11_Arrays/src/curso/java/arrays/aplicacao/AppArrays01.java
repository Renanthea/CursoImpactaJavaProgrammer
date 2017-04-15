package curso.java.arrays.aplicacao;

public class AppArrays01 {

	public static void main(String[] args) {
		
		//Exemplo 01 : declarando e atribuindo valores individuais 
		// para um array de inteiros 
		
		int [] numeros  = new int [5];
		
		numeros [0] = 10;
		
		numeros [3] = -100;
		
		numeros [1 ] = 9; 
		
		numeros [2] = 56;
		
		
		
		
		
		//exibindo os valores do array em uma estrutura de repetição
		
		for (int i = 0; i <numeros.length
				; i++) {
			
			System.out.println(numeros[i]);
			
		}		
		
		

	}

}
