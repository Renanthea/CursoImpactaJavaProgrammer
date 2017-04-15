package curso.java.classes.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import curso.java.classes.entidades.Retangulo;
import curso.java.classes.ordenadores.OrdenacaoAltura;
import curso.java.classes.ordenadores.OrdenacaoArea;
import curso.java.classes.ordenadores.OrdenacaoBase;

public class AppLista04 {

	public static void main(String[] args) {		
			
		List<Retangulo> retangulos = new ArrayList<Retangulo>();
		retangulos.add(new Retangulo(2,8));
		retangulos.add(new Retangulo(7,3));
		retangulos.add(new Retangulo(3,8));
		retangulos.add(new Retangulo(5,4));
		
		Collections.sort(retangulos, new OrdenacaoBase());
		
		retangulos.forEach(s -> System.out.println(s));
		System.out.println("---------------------");
		
		Collections.sort(retangulos, new OrdenacaoAltura());
		retangulos.forEach(s -> System.out.print(s));
		System.out.println("-------------");
		

		Collections.sort(retangulos, new OrdenacaoArea());
		retangulos.forEach(s -> { 
			
		System.out.print(s);
		System.out.println(s.calcularArea());
		
		
		});
	}

}
