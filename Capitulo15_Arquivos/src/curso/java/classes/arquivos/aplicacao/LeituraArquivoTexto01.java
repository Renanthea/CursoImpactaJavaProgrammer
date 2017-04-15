package curso.java.classes.arquivos.aplicacao;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class LeituraArquivoTexto01 {

	public static void main(String[] args) {
		FileReader arquivo = null;
		
		try {
			arquivo = new FileReader(
					"C:\\Users\\di3616\\Documents\\Curso_JavaProgrammer\\pessoas.txt ");		
					
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				int ch = arquivo.read();
				if (ch==-1) {
					
				break;
					
				}
			sb.append ((char)ch);
				
			}			
			
			System.out.println(sb.toString());
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Eroo:" + e.getMessage());
			
		} finally{		
			
			try {
				arquivo.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
}
