package curso.java.classes.entidades;

import java.io.Serializable;

import curso.java.classes.enumeracoes.Sexo;

public class Pessoa implements Comparable<Pessoa>, Serializable {

	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	//construtores
	public Pessoa(String nome){
		this.setNome(nome);
	}
	public Pessoa(String nome, int idade){
		this(nome);
		this.setIdade(idade);
	}
	public Pessoa(String nome, Sexo sexo){
		this(nome);
		this.setSexo(sexo);
	}
	public Pessoa(String nome, int idade, Sexo sexo){
		this(nome, idade);
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
		String resultado = "DADOS DA PESSOA" +
	                       "\nNome: " + this.getNome() +
	                       "\nIdade: " + this.getIdade() +
	                       "\nSexo: " + this.getSexo();
	                       
						   if(this.getEndereco() != null){	
							   resultado += "\n" + this.getEndereco().exibir();
						   }
		
		return resultado;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Pessoa){
			Pessoa p = (Pessoa)obj;
			if(this.getNome().equals(p.getNome()) && 
					this.getIdade() == p.getIdade() && 
					this.getSexo().equals(p.getSexo()))
				return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return this.getNome() + ", " + this.getIdade() + ", " + this.getSexo();
	}
	@Override
	public int compareTo(Pessoa o) {		
		return this.getNome().compareTo(o.getNome());
	}
}








