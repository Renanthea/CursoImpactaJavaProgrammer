package curso.java.estruturas.introducao;

import javax.swing.JOptionPane;


public class Introducao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome =  JOptionPane.showInputDialog("Qual é o seu nome" );			
		
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		
		double salario = Double.parseDouble(
				JOptionPane.showInputDialog("Qual o seu salario ?"));
		
		String resposta = "Nome :   " + nome + 
						"\nIdade:   " + idade + 
						"\nSalario: " + salario; 
		
		JOptionPane.showMessageDialog(null,resposta);
		
//		String idade = JOptionPane.showInputDialog("Qual sua idade" );
//	    int idadeInt = Integer.parseInt(idade);
//		System.out.println(idadeInt);
//		
				
	

	}

}
