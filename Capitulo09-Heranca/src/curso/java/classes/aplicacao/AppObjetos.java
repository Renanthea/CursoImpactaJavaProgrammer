package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Funcionario;
import curso.java.classes.entidades.Pessoa;
import curso.java.classes.enumeracoes.Sexo;

public class AppObjetos {
	
	public static void main(String[] args) {
		
	
	Aluno aluno = new Aluno();
	aluno.setNome("Emilio");
	aluno.setIdade(46);
	aluno.setSexo(Sexo.MASCULINO);
	aluno.setMatricula(21521);
	aluno.setCurso("Java Programmer");
	
	Funcionario funcionario = new Funcionario();
	funcionario.setNome("JOSE");
	funcionario.setIdade(27);
	funcionario.setSexo(Sexo.MASCULINO);
	funcionario.setCpf("11251515151");
	funcionario.setCargo("Motoboy");
	funcionario.setSalario(3000);
	
		Pessoa pessoa;
		pessoa = aluno;
		
		JOptionPane.showMessageDialog(null, pessoa.exibir());
		
		pessoa = funcionario;
		
		JOptionPane.showMessageDialog(null, pessoa.exibir());
	
	
	}
	
}
