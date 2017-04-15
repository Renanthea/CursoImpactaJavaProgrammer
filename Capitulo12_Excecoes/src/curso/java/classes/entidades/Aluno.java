package curso.java.classes.entidades;

import curso.java.classes.enumeracoes.Sexo;


public class Aluno  extends Pessoa{
	
	//Construtores
	
	public Aluno(){
		
		super("Não Informado");
		
	}
	
	public Aluno(String nome , int idade , Sexo sexo , int matricula,String curso){
		
			super(nome);
			//super.setNome(nome);
			super.setIdade(idade);
			super.setSexo(sexo);
			this.setMatricula(matricula);
			this.setCurso(curso);
		
	}
	
	private int matricula ;
	private String curso;
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String exibir(){
		String resultado = 	super.exibir() +
						   "\nDados do Aluno : " +
						   "\nMatricula : " + this.getMatricula() +
						   "\nCurso :  " + this.getCurso();					  
						   
											
		return resultado;
	
	
	} 

}
