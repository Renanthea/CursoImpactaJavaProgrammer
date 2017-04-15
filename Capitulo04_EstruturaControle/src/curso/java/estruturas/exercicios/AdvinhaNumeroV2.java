package curso.java.estruturas.exercicios;

import javax.swing.JOptionPane;


public class AdvinhaNumeroV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
				
				int tentativas = 0;
				int gerado = (int)(Math.random() * 100);
				int fornecido = 0;
				int max = 100, min = 0;
				
				do {
					tentativas++;
					
					fornecido = Integer.parseInt(
							JOptionPane
							.showInputDialog("Fornecer um numero entre "+min+" e "+max));
					
					if(fornecido < min || fornecido > max){
						continue;
					}
					
					if(fornecido > gerado){
						JOptionPane.showMessageDialog(null, "O n�mero deve ser menor");
						max = fornecido-1;
					}else if(fornecido < gerado){
						JOptionPane.showMessageDialog(null, "O n�mero deve ser maior");
						min = fornecido+1; 
					}
				} while(gerado != fornecido);
				
				JOptionPane.showMessageDialog(null, "Voc� acertou em " + 
							tentativas + " tentativas");
			
	}		

}
