package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Endereco;
import curso.java.classes.enumeracoes.Sexo;

public class AppAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome (JOptionPane.showInputDialog( "Informe o Nome"));
		aluno1.setIdade (Integer.parseInt(JOptionPane.showInputDialog( "Informe a idade")));	
		Sexo sexo = (Sexo) JOptionPane.showInputDialog(null,
				"Informe o sexo ",
				"Sexo",
				JOptionPane.QUESTION_MESSAGE,
				null,
				Sexo.values(),
				Sexo.FEMININO);

			aluno1.setSexo(sexo);
			aluno1.setCurso(JOptionPane.showInputDialog( "Informe o Curso"));	
			aluno1.setMatricula (Integer.parseInt(JOptionPane.showInputDialog( "Informe a matricula")));
			
			Endereco end = new Endereco();
			end.setLogradouro (JOptionPane.showInputDialog( "Informe o Nome"));
			end.setNumero (Integer.parseInt(JOptionPane.showInputDialog( "Informe o Numero")));				
			end.setCidade((JOptionPane.showInputDialog( "Informe o Nome da Cidade")));
			
			aluno1.setEndereco(end);
			
			JOptionPane.showMessageDialog(null, aluno1.exibir());
				
			
			
		
	
	}

}
