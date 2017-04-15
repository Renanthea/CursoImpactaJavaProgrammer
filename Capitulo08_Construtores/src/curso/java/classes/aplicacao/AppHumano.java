package curso.java.classes.aplicacao;

import curso.java.classes.entidades.Humano;
import javax.swing.JOptionPane;


public class AppHumano {

	public static void main(String[] args) {
		
		
		
		
		Humano humano = new Humano( 3, 0.45);				
		System.out.println(humano.getNome());
		System.out.println(humano.getIdade());
		System.out.println(humano.getPeso());
		System.out.println(humano.getAltura());
		System.out.println("---------------");
		
		Humano com_nome = new Humano("Rodolpho" , 2.8 , 0.35);
		System.out.println(com_nome.getNome());
		System.out.println(com_nome.getIdade());
		System.out.println(com_nome.getPeso());
		System.out.println(com_nome.getAltura());
		System.out.println("---------------");
		
		
	}

}
