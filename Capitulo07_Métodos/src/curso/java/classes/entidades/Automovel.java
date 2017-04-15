package curso.java.classes.entidades;

public class Automovel {
	
	private String marca;
	private String modelo;
	private int ano;
	
	//Setter - Getter 
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Nossos Métodos 
	public void atribuir(String marca , String Modelo , int ano ){
		
		this.setMarca(marca);
		this.setModelo(Modelo);
		this.setAno(ano);			
		
	}	
	
public String exibir(){
		
	String resultado = "Marca: " + this.getMarca() +
					   "Modelo:  " + this.getModelo() + 
					   "Ano: " + this.getAno() ; 
	
	return resultado;
	
		
	}
	
}
