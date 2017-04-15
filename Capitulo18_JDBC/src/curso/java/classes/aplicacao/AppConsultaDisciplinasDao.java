package curso.java.classes.aplicacao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import curso.java.classes.dao.AlunoDao;
import curso.java.classes.dao.DisciplinaDao;
import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Disciplina;

public class AppConsultaDisciplinasDao {
	public static void main(String[] args) {
		//Buscando um aluno
		
		try {
			List<Aluno> listaAlunos = new AlunoDao().listar();
			
			Aluno aluno = (Aluno)JOptionPane.showInputDialog(null,
											"Selecione o aluno",
											"Alunos",
											JOptionPane.QUESTION_MESSAGE,
											null,
											listaAlunos.toArray(),
											null);
			List<Disciplina> listaDisciplinas = 
					new DisciplinaDao().listar(aluno.getMatricula());
			
			//gerando uma coleção Set a partir de um List
			Set<Disciplina> setDisciplinas = new LinkedHashSet<>();
			for (Disciplina disciplina : listaDisciplinas) {
				setDisciplinas.add(disciplina);
			}
			
			aluno.setDisciplinas(setDisciplinas);
			
			System.out.println(aluno.exibir());
					
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
