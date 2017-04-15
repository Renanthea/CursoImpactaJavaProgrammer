package curso.java.estruturas.estruturafor;

public class EstruturaFor03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 20; i++) {
			
			int numero = (int)(Math.random()*100);
			
			if( numero > 50){
				
				System.out.println(numero);
			}else
				System.out.println("---");
			
			
			
		}

	}

}
