package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Funcionario;
import curso.java.classes.metodosestaticos.Metodos;

public class AppFuncionario {

	public static void main(String[] args) {
	
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setCpf(JOptionPane.showInputDialog("Informe seu CPF"));
		funcionario.setNome(JOptionPane.showInputDialog("Informe seu Nome"));
		funcionario.setCargo(JOptionPane.showInputDialog("Informe seu Cargo"));
		funcionario.setSalario(Double.parseDouble(
				JOptionPane.showInputDialog("Informe seu Salario")));
		
			
			JOptionPane.showMessageDialog(null,funcionario.exibir());
			JOptionPane.showMessageDialog(null, funcionario.exibir(), "Minha Janela ", JOptionPane.QUESTION_MESSAGE);
			
			
			JOptionPane.showMessageDialog(null,funcionario.exibir("Informações Cadastrais"));
			
			JOptionPane.showMessageDialog(null,Metodos.exibirAutoria("Renan de Arimathea"));
			
			
			
			
			
		
		}
		
		
		
	}

	

