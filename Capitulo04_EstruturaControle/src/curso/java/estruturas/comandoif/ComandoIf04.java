package curso.java.estruturas.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  O usuario fornece um valor entre 1 e 12 , correspondente ao 
		 * m�s do ano . De acordo com o valor informado , o programa
		 * mostra a descri��o do m�s
		 */
	
		int mes = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o m�s (1 a 12)"));
		
		if(mes <1 || mes > 12) { 
			JOptionPane.showMessageDialog(null, "M�s inv�lido");
			return;
		}
		String descricao;
		
		if (mes == 1 ) {
			descricao = "Janeiro";		 			
				
			} else if (mes == 2 )  {
				descricao = "Fevereiro";
				
			} else if (mes == 3 )  {
				descricao = "Mar�o";
				
			} else if (mes == 4 )  {
				descricao = "Abril";
				
			} else if (mes == 5 )  {
				descricao = "Maio";
				
			} else if (mes == 6 )  {
				descricao = "Junho";
				
			} else if (mes == 7 )  {
				descricao = "Julho";
				
			} else if (mes == 8 ) {
				descricao = "Agosto";
			} else if (mes == 9 ) { 
				descricao = "Setembro";
				
			} else if (mes == 10 ) { 
				descricao = "Outubro";
			} else if (mes == 11) { 
				descricao = "Novembro";
				
			} else {
				descricao = "Dezembro";			
				
		}
		JOptionPane.showMessageDialog(null, "Mes informado: " + descricao);
	}
}
