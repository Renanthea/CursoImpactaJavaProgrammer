package curso.java.classes.arquivos.aplicacao;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Pessoa;

public class LeituraObjeto01 {

	public static void main(String[] args) {
		
		try {
			InputStream is = 
					new FileInputStream(
							"C:/Users/di3616/Documents/Curso_JavaProgrammer/pessoa.dat");
			
			
			ObjectInputStream ois = new ObjectInputStream(is);
			Pessoa p = (Pessoa)ois.readObject();
			JOptionPane.showMessageDialog(null, p.exibir());
			
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		
	}

}
