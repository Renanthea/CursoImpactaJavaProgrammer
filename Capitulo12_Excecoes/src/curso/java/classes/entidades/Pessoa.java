package curso.java.classes.entidades;

import curso.java.classes.enumeracoes.Sexo;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	
	public Pessoa(String nome){
		
		this.setNome(nome);
	}
	
	public Pessoa(String nome ,int idade ){
		this.setNome(nome);
		this.setIdade(idade);
				
	}
	public Pessoa (String nome,Sexo sexo){
		this.setNome(nome);
		this.setSexo(sexo);
	}
	public Pessoa (String nome, int idade , Sexo sexo){
		
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}
	
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
		
		if (idade < 0) {
			throw new NumberFormatException("Idade não pode ser negativa ");
		}
		
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
	
	public void setEndereco(Endereco endereco) throws Exception  {
		
		if (endereco== null) {
			
			throw new Exception("O Endereço não pode ser nulo");
			
		} 
		
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
	
	@Override
	public boolean equals (Object obj){
		
		if(obj instanceof Pessoa){
		Pessoa p =(Pessoa)obj;	
		if(this.nome.equals(p.getNome()) &&
			this.getIdade() == p.getIdade()
			&& this.getSexo().equals(p.getSexo()));
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		
		return this.getNome() + " , " + this.getIdade() + " , " + this.getSexo();
		
		}

	@Override
	public int compareTo(Pessoa o) {
		
		
		return this.getNome().compareTo(o.getNome());
	}

}
