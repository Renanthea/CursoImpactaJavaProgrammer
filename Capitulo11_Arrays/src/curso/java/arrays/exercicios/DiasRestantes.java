package curso.java.arrays.exercicios;

import javax.swing.JOptionPane;


	public class DiasRestantes {
		
		public static void main(String[] args) {
			
			/* o usuário fornece as informações: dia , mes e ano. 
			 * Com base nestas informações , o programa deve informar
			 * quantos dias restam para terminar o ano 
			 *
			 */
			
			
			while (true) {
				
				int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
				int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês ( 1 a 12)"));
				int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
				
				int[] dias = {31, ano % 4 ==0 ? 29 : 28 ,31,30,31,30,31,31,30,31,30,31};
				
				//validaçao do mês
				
				if (mes < 1 || mes >12) {
					JOptionPane.showMessageDialog(null,"Mês Inválido");
					return;
					
				}
				//validação do dia , levando em conta o mês
				if (dia <1 || dia > dias[mes-1]) {
					JOptionPane.showMessageDialog(null, "Dia inválido para o mês selecionado");
					return;
				}	
				
				//calculamos o numero de dias que restam para terminar o mês 
				int diasRestantes = dias[mes - 1 ] - dia;
				
				//calculamos a quantidade de dias dos meses seguintes 
				
				for (int i = mes; i < dias.length; i++) {
					
					diasRestantes += dias[i];
								
				}
				
				//Apresentação do resultado
				
				String resultado = "Dia : " + dia +
									"\nMes: " + mes + 
									"\nAno: " + ano + 
									"\n---------------" +
									"\nRestam: " + diasRestantes +"dias para terminar o ano";
				JOptionPane.showMessageDialog(null, resultado);					
				
				int opcao = JOptionPane.showConfirmDialog(null,
						"Deseja continuar", "Confirmação", JOptionPane.YES_NO_OPTION);
				
				if(opcao == JOptionPane.NO_OPTION){
					break;					
				}				
				
			}
				
		}

}
