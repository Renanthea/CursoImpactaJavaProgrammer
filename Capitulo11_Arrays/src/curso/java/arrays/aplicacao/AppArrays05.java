package curso.java.arrays.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Retangulo;

public class AppArrays05 {

	public static void main(String[] args) {
		//Exemplo 05: Array de retangulos 
		
		Retangulo [] retangulos = new Retangulo[4];
		
		

		for (int i = 0; i < retangulos.length; i++) {
		
		double base = Double.parseDouble(
					JOptionPane.showInputDialog("Informe a base do retangulo " + (i+1)));
		
		double altura = Double.parseDouble(
				JOptionPane.showInputDialog("Informe a altura do retangulo " + (i+1)));
		
		retangulos[i] = new Retangulo (base,altura);
			
		for (Retangulo retangulo : retangulos) {
			System.out.println(retangulo.exibirAreaDefault());
			System.out.println("--------------------");
		}
		
		/* JOptionPane.showMessageDialog(null, "base do retangulo : " + base +
				"base da altura : " + altura ); */

		
		}			
		
	
		

	}

}
