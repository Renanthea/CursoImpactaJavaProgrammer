package curso.java.classes.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppConjunto05 {

	public static void main(String[] args) {
		
		Set<String> cursos = new LinkedHashSet<>();
		cursos.add("Java");
		cursos.add("java");
		cursos.add("AngularJS");
		cursos.add("Android");
		
		for (String curso : cursos) {
			
			System.out.println(curso + ":" + curso.hashCode());
			
		}
		
	}

}
