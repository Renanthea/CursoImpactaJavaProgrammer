package curso.java.classes.arquivos.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LeituraArquivoTexto03 {

	public static void main(String[] args) {
	FileReader arquivo = null;
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			JFileChooser chooser = new JFileChooser();
			
			int opcao = chooser.showOpenDialog(null);
			
			if (opcao == JFileChooser.CANCEL_OPTION) {
				
				return;
								
			}
			
				
			
			arquivo = new FileReader(chooser.getSelectedFile());
			
			BufferedReader buffer = new BufferedReader(arquivo);
			
			StringBuilder sb = new StringBuilder();
			
			
			while (true) {				
			
				String linha = buffer.readLine();
				if (linha == null) {
					break;
				}
				sb.append(linha);
				sb.append("\r\n");
			}
			buffer.close();
			System.out.println(sb.toString());
			
			
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