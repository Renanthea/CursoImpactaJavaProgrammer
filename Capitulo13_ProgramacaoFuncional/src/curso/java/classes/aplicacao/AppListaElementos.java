package curso.java.classes.aplicacao;

import curso.java.classes.entidades.ListaElementos;
import curso.java.classes.entidades.Retangulo;


public class AppListaElementos {

	public static void main(String[] args) {
		
		//Objeto lista1 , parametrizado para String
		ListaElementos<String> lista1 = new ListaElementos<>(); // Omiss�o do par�metro
																//Disponivel no Java 7
		
		String [] nomes = {"Joao" ,"Elza" , "Marlene " ,"Arlete" };
		lista1.atribuirArray(nomes);		
		
		//Objeto lista2, parametrizado para Retangulo
		ListaElementos<Retangulo> lista2 = new ListaElementos<>();
		
		Retangulo[] retangulos = {new Retangulo(2,3) ,
								  new Retangulo (5,5),
								  new Retangulo (9,2)};			
		
	
		lista2.atribuirArray(retangulos);
	
		//Listando os elementos de cada objeto
		
		System.out.println("Lista de String");
		for (String nome: lista1.listarArray()) {
			System.out.println(nome);
		//Condi��o : elemento que inicie com a letra "A"
			System.out.println("Elementos iniciando com A");
			String busca = lista1.Buscar(s -> s.equals("A")); //startsWith
			System.out.println(busca);			
			
		}
		
		System.out.println("-------------------");
		System.out.println("-------------------");
				
		System.out.println("Lista de Retangulo");
		for (Retangulo retangulo : lista2.listarArray()){
		System.out.println(retangulo);	
			
		}  
		
		//Condi��o: elemento cuja base seja igual � (formando um quadrado)
		System.out.println("---Elemento que represente um quadrado:");
		Retangulo ret = lista2.Buscar( s -> s.getBase() == s.getAltura());
		System.out.println(ret);
		
		
		
	}

}
