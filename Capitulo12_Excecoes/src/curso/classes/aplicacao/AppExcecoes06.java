package curso.classes.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes06 {

	public static void main(String[] args) {
		
		try {
			String nome = JOptionPane.showInputDialog("Digite seu nome ");
			
		
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a Idade"));
			
			JOptionPane.showMessageDialog(null, nome.toUpperCase());
			JOptionPane.showMessageDialog(null, idade); //NumberFormatException 
			
			int x = 100 /idade;
			JOptionPane.showInputDialog(null,"Valor de x: " + x); //ArithmeticException
						
		
		}catch (NumberFormatException | NullPointerException e) {	
			JOptionPane.showMessageDialog(null,
					"\nErro  : " + e.getMessage());
			
		}catch(Exception e ){
			
			JOptionPane.showMessageDialog(null, "Erro não previsto" + e.getMessage());
			
			
		}				
		
		
	}

}
