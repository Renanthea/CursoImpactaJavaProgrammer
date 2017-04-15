package curso.classes.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes03 {
	
	public static void main(String[] args) {
		
		try {
			String nome = JOptionPane.showInputDialog("Digite seu nome ");
			
		
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a Idade"));
			
			JOptionPane.showMessageDialog(null, nome.toUpperCase());
			JOptionPane.showMessageDialog(null, idade); //NumberFormatException 
			
			
		}catch (NullPointerException e) {			
			JOptionPane.showMessageDialog(null, "\nErro: " + e.getMessage());			
		}catch (NumberFormatException e) {	
			JOptionPane.showMessageDialog(null, "\nErro: " + e.getMessage());
			
		}		
		
	}

}
