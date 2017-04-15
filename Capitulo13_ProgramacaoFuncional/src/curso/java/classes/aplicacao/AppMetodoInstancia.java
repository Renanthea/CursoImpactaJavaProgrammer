package curso.java.classes.aplicacao;

import curso.java.classes.entidades.Retangulo;
import curso.java.interfaces.AcessoMetodoInstancia;

public class AppMetodoInstancia {

	public static void main(String[] args) {
		
		Retangulo retangulo  = new Retangulo (20, 14) ;		
		AcessoMetodoInstancia acesso = retangulo::calcularArea;
		System.out.println(acesso.calcular());
		
		
	}

}
