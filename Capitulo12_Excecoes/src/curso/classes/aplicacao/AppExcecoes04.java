package curso.classes.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes04   {

	public static void main(String[] args) {
		
		try {
			String nome = JOptionPane.showInputDialog("Digite seu nome ");			
		
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a Idade"));
			
			JOptionPane.showMessageDialog(null, nome.toUpperCase());
			JOptionPane.showMessageDialog(null, idade); //NumberFormatException 
			
			
		}catch (Exception e) {			
			JOptionPane.showMessageDialog(null, "\nErro: " + e.getMessage());			
		}
		
	}

}
