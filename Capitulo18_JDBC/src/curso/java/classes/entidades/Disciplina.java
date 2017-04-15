package curso.java.classes.entidades;

import java.util.Date;

public class Disciplina {
	
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private Date dataMatricula;
	private Aluno aluno;
	
	//construtor
	public Disciplina(int codigo, String descricao, int cargaHoraria){
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
	}
	
	public Disciplina(int codigo, String descricao, int cargaHoraria, Date data, Aluno aluno){
		this(codigo,descricao,cargaHoraria);
		this.setDataMatricula(data);
		this.setAluno(aluno);
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
}
