package curso.java.classes.aplicacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import curso.java.classes.dao.AlunoDao;
import curso.java.classes.dao.DisciplinaDao;
import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Disciplina;

public class AppCadastroDisciplinaDao {
	public static void main(String[] args) {
		try {
			//dados da disciplina
			int codigo = Integer.parseInt(
				JOptionPane.showInputDialog("Código da disciplina"));
			
			String descricao = JOptionPane.showInputDialog("Descrição da disciplina");
			
			int ch = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária"));
			
			String data = JOptionPane.showInputDialog("Data Matrícula (dd/mm/aaaa)");
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dataMatricula =  df.parse(data);
			
			//Buscando um aluno
			
			List<Aluno> listaAlunos = new AlunoDao().listar();
			
			Aluno aluno = (Aluno)JOptionPane.showInputDialog(null,
											"Selecione o aluno",
											"Alunos",
											JOptionPane.QUESTION_MESSAGE,
											null,
											listaAlunos.toArray(),
											null);
			//Criando o objeto da classe Disciplina
			Disciplina disciplina = new Disciplina(codigo, 
												   descricao, 
												   ch, 
												   dataMatricula, 
												   aluno);
			//inserindo a disciplina no banco de dados
			new DisciplinaDao().incluir(disciplina);
			JOptionPane.showMessageDialog(null, "Disciplina incluída com sucesso!");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
		}
	}
}
