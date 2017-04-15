package curso.java.classes.entidades;

	public class Humano {
		private String nome;
		private int idade;		
		private double peso;
		private double altura;
		
		
		//vamos definir o nosso proprio construtor
		
		public  Humano ( double peso , double altura){
			
			this.setPeso(peso);
			this.setAltura(altura);
										
		}
		
		public  Humano (String nome ,double peso , double altura ){
			
			this(peso,altura);
			this.setNome(nome);
		
			/* this.atributo
			 * this.metodo()
			 * this()
		  	 *			
		     */
			
		}
				
		
		public String getNome() {
			
			return (nome == null)? " Não Informado" : nome;
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
		
		public double getPeso() {
			return peso;
		}
		
		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		
		
		
		
}
