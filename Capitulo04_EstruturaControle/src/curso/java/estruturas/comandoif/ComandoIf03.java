package curso.java.estruturas.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Em uma disciplina o aluno realiza tr�s avalia��es , com notas 
		 * entre 0 e 10 . A m�dia entre estas tr�s notas define a situa��o do aluno:
		 * 	- M�dia < 4 : Reprovado
		 *  - M�dia >=4 e <6: Exame
		 *  - M�dia >= 6 : Aprovado
		 *  
		 *   O programa deve solicitar : o nome do aluno e as tr�s notas .
		 *    Em seguida , deve calcular sua m�dia , e apresentar o resultado 
		 *    (inclusive as notas).		
		 */
		
		String aluno  = JOptionPane.showInputDialog("Nome do aluno");
		
		double nota1 = Double.parseDouble(
				JOptionPane.showInputDialog("Nota 01 ")); 				
		
		double nota2 = Double.parseDouble(
				JOptionPane.showInputDialog("Nota 02 ")); 
		
		double nota3 = Double.parseDouble(
				JOptionPane.showInputDialog("Nota 03 ")); 
		
		double media = (nota1 + nota2 + nota3) / 3;
		String  resultado;
		
		if(media < 4) { 
			resultado = "Reprovado";			
		}else if (media >= 4 && media <6){
			resultado = "Exame";
		} else {
			resultado = "Aprovado";
			}
		String resposta = "Aluno: " + aluno + 
				"\nNota 1 : " + nota1 + 
				"\nNota 2 : " + nota2 + 
				"\nNota 3 : " + nota3 + 
				"\nMedia : " + media +
				"\nSitua��o : " + resultado;
		JOptionPane.showMessageDialog(null, resposta);
				
				
		
		
	}

}
