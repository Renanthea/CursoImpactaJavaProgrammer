package curso.java.classes.entidades.aplicacao;

import javax.swing.JOptionPane;


import curso.java.classes.entidades.Aluno;

public class AppAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.atribuir(-123,"Emilio","Informatica");

		System.out.println(aluno1.exibir());
		JOptionPane.showMessageDialog(null,aluno1.exibir());  
		
			
		}

	}
		
        /*aluno1.mostrar();
		//aluno1.atribuirMatricula(0);
		//aluno1.atribuirNome("Emilio");
		//aluno1.atribuirCurso("Informatica");
		//aluno1.mostrarMatricula();
		//aluno1.mostrarCurso();
		//aluno1.mostrarNome();	

	     
         		ALuno
         * private int matricula;
         * public void atribuirMatricula( int m ) { 
         * 		matricula = m ; 	
         * 
         * }
         * 
         *   
         */
