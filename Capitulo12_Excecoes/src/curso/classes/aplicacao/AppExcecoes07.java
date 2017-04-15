package curso.classes.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes07 {

	
	
	public static void main(String[] args) {
	
		try {
			metodo1();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
 		
	}
	public static void metodo1(){
		try {		
  	 
			metodo2();
		
	} catch (Exception e) {
			throw e;
		}	
		
	}

	
	
	public static void metodo2(){
		try {
			metodo3();
		} catch (Exception e) {
			throw e;			
		}		
		
	}

	public static void metodo3(){
		
		try {
			
			int[] numeros = { 1,2,3,4};
			System.out.println(numeros[4]);
			//ArrayIndexOutOfBoundsException , rastreando de pilha de erro 
		} catch (Exception e) {
			throw e ;	
			
			
		}
	
	
	}
	
	

}
