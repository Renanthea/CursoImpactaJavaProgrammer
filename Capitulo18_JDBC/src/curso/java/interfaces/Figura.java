package curso.java.interfaces;

public interface Figura {

	//todo atributo de interface é:
	//public, static e final por definição
	int VERSAO = 1;
	
	//todos os métodos de interfaces são publicos e 
	//abstratos por definição
	double calcularArea();
	
	//A partir da versão 8 do Java, a interface permite a presença
	//de métodos estáticos (static) e métodos default
	static String exibirArea(Figura f){
		
		String classe = f.getClass().getSimpleName();		
		return "Classe: " + classe + "\nÁrea da figura: " + f.calcularArea();		
	}
	
	default String exibirAreaDefault(){
		String classe = this.getClass().getSimpleName();
		return "Classe: " + classe + "\nÁrea da figura (default): " 
				+ this.calcularArea();
	}
	
	
}
