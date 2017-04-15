package curso.java.estruturas.comandoswitch;

import javax.swing.JOptionPane;

public class ComandoSwitch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  O usuario fornece um valor entre 1 e 12 , correspondente ao 
		 * mês do ano . De acordo com o valor informado , o programa
		 * mostra a descrição do mês
		 */
	
		int mes = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o mês (1 a 12)"));
		
		if(mes <1 || mes > 12) { 
			JOptionPane.showMessageDialog(null, "Mês inválido");
			return;
		}
		
		String descricao;
		switch(mes){
		case 1  : descricao = "Janeiro";  break;	
		case 2  : descricao = "Fevereiro";break;
		case 3  : descricao = "Março";    break;
		case 4  : descricao = "Abril";    break;
		case 5  : descricao = "Maio";     break;
		case 6  : descricao = "Junho";    break; 
		case 7  : descricao = "Julho";    break;
		case 8  : descricao = "Agosto";   break;
		case 9  : descricao = "Setembro"; break;
		case 10 : descricao = "Outubro";  break;
		case 11 : descricao = "Novembro"; break;
	    default : descricao = "Dezembro";
			
								
		}
		
		
		JOptionPane.showMessageDialog(null, "Mes informado: " + descricao);
	}


	}


