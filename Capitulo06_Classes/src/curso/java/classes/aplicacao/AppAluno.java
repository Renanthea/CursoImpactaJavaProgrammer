package curso.java.classes.aplicacao;

import curso.java.classes.novasclasses.encapsulamento.Aluno;

public class AppAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(); 	 
		aluno.matricula = 1000;
		aluno.curso ="Java Programmer" ; 
		aluno.nome = "Renan de Arimathea ";
		
		
		/*
		 * Conseguimos acessar a classe (import�-la) porque ela est� definida
		 * como p�blica , e o acesso aos seus atributos tamb�m foram permitidos 
		 * porque eles tamb�m s�o p�blicos.		 		 
		 */
		
		System.out.println(aluno.matricula);
		System.out.println(aluno.nome);
		System.out.println(aluno.curso);
		
	}

}
