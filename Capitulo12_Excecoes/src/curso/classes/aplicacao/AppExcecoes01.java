package curso.classes.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes01 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome ");
		
		if (nome != null) {
		
		JOptionPane.showMessageDialog(null, nome.toUpperCase());
		//Erro NullPointerExeception
		
		}else {
			JOptionPane.showMessageDialog(null,"Nenhum valor informado");
		}
		
	}
}



