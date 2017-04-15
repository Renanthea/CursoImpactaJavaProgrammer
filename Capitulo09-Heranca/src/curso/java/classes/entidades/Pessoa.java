package curso.java.classes.entidades;

import curso.java.classes.enumeracoes.Sexo;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
		
	
	public String exibir(){
		String resultado = "\nDados da Pessoa" + 
							"\nNome : " + this.getNome()+
						   "\nIdade: " + this.getIdade() +
				 	       "\nSexo: "  + this.getSexo() 
				 	       ;
							
				 	       
				 	      if(this.getEndereco() != null){
				 	    	  
				 	    	  resultado += "\n " + this.getEndereco().exibir();					 	     
				 	      }
				 	      
		return resultado;
	}

}
