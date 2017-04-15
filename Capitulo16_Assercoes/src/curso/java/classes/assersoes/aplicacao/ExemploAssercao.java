package curso.java.classes.assersoes.aplicacao;

public class ExemploAssercao {

	public static void main(String[] args) {
		int soma = calcular(-1,3);
		System.out.println(soma);		
	}		
	
	/*for ( int i . i< args.length ; i++){
		System.out.println(args[i]);
		
	}
	*/
			
		private static int calcular(int x , int y){
			
//			assert(x > 0): "O Primeiro parametro deve ser positivo";
			return x + y;			

	}

}
