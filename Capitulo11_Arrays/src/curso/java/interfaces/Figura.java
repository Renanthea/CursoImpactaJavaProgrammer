package curso.java.interfaces;

import javax.swing.JOptionPane;

public interface Figura  {
	
	// todos atributos de interface s�o public , static e final por defini��o 
	
	public static  int VERSAO = 1 ; 
	
	//Todos os m�todos de interfaces s�o publicos e 
	//abstratos por defini��o
	
	public double calcularArea();
		
	// A partir da vers�o 8 do Java , a interface permite a presen�a
	// de m�todos est�ticos(static) e m�todos default
	
	static String exibirArea(Figura f){
		
		String classe = f.getClass().getSimpleName();
		
		return "Classe:" + classe + "\n�rea da figura:" + f.calcularArea();
		
		
	}
	
	default String exibirAreaDefault(){
		
		String classe = this.getClass().getSimpleName();
		
		return "Classe:" + classe + "\n�rea da figura (default) :" 
				+ this.calcularArea();
				
	}
	

	 
		
		
	

}
