package curso.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Endereco;
import curso.java.classes.entidades.Pessoa;
import curso.java.classes.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa ("Ricardo");
		
		p.setIdade(20);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av Paulista");
		endereco.setNumero(1009);
		endereco.setCidade("São Paulo");		
				
		
		try {
			
			p.setEndereco(endereco);//Este metodo deve ser protegido por que lança exceção verificada 
			Pessoa pessoa = new Pessoa("Jorge");
			
			pessoa.setIdade(-30);
			
			
			pessoa.setSexo(Sexo.MASCULINO);
			
			JOptionPane.showMessageDialog(null, pessoa.exibir());
		} catch (Exception e) {
			
			
			String erro = "Pilha de Erros: \n";
			for (StackTraceElement elemento : e.getStackTrace()) {
				erro += elemento.toString() + "\n";
			}
			erro += "Erro Gerado : " + e.getMessage();
			
					
			
			JOptionPane.showMessageDialog(null,erro);	
			
			
			//e.printStackTrace();
		}		

	}

}
