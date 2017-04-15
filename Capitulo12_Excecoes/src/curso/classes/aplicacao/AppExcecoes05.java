package curso.classes.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes05 {

	public static void main(String[] args) {
		
		
		try {
			String nome = JOptionPane.showInputDialog("Digite seu nome ");
			
		
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a Idade"));
			
			JOptionPane.showMessageDialog(null, nome.toUpperCase());
			JOptionPane.showMessageDialog(null, idade); //NumberFormatException 
			
			int x = 100 /idade;
			JOptionPane.showInputDialog(null,"Valor de x: " + x); //ArithmeticException
			
			
			
		}catch (NullPointerException e) {			
			System.out.println("Referencia nula : " + e.getMessage());	
		}catch (NumberFormatException e) {	
			JOptionPane.showMessageDialog(null,
					"\nErro de Entrada : " + e.getMessage());
			
		}catch(Exception e ){
			
			JOptionPane.showMessageDialog(null, "Erro não previsto" + e.getMessage());
			
			
		}				

	}

}
