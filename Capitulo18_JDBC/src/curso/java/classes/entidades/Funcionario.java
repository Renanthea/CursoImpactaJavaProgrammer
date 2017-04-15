package curso.java.classes.entidades;

import curso.java.classes.enumeracoes.Sexo;

public class Funcionario extends Pessoa {
	private String cpf;
	private String cargo;
	private double salario;
	
	//Construtores
	public Funcionario() {
		super("Não informado");
	}
	
	public Funcionario(String nome, 
			           int idade, 
			           Sexo sexo, 
			           String cpf, 
			           String cargo, 
			           double salario) {
		super(nome);
		//super.setNome(nome);
		super.setIdade(idade);
		super.setSexo(sexo);
		this.setCpf(cpf);
		this.setCargo(cargo);
		this.setSalario(salario);		
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	@Override
	public String exibir(){
		String resultado = super.exibir() +
				           "\nDADOS DO FUNCIONARIO" +
				           "\nCpf: " + this.getCpf() +
				           "\nCargo: " + this.getCargo() +
				           "\nSalario: " + this.getSalario();
		return resultado;
	}
}
