package curso.java.classes.aplicacao;

import curso.java.classes.entidades.Retangulo;
import curso.java.interfaces.Operacao07;

public class AppOperacao07 {

	public static void main(String[] args) {
		
		Operacao07<String> op7 = s -> s.length();		
		System.out.println(op7.buscar("Interface generica com String"));
		
		
		
		
		Operacao07<Retangulo> op7a = s -> (int)s.calcularArea(); 
		System.out.println(op7a.buscar(new Retangulo(10,12)));
		
		//Generics

	}

}
