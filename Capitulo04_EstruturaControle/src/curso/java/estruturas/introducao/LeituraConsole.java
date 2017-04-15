package curso.java.estruturas.introducao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeituraConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		
		
		System.out.println("Informe seu nome ");
		String nome = leitura.next();
		System.out.println("Informe sua idade ");
		int idade = leitura.nextInt();
		System.out.println("Informe seu  salario");
		double salario = leitura.nextDouble();		
		
		String resposta = "Nome :   " + nome + 
						"\nIdade:   " + idade + 
						"\nSalario: " + salario;
		
		
			//System.out.println(resposta);
		JOptionPane.showMessageDialog(null,resposta);

	}

}

	
