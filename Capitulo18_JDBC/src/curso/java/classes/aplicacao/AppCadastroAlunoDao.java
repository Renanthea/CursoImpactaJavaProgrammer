package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.dao.AlunoDao;
import curso.java.classes.entidades.Aluno;
import curso.java.classes.enumeracoes.Sexo;

public class AppCadastroAlunoDao {
	public static void main(String[] args) {
		try {
			
			int matricula = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a matrícula"));
				
			String nome = JOptionPane.showInputDialog("Informe o nome");
				
			int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a idade"));
				
			Sexo sexo = (Sexo)JOptionPane.showInputDialog(null,
													"Selecione o sexo",
													"Sexo",
													JOptionPane.QUESTION_MESSAGE,
													null,
													Sexo.values(),
													null);
				
			String curso = JOptionPane.showInputDialog("Informe o curso");
			
			
			Aluno aluno = new Aluno(nome, idade, sexo, matricula, curso);
			
			AlunoDao dao = new AlunoDao();
			dao.incluir(aluno);
			JOptionPane.showMessageDialog(null, "Aluno incluído com sucesso");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
		}
	}
}
