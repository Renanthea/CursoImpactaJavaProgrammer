package curso.java.classes.ordenadores;

import java.util.Comparator;

import curso.java.classes.entidades.Retangulo;

public class OrdenacaoArea implements Comparator<Retangulo> {
	
	@Override
	public int compare(Retangulo arg0, Retangulo arg1) {
		
		Double area1 = arg0.calcularArea();
		Double area2 = arg1.calcularArea();
		
		return area1.compareTo(area2);
	
	}	
	
}	


