package curso.java.arrays.aplicacao;

public class AppArrays03 {

	public static void main(String[] args) {
	
		//Exemplo 03: Declarando e atribuindo elementos simultaneamente 
		// para um array de inteiros 
		
		
		int [] numeros ;
		numeros  =  new  int[] {20,16,9,14,75,48}; 
		
		
		

		//exibir os valores do array na tela , usando a estrutura 
		// de repetição for aprimorado (foreach)
		
		for(int elemento : numeros){
			
			System.out.println(elemento);
			
			
		}		 	

	}

}
