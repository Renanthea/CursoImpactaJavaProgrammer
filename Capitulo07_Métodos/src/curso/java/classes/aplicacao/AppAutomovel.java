package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Automovel;


public class AppAutomovel {

	public static void main(String[] args) {
		Automovel auto = new Automovel();
		auto.atribuir("Mercedes ", " GLA ", 2018);
		JOptionPane.showMessageDialog(null,auto.exibir());
		
		
		
	}

}
