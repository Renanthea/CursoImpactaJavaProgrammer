package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Funcionario;

public class AppFuncionario {

	public static void main(String[] args) {
		
		
		Funcionario funcionario = new Funcionario(
				"327.445.151-45 ", "Renan" , "Programador" , 1500);	
		
		JOptionPane.showMessageDialog(null, funcionario.exibir());
		
	}

}
