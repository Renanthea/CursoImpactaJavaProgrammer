package curso.java.classes.novasclasses;

import javax.swing.JOptionPane;

public class AppAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(); 
		
		Aluno a2 = new Aluno();
		
		Aluno a3 = new Aluno();
		
		a1.matricula =920;
		a1.nome="Gerson";
		a1.curso="Eng Civil";
		
		
		a2.matricula = 200;
		a2.nome="Carolina";
		a2.curso="Psicologia";
		
		a3.matricula =1000;
		a3.nome="Renan";
		a3.curso="Curso de Ios";
		
		
		
		String aluno1 ="\nMatricula :  " +  a1.matricula + 
						"\nNome : " + a1.nome + 
						"\nCurso : " + a1.curso ; 
		JOptionPane.showMessageDialog(null,aluno1);
		
		String aluno2 ="\nMatricula :  " +  a2.matricula + 
				"\nNome : " + a2.nome + 
				"\nCurso : " + a2.curso ; 
		JOptionPane.showMessageDialog(null,aluno2);
		
		String aluno3 ="\nMatricula :  " +  a3.matricula + 
				"\nNome : " + a3.nome + 
				"\nCurso : " + a3.curso ;
		
		
		
		JOptionPane.showMessageDialog(null,aluno3);
		
		String aluno = aluno1 +
				       "\n------------------------"+
				       aluno2 +
				       "\n------------------------"+
				       aluno3 ; 
		JOptionPane.showMessageDialog(null,aluno);
		
				
		
		
		
		
		/*
		System.out.println("A matricula é : " + a1.matricula+
		           "\no nome é : " + a1.nome +
		           "\no curso é psicologia: " + a1.curso );	
		
		
		System.out.println("\nA matricula é : " + a2.matricula +
				           "\nA nome é : " + a2.nome      +
				           "\nA curso é psicologia " + a2.curso );
		

		System.out.println("\nA matricula é : " + a3.matricula +
				           "\nO nome é : " + a3.nome      +
				           "\nO curso é  " + a3.curso );
				           
				           */
		
		
				
		
		
		
		
		/* Aluno aluno = new Aluno (); 
		aluno.matricula;
		aluno.curso;
		aluno.nome
		*/

	}

}
