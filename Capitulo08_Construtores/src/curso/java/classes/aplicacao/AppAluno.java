package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Aluno;

public class AppAluno {

	public static void main(String[] args) {		
		
		
		
		Aluno aluno = new Aluno(201505649, "Renan" , "Sistemas de Informação");				
		JOptionPane.showMessageDialog(null, aluno.exibir());
		
		/*
		System.out.println(humano.getIdade());
		System.out.println(humano.getPeso());
		
		System.out.println("---------------");
		
		Humano com_nome = new Humano("Rodolpho" , 2.8 , 0.35);
		System.out.println(com_nome.getNome());
		System.out.println(com_nome.getIdade());
		System.out.println(com_nome.getPeso());
		System.out.println(com_nome.getAltura());
		System.out.println("---------------");
		*/

	}

}
