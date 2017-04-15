package curso.java.classes.aplicacao;

import java.util.List;

import javax.swing.JOptionPane;

import curso.java.classes.dao.AlunoDao;
import curso.java.classes.entidades.Aluno;

public class AppConsultaAlunoDao {
	public static void main(String[] args) {
		
		try {
			List<Aluno> alunos = new AlunoDao().listar();
			for (Aluno aluno : alunos) {
				System.out.println(aluno.exibir());
				System.out.println("---------------------------");
			}
			
			AlunoDao dao = new AlunoDao();
			while(true){
				int matricula = Integer.parseInt(
					JOptionPane.showInputDialog("Informe uma matrícula"));
				Aluno aluno = dao.buscar(matricula);
				if(aluno == null){
					JOptionPane.showMessageDialog(null, "Aluno inexistente");
				} else {
					JOptionPane.showMessageDialog(null, aluno.exibir());
				}
				int opcao = JOptionPane.showConfirmDialog(null, 
												"Deseja continuar?",
												"Confirmação",
												JOptionPane.YES_NO_OPTION);
				if(opcao == JOptionPane.NO_OPTION){
					break;
				}
			}
			
		} catch (Exception e) {			
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
		}
	}
}
