package curso.java.classes.novasclasses;

public class Aplicacao {
	public static void main(String[] args) {
		
		Automovel auto = new Automovel (); 
		auto.marca = "Ford";	
		auto.modelo = "Fiesta ";
		auto.ano = 2016;
		
		System.out.println(" Marca do carro é  : " + auto.marca);
		System.out.println(" Modelo do carro é : " + auto.modelo);
		System.out.println(" O Ano do carro é :  " + auto.ano);
	}

}
