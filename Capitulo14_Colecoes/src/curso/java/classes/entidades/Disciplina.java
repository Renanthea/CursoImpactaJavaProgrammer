package curso.java.classes.entidades;

public class Disciplina {
	
	
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	
	public Disciplina(int codigo , String descricao , int cargaHoraria){
		
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
				
	}
	
	public int getCodigo() {
		return codigo;}	
	
	
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
		this.cargaHoraria= cargaHoraria;
	}
	
	

}
