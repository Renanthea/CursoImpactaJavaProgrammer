package curso.java.classes.arquivos.aplicacao;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GravacaoArquivoTexto01 {
	public static void main(String[] args) {
		
		try {
			FileWriter arquivo = new FileWriter ("C:\\Users\\di3616\\Documents\\Curso_JavaProgrammer\\GerarArquivo.txt ");
			
			JOptionPane.showMessageDialog(null, "Arquivo Criado");
			arquivo.write(" Mais Conteúdo para o arquivo");
			arquivo.write("\r\nArquivo Texto");
			arquivo.close ();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
