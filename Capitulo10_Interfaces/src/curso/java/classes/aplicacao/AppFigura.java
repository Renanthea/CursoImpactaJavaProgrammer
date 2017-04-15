package curso.java.classes.aplicacao;



import javax.swing.JOptionPane;

import curso.java.classes.entidades.Retangulo;
import curso.java.interfaces.Figura;

public class AppFigura {

		public static void main(String[] args) {
			
			Retangulo r1 = new Retangulo(10,15);
			Figura r2 = new Retangulo(4,7);		
			
			//chamando o métodos estático da interface para o objeto r1
			
			JOptionPane.showMessageDialog(null, Figura.exibirArea(r1));
			
			JOptionPane.showMessageDialog(null, r1.exibirAreaDefault());
			JOptionPane.showMessageDialog(null, r2.exibirAreaDefault());
			
		}
		
		
	}


