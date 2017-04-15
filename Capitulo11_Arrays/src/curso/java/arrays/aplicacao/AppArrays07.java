package curso.java.arrays.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArrays07 {

	public static void main(String[] args) {
		// Exemplo 04 : Lista de Nomes , cuja quantidade é fornecida
		// pelo usuário

		int quantidade = Integer.parseInt(JOptionPane
				.showInputDialog("Informe a quantidade de nomes "));

		String[] nomes = new String[quantidade];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog(" Informe o nome  "
					+ (i + 1));

		}

		// Mostrar todos os nomes

		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("---------------------");

		// Lista de Nomes em ordem alfabetica
		
		Arrays.sort(nomes); // Lista de elementos cuja classe implementa 
							// Comparable obj.CompareTo(obj b ) 

		for (String nome : nomes) {

			System.out.println(nome);
		}

		System.out.println("---------------------");

	}

}
