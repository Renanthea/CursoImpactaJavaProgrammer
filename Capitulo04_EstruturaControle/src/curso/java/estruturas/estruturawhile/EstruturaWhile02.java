package curso.java.estruturas.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * O usu�rio informa uma certa quantidade de numeros 
		 * inteiros. Quando o usu�rio digitar um numero negativo , a
		 * estrutura de repeti��o ser� interrompida. 
		 */
		
		while(true){
			
			int numero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um n�mero"));
			
			if(numero<0){
				break;
			}
			System.out.println(numero);
		}
		
		System.out.println("Fim");
	}

}
