package curso.java.classes.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Disciplina;
import curso.java.classes.enumeracoes.Sexo;


public class AppAluno {

	public static void main(String[] args) {
		
		//Fornecendo os dados do aluno , com valores fixos 
		Aluno aluno = new Aluno ("Gabriel",
									25 ,
									Sexo.MASCULINO,
									21515215, 
									"Ti");
		
		Set<Disciplina> disciplinas = new LinkedHashSet<>();
		
		while(true){
			int codigo = Integer.parseInt(
					JOptionPane.showInputDialog("Código da Disciplina"));
			
			String descricao = JOptionPane.showInputDialog("Descricao");
			
			int ch = Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria"));
			
			Disciplina disciplina = new Disciplina ( codigo,descricao,ch);
			
			disciplinas.add(disciplina);
			
			if (JOptionPane.showConfirmDialog(
					null,
					"Deseja Continuar?",
					"Confirmação",
					JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION ) {
			
				 break;
				
			}			
		}
		aluno.setDisciplinas(disciplinas);
		System.out.println(aluno.exibir());
	}
}
