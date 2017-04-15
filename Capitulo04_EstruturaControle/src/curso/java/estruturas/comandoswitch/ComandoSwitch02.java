package curso.java.estruturas.comandoswitch;

import javax.swing.JOptionPane;

public class ComandoSwitch02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  O usuario fornece um valor entre 1 e 12 , correspondente ao 
		 * m�s do ano . De acordo com o valor informado , o programa
		 * mostra o n�mero de  dias do  m�s. 
		 */
	
		int mes = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o m�s (1 a 12)"));
		
		if(mes <1 || mes > 12) { 
			JOptionPane.showMessageDialog(null, "M�s inv�lido");
			return;
		}
		
		int dias ;
		
		switch(mes){
		
		case 4:  
		case 6:  
		case 9: 
		case 11 : dias = 30;   break;	
		
		case 2  : dias = 28;   break;
		
				
	    default : dias = 31;
			
								
		}
		
		
		JOptionPane.showMessageDialog(null, "O M�s informado possui: " + dias  +  " dias");
	}


   }



 
