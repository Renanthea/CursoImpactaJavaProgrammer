package curso.java.classes.entidades;

public class Endereco  {
	private String logradouro;
	private int numero;
	private String cidade;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	public String exibir(){
		String resultado = "\nDados do Endereço : " +
						   "\nLogradouro : " + this.getLogradouro() +
						   "\nNumero: " + this.getNumero() +
				 	       "\nCidade: "  + this.getCidade() ;
						   
											
		return resultado;
		
		}	
	
	@Override
	public boolean equals (Object obj){
		
		if(obj instanceof Endereco){		
		Endereco end = (Endereco)obj;
		if(this.getLogradouro().equals(end.getLogradouro()) &&
				this.getNumero()==(end.getNumero()) &&
				this.getCidade().equals(end.getCidade())){
				return true;
				
			}									
			
		}
		return false;
	}
	@Override public String toString(){
		
		return this.getLogradouro() + " , " +
		this.getNumero() + " , " +
		this.getCidade();
		
	}
	
	
}
