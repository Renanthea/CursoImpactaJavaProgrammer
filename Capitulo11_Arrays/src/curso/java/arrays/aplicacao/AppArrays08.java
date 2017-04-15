package curso.java.arrays.aplicacao;

import java.util.Arrays;

import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Endereco;
import curso.java.classes.entidades.Funcionario;
import curso.java.classes.entidades.Pessoa;
import curso.java.classes.enumeracoes.Sexo;

public class AppArrays08 {

	public static void main(String[] args) {
		
		Pessoa [] pessoas = new Pessoa[10];
		
		
		pessoas[0] = new Pessoa("Luciano" , 43 , Sexo.MASCULINO);
		
		pessoas[1] = new Aluno ("Roberto" ,16 , Sexo.MASCULINO , 201236181 , "Sistemas de Informação");
		
		pessoas[2] = new Funcionario("Fernanda",  Sexo.FEMININO, "54581518181", 24 , "Administradora" , 1500);
		
		pessoas[3] = new Pessoa("Jose" , 65 , Sexo.MASCULINO);
		
		//Todas as "pessoas" deste array vivem no mesmo endereço (são irmãos)
		
	
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro("Av Sumare");
		endereco.setNumero(1250);
		endereco.setCidade("São Paulo");
		
		
		
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i].setEndereco(endereco);
		}
		
			
		
		
		//Ordenando a lista de pessoas		
		Arrays.sort(pessoas);		

		//Exibindo a lista de pesssoas
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i].exibir());
			System.out.println("---------------------");
		}
	}

}
