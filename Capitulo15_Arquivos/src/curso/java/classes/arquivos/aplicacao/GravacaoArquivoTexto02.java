package curso.java.classes.arquivos.aplicacao;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GravacaoArquivoTexto02 {
	
	public static void main(String[] args) {
		
		FileWriter arquivo =  null;
		try {			
			
			arquivo = new FileWriter (
					"C:\\Users\\di3616\\Documents\\Curso_JavaProgrammer\\pessoas.txt ");
			
			//Lista de Pessoas 
			while (true) {
				
				String nome = JOptionPane.showInputDialog("Informe um nome");
				arquivo.write(nome + "\r\n");
				
				int opcao = JOptionPane.showConfirmDialog(null,
						"Deseja continuar ?" , "Confirmação" , JOptionPane.YES_NO_OPTION);
				if	( opcao == JOptionPane.NO_OPTION){
					break;
			
				}
		
			}	
			
			
		JOptionPane.showMessageDialog(null,"Arquivo Criado");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally { 
			//o conteúdo deste bloco é sempre executado , independente de 
			// o bloco tray ou o bloco catch serem executados
			try {
				arquivo.close();
				
			} catch (Exception e) {
				
			}		
			
		}		
	}
}