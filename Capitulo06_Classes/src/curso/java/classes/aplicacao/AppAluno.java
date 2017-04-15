package curso.java.classes.aplicacao;

import curso.java.classes.novasclasses.encapsulamento.Aluno;

public class AppAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(); 	 
		aluno.matricula = 1000;
		aluno.curso ="Java Programmer" ; 
		aluno.nome = "Renan de Arimathea ";
		
		
		/*
		 * Conseguimos acessar a classe (importá-la) porque ela está definida
		 * como pública , e o acesso aos seus atributos também foram permitidos 
		 * porque eles também são públicos.		 		 
		 */
		
		System.out.println(aluno.matricula);
		System.out.println(aluno.nome);
		System.out.println(aluno.curso);
		
	}

}
