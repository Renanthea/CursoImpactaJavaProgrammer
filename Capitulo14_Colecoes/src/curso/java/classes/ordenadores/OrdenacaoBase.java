package curso.java.classes.ordenadores;

import java.util.Comparator;

import curso.java.classes.entidades.Retangulo;

public class OrdenacaoBase  implements Comparator<Retangulo>{

	@Override
	public int compare(Retangulo arg0, Retangulo arg1) {
		
		Double base1 = arg0.getBase();
		Double base2 = arg1.getBase();
		
		return base1.compareTo(base2);
	
	}	
	
}


