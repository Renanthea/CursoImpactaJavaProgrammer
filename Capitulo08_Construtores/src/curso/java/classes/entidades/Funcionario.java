package curso.java.classes.entidades;

import java.text.NumberFormat;

public class Funcionario {
	private String cpf;
	private String nome;  //Atributos da Classe ou variavel de instância 
	private String cargo;
	private double salario;
	
public  Funcionario ( String cpf , String nome , String cargo , double salario ){
		
		this.setCpf(cpf);	
		this.setNome(nome);	
		this.setCargo(cargo);	
		this.setSalario(salario);	
				
	}






	
	
	public String getCpf() {
		if(this.cpf.length() == 11 ){
		
			String p1 = cpf.substring(0, 3);
			String p2 = cpf.substring(3, 6);
			String p3 = cpf.substring(6, 9);
			String digito = cpf.substring(9);
			return p1 + "." + p2 + "." + p3 +  "." + digito ;
		}
		
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public String exibir(){	
			
		return exibir ("Dados do Funcionario");
				
	}
	
public String exibir(String titulo){
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();		
		
		String resultado = titulo + 
						   "\nCpf: " + this.getCpf() +
						   "\nNome:  " + this.getNome() + 
						   "\nCargo: " + this.getCargo()+ 
						   "\nSalario: " +  nf.format(this.getSalario()); 
		
		return resultado;	
								
	}

				

}
