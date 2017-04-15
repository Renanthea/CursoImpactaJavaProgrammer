package curso.java.classes.arquivos.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import curso.java.classes.entidades.Endereco;

public class LeituraArquivoTexto04 {

	public static void main(String[] args) {
		
	FileReader arquivo = null;
	List<Endereco> enderecos = new ArrayList<>();
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			arquivo = new FileReader("C:\\Users\\di3616\\Documents\\Curso_JavaProgrammer\\enderecos.txt");		
			
			
			BufferedReader buffer = new BufferedReader(arquivo);			
			
			while (true) {				
			
				String linha = buffer.readLine();
				if (linha == null) {
					break;
				}
				String[]elementos = linha.split(";");
				
				Endereco endereco = new Endereco ( 
						elementos [0], Integer.parseInt(elementos[1]),
						elementos[2]);
				
				enderecos.add(endereco);	
				
			}
			
			buffer.close();
			
			enderecos .stream()
			.sorted((s , t )-> s.getLogradouro().compareTo(t.getLogradouro()))
			.forEach(s-> System.out.println(s));
			
			System.out.println(enderecos);
			
			//enderecos.forEach(s -> System.out.println(s));
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Erro:" + e.getMessage());
			
		} finally{		
			
			try {
				if (arquivo!=null) {
								
				arquivo.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
}