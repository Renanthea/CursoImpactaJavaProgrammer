package curso.java.classes.arquivos.aplicacao;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Set;

import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Disciplina;
import curso.java.classes.enumeracoes.Sexo;

public class AppAluno {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(showInputDialog("Digite o nome do aluno"));
		
		aluno.setSexo((Sexo)showInputDialog(null,
				"Selecione o sexo",
				"Sexo)",
				QUESTION_MESSAGE,
				null,
				Sexo.values(),
				Sexo.FEMININO))
				;
		
		aluno.setIdade(parseInt(showInputDialog("Digite a idade do aluno ")));
		
		aluno.setMatricula(parseInt(showInputDialog("Digite a Matricula ")));
		
		aluno.setCurso(showInputDialog("Digite o curso"));
		
		Set<Disciplina> disciplinas = new LinkedHashSet<>(); 
		
		while (true) {
			Disciplina disciplina = 
					new Disciplina(parseInt(showInputDialog("Digite o Código")),
					showInputDialog("Descrição?"),
					parseInt("Carga Horaria?"));			
				
			disciplinas.add(disciplina);
			
			if (showConfirmDialog(null, "Deseja Continuar" , "Confirmação " , YES_NO_OPTION) == NO_OPTION) {
				
				break;				
				
			}
			
		}
		aluno.setDisciplinas(disciplinas);
		
		while (true) {
			
			String opcao = (String)showInputDialog(null,
					"Selecione uma opção",
					"Opção)",
					QUESTION_MESSAGE,
					null,
					new String [] {"Listar" , "Arquivo" , "Sair"},
					null);
					
					
					switch (opcao) {					
					case "Listar":{
						
					};break;

					case "Arquivo ": {
						
						try {
							FileWriter arquivo = new FileWriter ("C:\\Users\\di3616\\Documents\\Curso_JavaProgrammer\\endereco.txt");
							arquivo.write(aluno.exibir());
							arquivo.close();
							showMessageDialog(null,"Arquivo criado com sucesso");
						} catch (Exception e) {
							// TODO: handle exception
						}
						
					};break;	
					
					default: return;
			
			}						
		}
	}

}
