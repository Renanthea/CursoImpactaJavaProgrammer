package curso.java.estruturas.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * o usu�rio informa v�rios n�meros inteiros , e somente os 
		 * positivos s�o exibidos. Quando informar zero (0) , a estrutura de 
		 * repeti��o � interrompida.		 	 
		 */
		
	while(true){
			
			int numero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um n�mero"));
			
			if(numero== 0 ){
				break; // A estrutura para e volta para o inicio da estrutura de repeti��o 				
			}
			if(numero <0){
				continue;// ignora o restante da estrutura e volta para o ultimo passo 				
			}
			System.out.println(numero);
		}
		
		System.out.println("Fim");
	}
}