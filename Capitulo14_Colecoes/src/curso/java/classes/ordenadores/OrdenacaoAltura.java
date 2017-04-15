package curso.java.classes.ordenadores;

import java.util.Comparator;

import curso.java.classes.entidades.Retangulo;

public class OrdenacaoAltura  implements Comparator<Retangulo> {
	
	@Override
	public int compare(Retangulo arg0, Retangulo arg1) {
		
		Double altura1 = arg0.getAltura();
		Double altura2 = arg1.getAltura();
		
		return altura1.compareTo(altura2);
	
	}	
	
}	


