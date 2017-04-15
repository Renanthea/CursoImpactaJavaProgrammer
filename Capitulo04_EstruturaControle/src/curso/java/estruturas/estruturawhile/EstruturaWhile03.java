package curso.java.estruturas.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * o usuário informa vários números inteiros , e somente os 
		 * positivos são exibidos. Quando informar zero (0) , a estrutura de 
		 * repetição é interrompida.		 	 
		 */
		
	while(true){
			
			int numero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um número"));
			
			if(numero== 0 ){
				break; // A estrutura para e volta para o inicio da estrutura de repetição 				
			}
			if(numero <0){
				continue;// ignora o restante da estrutura e volta para o ultimo passo 				
			}
			System.out.println(numero);
		}
		
		System.out.println("Fim");
	}
}