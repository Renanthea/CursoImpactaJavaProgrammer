package curso.java.estruturas.exercicios;

import javax.swing.JOptionPane;

public class SenhaNumerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * 
		 */
		
		String senha = " ";
		for (int i = 0; i < 8; i++) {			
						
			int valor = (int)(Math.random()*25) +65; //senha  numerica 
			senha += valor; 
		}
		JOptionPane.showMessageDialog(null,senha);
				
		
	}

}
