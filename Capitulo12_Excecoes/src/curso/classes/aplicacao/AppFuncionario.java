package curso.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Funcionario;
import curso.java.classes.enumeracoes.Sexo;

public class AppFuncionario {

	public static void main(String[] args) {
	
		try {
			Funcionario funcionario = 
					new Funcionario ("Manoel", Sexo.MASCULINO,null, 50 ,  "diretor" ,15000);
					JOptionPane.showMessageDialog(null, funcionario.exibir());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			
			
		}
		

	}

}
