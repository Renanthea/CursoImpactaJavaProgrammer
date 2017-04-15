package curso.java.classes.novasclasses.encapsulamento;

public class Automovel {
	
	private String marca;
	private	String modelo;
	private int ano;

	public static void main(String[] args) {
		Automovel auto = new Automovel();
		auto.marca  = "VW";
		auto.modelo = "Gol";
		auto.ano = 2000;
		
		System.out.println(auto.marca);
		System.out.println(auto.modelo);
		System.out.println(auto.ano);
	}
	

}
    /*
	String marca = Default : Acessivel por classes do mesmo pacote 
	public String marca = Public : acesso irerestrito
	private String marca =  Acesso excluisivo da classe que o denifir
	protected String marca = Protected acesso pela própria classe e por classes descendentes (subclasses)
	
	*/
	
	