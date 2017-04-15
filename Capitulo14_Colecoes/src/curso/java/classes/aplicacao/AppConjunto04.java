package curso.java.classes.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import curso.java.classes.entidades.Endereco;

public class AppConjunto04 {

	public static void main(String[] args) {
		
		Set<Endereco> enderecos = new LinkedHashSet<>();
		System.out.println(enderecos.add(new Endereco("Av Paulista" , 1009 ,"São Paulo" )));
		System.out.println(enderecos.add(new Endereco("Av Radial Leste " , 1 ,"São Paulo" )));
		System.out.println(enderecos.add(new Endereco("Rua 25 de Março" , 250 ,"São Paulo" )));
		System.out.println(enderecos.add(new Endereco("Av Itaquera" , 164 ,"São Paulo" )));
		System.out.println(enderecos.add(new Endereco("Av Radial Leste " , 1 ,"São Paulo" )));
		
		for (Endereco endereco : enderecos) { //Para não duplicar 
											  // sobrescrever equals()
											  // sobrescrever hashCode()		
			System.out.println(endereco);
		}	
		
		System.out.println(enderecos); //Exibir elementos entre Colchetes ,
									// para uso de teste de visualização			
		
	}

}
