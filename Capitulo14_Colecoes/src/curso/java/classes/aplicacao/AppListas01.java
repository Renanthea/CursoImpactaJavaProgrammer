package curso.java.classes.aplicacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AppListas01 {

	public static void main(String[] args) {
		//Lista de nomes , cujos valores s�o fornecidos pelo usu�rio
		// O usu�rio fornece v�rios nomes . A inser��o termina quando
		//nenhum valor � digitado , ou quando a inser��o for cancelada
		
		List<String> nomes = new ArrayList<>();
		
		while (true) {
			String item = JOptionPane.showInputDialog("Informe um nome");
			if (item == null || item.trim().length() == 0 ) {
				break;
			}
			nomes.add(item);			
			
		}
		
		System.out.println("ListaOriginal");
		for (String nome : nomes) {
		System.out.println(nome);
		}
		System.out.println("------------------------------");
		String remove = 
				JOptionPane.showInputDialog(
						"Informe um nome para remover");
		
		if (nomes.contains(remove)) {
			
			nomes.remove(remove);
			System.out.println("ListaAtual");
			
			for (String nome : nomes) {
			System.out.println(nome);
			
			}
			System.out.println("------------------------------");	
			
		} else {
			JOptionPane.showInputDialog(
					"Esse nome n�o existe na lista");
		}
		

	}

}
