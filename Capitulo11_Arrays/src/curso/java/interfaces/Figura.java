package curso.java.interfaces;

import javax.swing.JOptionPane;

public interface Figura  {
	
	// todos atributos de interface são public , static e final por definição 
	
	public static  int VERSAO = 1 ; 
	
	//Todos os métodos de interfaces são publicos e 
	//abstratos por definição
	
	public double calcularArea();
		
	// A partir da versão 8 do Java , a interface permite a presença
	// de métodos estáticos(static) e métodos default
	
	static String exibirArea(Figura f){
		
		String classe = f.getClass().getSimpleName();
		
		return "Classe:" + classe + "\nÁrea da figura:" + f.calcularArea();
		
		
	}
	
	default String exibirAreaDefault(){
		
		String classe = this.getClass().getSimpleName();
		
		return "Classe:" + classe + "\nÁrea da figura (default) :" 
				+ this.calcularArea();
				
	}
	

	 
		
		
	

}
