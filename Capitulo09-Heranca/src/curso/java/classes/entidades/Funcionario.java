package curso.java.classes.entidades;

public class Funcionario  extends Pessoa{
	
	
	
	private String cpf ;
	private String cargo;
	private double salario;
	
	
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
	
	public String exibir(){
		String resultado = 	super.exibir() +
						    "\nDados do Funcionario : " +
						   	"\nMatricula : " + this.getCpf() +
						   	"\nCargo :  " + this.getCargo()+ 
						     "\nSalario " + this.getSalario();					  
						   
											
		return resultado;
	}
}
