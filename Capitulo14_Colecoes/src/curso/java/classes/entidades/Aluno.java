package curso.java.classes.entidades;

import java.util.Formatter;
import java.util.Set;

import curso.java.classes.enumeracoes.Sexo;


public class Aluno  extends Pessoa{
	
	
	private int matricula;
	private String curso;	
	
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
	
	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	

	private Set<Disciplina> disciplinas;
	
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
		
		if(this.getDisciplinas() != null && this.getDisciplinas().size()>0){
			resultado += " \n" + listarDisciplinas();
			
		}						   
											
		return resultado;	
	
	} 
	
	//Método que retorna a lista de discplinas , devidamente organizada
	
	public String listarDisciplinas(){
		
		String resultado;		
		Formatter fmt = new Formatter (); //Important
		
		int chTotal = 0 ; 
		resultado = 
				fmt
				.format("%-6s %-20s %4s", "CODIGO" , "DESCRICAO" , "CH" )
				.toString();
		resultado += "\n--------------------------------\n";
		
		for (Disciplina disciplina : this.getDisciplinas()) {
			fmt = new Formatter ();
			resultado += fmt
					.format("%-6s %-20s %4s%n", 
							disciplina.getCodigo(),
							disciplina.getDescricao(),
							disciplina.getCargaHoraria()).toString();		
			chTotal+= disciplina.getCargaHoraria();
			fmt.flush();
			
		}
		
		resultado +="-------------------------------------\n";
		fmt = new Formatter();
		resultado += fmt.format("%32s", chTotal);
		return resultado;		
	
		
		}

}
