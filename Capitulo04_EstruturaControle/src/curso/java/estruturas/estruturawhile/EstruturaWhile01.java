package curso.java.estruturas.estruturawhile;

public class EstruturaWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = (int)(Math.random() * 10);
		
		while  (numero < 5) // no while primeiro faz a condição 
			{
			  
			System.out.println(numero);
			numero++;   
		    }
			System.out.println("----Fim--");
     	}

}
