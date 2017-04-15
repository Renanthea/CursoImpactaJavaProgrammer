package curso.java.classes.entidades;

import curso.java.classes.enumeracoes.Sexo;

public class Funcionario  extends Pessoa{
	
		
	private String cpf ;
	private String cargo;
	private double salario;
	
	//Construtores 
	
	public Funcionario(){
		
		super("N�o Informado");
		
	}
	
	public  Funcionario (String nome,						
						Sexo sexo,
						String cpf,
						int idade,						 
						String cargo,
						double salario){
		
		super(nome);
		
		//super.setNome(nome);		
		super.setSexo(sexo);
		super.setIdade(idade);		
		this.setCpf(cpf);
		this.setCargo(cargo);
		this.setSalario(salario);
		 
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf == null) {
			throw new NullPointerException("CPF n�o fornecido");
		}	
		
		if (cpf.length() != 11 ) {
			throw new IllegalArgumentException("CPF deve ter 11 d�gitos");
			
		}
		
		this.cpf = cpf;
						
	}
	
	public String getCargo() {
		return cargo;
	}
	
	
	public void setCargo(String cargo) {
		if (cargo == null) {
			throw new NullPointerException("Cargo n�o informado"); // Cria��o do Erro 
		}	
		
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
		if (salario < 937) {
			throw new IllegalArgumentException("Sal�rio Inferior ao sal�rio m�nimo"); // Cria��o do Erro 
		}	
		
	}
	
	
	@Override
	public String exibir(){
		String resultado = 	super.exibir() +
						    "\nDados do Funcionario : " +
						   	"\nMatricula : " + this.getCpf() +
						   	"\nCargo :  " + this.getCargo()+ 
						     "\nSalario " + this.getSalario();					  
						   
											
		return resultado;
	}
}
