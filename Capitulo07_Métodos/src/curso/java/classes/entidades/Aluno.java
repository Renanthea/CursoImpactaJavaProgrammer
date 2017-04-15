package curso.java.classes.entidades;

public class Aluno {
	private int matricula;
	private String nome;
	private String curso;
		
	//métodos para receber valores para os atributos
	public void atribuirMatricula(int matricula){
	
		if(matricula <=0){
			this.matricula = 1;
		}else {
			this.matricula =  matricula;
		}	
	}
	 public void atribuirNome(String nome){
			this.nome =  nome;
		}
	 
	 public void atribuirCurso(String curso){
			this.curso =  curso;
		} 	
	 
	//Método para receber os três valores simultaneamente 
		public void atribuir (int m , String n , String c){
			
			this.atribuirMatricula(m);
			this.atribuirNome(n);
			this.atribuirCurso(c);	
			
		}	 
	
	//Métodos para mostrar os valores dos atributos
	public void mostrarMatricula(){
		System.out.println(this.matricula);
		
	}	 	 
		public void mostrarNome(){
		System.out.println(this.nome);
			
	}
	
		//métodos para mostrar os valores dos atributos 	
		public void mostrar(){
			System.out.println("Matricula: " + this.matricula);
			System.out.println("Nome: " + this.nome);
			System.out.println("Curso: " + this.curso);
			
		}		
	
		public String exibir(){
		String resultado = "Matricula: " + this.matricula +
				 	       "\nNome: "  + this.nome + 
						   "\nCurso:   " + this.curso;
											
		return resultado;
		
	}	
	
 }	
	
	/* Agnostica: 
	 * 
	 * public void mostrarCurso(){
		System.out.println(curso);		
	}	

	public void mostrarNome(){
		System.out.println(nome);		
    }
	
	public void mostrarMatricula(){
		System.out.println(matricula);
	}
	
	*/		
	