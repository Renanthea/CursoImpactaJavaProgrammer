package curso.java.classes.entidades;

import java.util.Formatter;
import java.util.Set;

import curso.java.classes.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	private Set<Disciplina> disciplinas;
	
	//Construtores
	public Aluno() {
		super("Não informado");
	}
	
	public Aluno(String nome, int idade, Sexo sexo, int matricula, String curso){
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
		String resultado = super.exibir() +
				           "\nDADOS DO ALUNO" +
				           "\nMatricula: " + this.getMatricula() +
				           "\nCurso: " + this.getCurso();
		if(this.getDisciplinas() != null && this.getDisciplinas().size() > 0){
			resultado += '\n' + listarDisciplinas();
		}
		
		return resultado;
	}
	
	//Método que retorna a lista de disciplinas, devidamente organizada
	public String listarDisciplinas(){
		String resultado;
		Formatter fmt = new Formatter();
		int chTotal = 0;
		
		resultado = fmt
			.format("%-6s %-20s %4s", "CODIGO", "DESCRIÇÃO", "CH")
			.toString();
		resultado += "\n--------------------------------\n";
		
		for (Disciplina disciplina : this.getDisciplinas()) {
			
			int tamanho = disciplina.getDescricao().length();
			fmt = new Formatter();
			resultado += fmt
					.format("%-6s %-20s %4s%n", 
							disciplina.getCodigo(),
							(tamanho > 20) ?
									disciplina.getDescricao().substring(0, 20) :
										disciplina.getDescricao(),
							disciplina.getCargaHoraria()).toString();
			chTotal += disciplina.getCargaHoraria();
			fmt.flush();
		}
	
		resultado += "--------------------------------\n";
		
		fmt = new Formatter();	
		resultado += fmt.format("%32s", chTotal);
		return resultado;
	}
	
}







