package curso.java.estruturas.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * O usuário informa uma certa quantidade de numeros 
		 * inteiros. Quando o usuário digitar um numero negativo , a
		 * estrutura de repetição será interrompida. 
		 */
		
		while(true){
			
			int numero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um número"));
			
			if(numero<0){
				break;
			}
			System.out.println(numero);
		}
		
		System.out.println("Fim");
	}

}
