package curso.java.variaveis.escopos;

public class EscopoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// escopo  da variavel = abrangencia , é o bloco aonde ela ta definida 
		int j = 120 ; // escopo : bloco do metodo main () 
		{
			
			int k = 20;
			System.out.println(" j ( bloco interno ) = "  + j );
			System.out.println(" k (local ao bloco ) = "  + k );	
		}	
		System.out.println(" j (fora do bloco interno ) = " + j );	
		//System.out.println(" k = " + k );	
		

	}

}
