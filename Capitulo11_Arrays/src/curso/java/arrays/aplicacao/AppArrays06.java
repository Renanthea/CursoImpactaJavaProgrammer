package curso.java.arrays.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Retangulo;

public class AppArrays06 {

	public static void main(String[] args) {
		
		
		//Exemplo 06 : Array de Retangulos 
		
		Retangulo [] retangulos = new Retangulo[4];
		
		
		Retangulo ret = new Retangulo(0,0);
				
				
		// O usuário fornece valores para a base e a altura de cada retangulo 
		for (int i = 0; i < retangulos.length; i++) {
				
		double base = Double.parseDouble(
					  JOptionPane.showInputDialog("Informe a base do retangulo " + (i+1)));
				
		double altura = Double.parseDouble(
						JOptionPane.showInputDialog("Informe a altura do retangulo " + (i+1)));
		
		ret.setBase(base);
		ret.setAltura(altura);
		
		retangulos[i] = ret;
		
		} 			
		for (Retangulo retangulo : retangulos) {
		System.out.println(retangulo.exibirAreaDefault());
		System.out.println("--------------------");
			}
		/*Neste Exemplo , consideramos um único obejto sendo referenciado por 
		 * todas as posições do array . Essa prática não é recomendada pois
		 * estariamos afirmando que todos os itens do array se referem ao mesmo 
		 * elemento, e não a elementos distintos		 
		 * 		
		 */
				/* JOptionPane.showMessageDialog(null, "base do retangulo : " + base +
						"base da altura : " + altura ); */

				
		}		
		
	  		

}


