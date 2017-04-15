package curso.java.estruturas.estruturawhile;

import java.util.Random;

import javax.swing.JOptionPane;

public class SenhaAlfaNumerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senha = " ";
		for ( int i = 0 ; i < 8; i++  ){
			Random rnd = new Random();
			int valor = rnd.nextInt(25)+65;
			senha += (char)valor;		
			
		}
		JOptionPane.showMessageDialog(null,senha);

	}

}
