package curso.java.classes.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Funcionario;
import curso.java.classes.entidades.Pessoa;
import curso.java.classes.enumeracoes.Sexo;

public class AppListas03 {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("josivaldo",50, Sexo.MASCULINO));
		pessoas.add(new Funcionario ("Antonio" ,Sexo.MASCULINO,"12345678900" ,50 , "motorista",15000));
		pessoas.add(new Aluno ("Claudia",47 , Sexo.FEMININO, 15210 , "TI"));
		
		Collections.sort(pessoas);
		
		pessoas.forEach(s -> {
			
		System.out.println(s.exibir());
		System.out.println("-----------------");
		
		});
		

	}

}
