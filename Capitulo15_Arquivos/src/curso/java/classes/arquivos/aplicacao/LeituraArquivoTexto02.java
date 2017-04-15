package curso.java.classes.arquivos.aplicacao;

import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LeituraArquivoTexto02 {

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
				if (arquivo!=null) {
								
				arquivo.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
}
