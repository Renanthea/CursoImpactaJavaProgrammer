package curso.java.estruturas.comandoif;

import javax.swing.JOptionPane;


public class ComandoIf01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 *  O usuário fornece os dados de um funcionario : nome e salario  
		 *  O programa exibe as informações
		 * - nome do funcionario,
		 * - salario
		 * - desconto de IR (aproximado) 
		 * - valor liquido 
		 *  
		 *  Regra:somente quem ganha acima de 1800 , tem um desconto 
		 *  de 10% sobre a diferença de salario
		 */
		
		String nome = JOptionPane.showInputDialog("Nome do Funcionario");
		double salario = Double.parseDouble(
				JOptionPane.showInputDialog("Salario do Funcionario"));

		double desconto = 0;
		
		double salarioLiquido = salario - desconto;
		
		if(salario > 1800){	
			desconto = (salario - 1800) * 10 /100; 
		}
		String resposta =  "Nome do Funcionario:   " + nome + 
				"\nSalario:   " + salario + 
				"\nDesconto: " + desconto +
				"\nSalario Liquido " + salarioLiquido;		
		        //\nValor Liquido :  " + (salario - desconto); 
		
		JOptionPane.showMessageDialog(null,resposta);
	}

}
