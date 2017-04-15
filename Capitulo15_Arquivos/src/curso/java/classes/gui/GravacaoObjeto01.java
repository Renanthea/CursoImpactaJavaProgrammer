package curso.java.classes.gui;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Endereco;
import curso.java.classes.entidades.Pessoa;
import curso.java.classes.enumeracoes.Sexo;

public class GravacaoObjeto01 {

	public static void main(String[] args) {
		
		/*		 
		 * Vamos Criar um objeto da classe Pessoa, 
		 * e armazená-lo em um arquivo.		 * 
		 */
		
		Pessoa pessoa = new Pessoa("Renan " , 20 , Sexo.MASCULINO);
		
		Endereco endereco = new Endereco("AV Paulista",20 , "São Paulo");
		
		pessoa.setEndereco(endereco);
		
		try {
			
		  OutputStream fos = 
				  new FileOutputStream("C:/Users/di3616/Documents/Curso_JavaProgrammer/pessoa.dat");

		  
		  ObjectOutputStream oos = new  
				  ObjectOutputStream(fos);
		  
		  
		  
		  oos.writeObject(pessoa);
		  oos.close();
		  JOptionPane.showMessageDialog(null,"Objeto armazenado com sucesso");
		  
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
		

	}

}
