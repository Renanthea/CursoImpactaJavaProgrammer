package curso.java.arrays.metodos;

public final  class Metodos {
	
	//método que recebe um array de numeros reais  como paramentro 
	//e retorna a soma dos elementos
	
	public static double calcularSoma(double [] numeros){
		
		double soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];			
		}
		
		
		return soma ; 		
				
	}
	
	//metodo que recebe um array de String e retorna o elemento com o 
	//maior numero de caracteres
	
	public static String buscarMaiorNome(String [] args){
		if (args.length > 0 ) {
			int maior = args [0].length();
			int posicao = 0 ; 
			for (int i = 1; i < args.length; i++) {
				if(args[i].length() > maior){
					maior = args [i].length();
					posicao = i;
					}
			
			}
		
			return args [posicao];
			
		}
	
		return null;
	}
	
	//metodos que recebe uma quantidade variavel de paramentros do tipo int,
	// e retorna o maior elemento
	
	public static int buscarMaiorNumero(int...numeros ){ //VarARGS
		if (numeros.length > 0 ) {
			int maior = numeros [0];
			for (int i = 1; i < numeros.length; i++) {
				if (numeros[i]> maior) {
					maior  = numeros [i];
					
				}								
			}
			return maior;			
			
		}
		 return 0;
				
	}
	
	//Metodo que recebe o valor da base de calculo de um salario e retorna 
	//o valor do Imposto de Renda , de acordo com a tabela vigente (2017)
	
	public static double calcularIRPF(double salario) { 
		
		double imposto = 0;
		double [] taxas = {0, 7.5, 15, 22.5, 27.5};
		double [] valores = {0,1903.98, 2826.65, 3751.05, 4664.68};
		double baseCalculo = salario;
		
		
		for ( int i = taxas.length-1;  i >= 0; i--) {
			if(baseCalculo > valores[i] ){
				
				imposto +=(baseCalculo - valores [i] ) * taxas[i] / 100;
				baseCalculo = valores[i];				
				
			}
			
		}
		
		return imposto;	
				
	}	
	
	//Outra versao do metodo buscarMaiorNumero
	
	public static int buscarMaiorNumero2(int valor, int...numeros ) { 
		
		if (numeros.length > 0 ) {
			int maior = valor;
			for (int i = 1; i < numeros.length; i++) {
				if (numeros[i]> maior) {
					maior  = numeros [i];
					
				}								
			}
			return maior;			
			
		}
		 return valor;		
		
	}
		
}
	
	
	


