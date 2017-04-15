package curso.java.estruturas.introducao;

public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//valor original
		double n1 = Math.random();
		System.out.println(n1);
		
		//valor entre 0 e 100
		double n2 = Math.random() *100;
		System.out.println(n2);
		
		//valor Inteiro entre 0 e 100 
		int n3 = (int) (Math.random() *100); // colocar entre parenteses
		System.out.println(n3);		
			
		

	}

}
