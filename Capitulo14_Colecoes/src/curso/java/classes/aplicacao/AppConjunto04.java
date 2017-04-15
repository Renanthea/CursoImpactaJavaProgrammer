package curso.java.classes.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import curso.java.classes.entidades.Endereco;

public class AppConjunto04 {

	public static void main(String[] args) {
		
		Set<Endereco> enderecos = new LinkedHashSet<>();
		System.out.println(enderecos.add(new Endereco("Av Paulista" , 1009 ,"S�o Paulo" )));
		System.out.println(enderecos.add(new Endereco("Av Radial Leste " , 1 ,"S�o Paulo" )));
		System.out.println(enderecos.add(new Endereco("Rua 25 de Mar�o" , 250 ,"S�o Paulo" )));
		System.out.println(enderecos.add(new Endereco("Av Itaquera" , 164 ,"S�o Paulo" )));
		System.out.println(enderecos.add(new Endereco("Av Radial Leste " , 1 ,"S�o Paulo" )));
		
		for (Endereco endereco : enderecos) { //Para n�o duplicar 
											  // sobrescrever equals()
											  // sobrescrever hashCode()		
			System.out.println(endereco);
		}	
		
		System.out.println(enderecos); //Exibir elementos entre Colchetes ,
									// para uso de teste de visualiza��o			
		
	}

}
