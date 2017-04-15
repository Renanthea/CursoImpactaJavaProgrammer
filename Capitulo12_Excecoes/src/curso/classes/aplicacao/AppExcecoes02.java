package curso.classes.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes02 {

	public static void main(String[] args) {
		
		try {
			String nome = JOptionPane.showInputDialog("Digite seu nome ");
			JOptionPane.showMessageDialog(null, nome.toUpperCase());
		
		}catch (NullPointerException e) {
			
			JOptionPane.showMessageDialog(null, "\nErro: " + e.getMessage());
			
			
			
			
		}
		
		
			
	
	}

}
