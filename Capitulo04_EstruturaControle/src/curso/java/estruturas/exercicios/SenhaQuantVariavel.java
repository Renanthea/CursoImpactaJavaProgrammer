package curso.java.estruturas.exercicios;
import java.util.Random;
import javax.swing.JOptionPane;

public class SenhaQuantVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
			
				String senha = "";
				
				
				int digitos = Integer.parseInt(
						 JOptionPane.showInputDialog("Quantos digitos?"));
				/*criar regra para quantidade de dígitos
				 * mínimo 1
				 * máximo 50
				 */
				
				if(digitos < 1 || digitos > 50){
					JOptionPane.showMessageDialog(null, "Tá de brincadera");
					return;
				}
				
				//gerar senha aleatoria
				for (int i = 0; i < digitos; i++) {		
					Random rnd = new Random();
					int valor = rnd.nextInt(25) + 65;
					senha += (char)valor;
				}
				JOptionPane.showMessageDialog(null, senha);
			}

		}
		
	


