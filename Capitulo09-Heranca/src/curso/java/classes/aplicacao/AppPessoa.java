package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Endereco;
import curso.java.classes.entidades.Pessoa;
import curso.java.classes.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome (JOptionPane.showInputDialog( "Informe o Nome"));
		p.setIdade (Integer.parseInt(JOptionPane.showInputDialog( "Informe a idade")));	
		
		
		
		//p.setSexo(Sexo.FEMININO);
		Sexo sexo = (Sexo) JOptionPane.showInputDialog(null,
												"Informe o sexo ",
												"Sexo",
												JOptionPane.QUESTION_MESSAGE,
												null,
												Sexo.values(),
												Sexo.FEMININO);
		
		p.setSexo(sexo);
		
		Endereco end = new Endereco();
		end.setLogradouro("Av Paulista");
		end.setNumero(1009);	
		end.setCidade("São Paulo");
		
		p.setEndereco(end); //Nesta Instrução fazemos a referencia do atributo 
							//endereco para o objeto end criado
		
		JOptionPane.showMessageDialog(null, p.exibir());
		
	}

}

/* 


package curso.java.classes.aplicacao;

import javax.swing.JOptionPane;

import curso.java.classes.entidades.Endereco;
import curso.java.classes.entidades.Pessoa;
import curso.java.classes.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Olhonote de Fatima");
		p.setIdade(63);				
		p.setSexo(Sexo.FEMININO);
		
		Endereco end = new Endereco();
		end.setLogradouro("Av Paulista");
		end.setNumero(1009);	
		end.setCidade("São Paulo");
		
		p.setEndereco(end); //Nesta Instrução fazemos a referencia do atributo 
							//endereco para o objeto end criado
		
		JOptionPane.showMessageDialog(null, p.exibir());

	}

}


*/