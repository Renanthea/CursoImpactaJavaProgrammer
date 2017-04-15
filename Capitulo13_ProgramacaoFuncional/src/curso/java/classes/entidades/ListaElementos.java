package curso.java.classes.entidades;

import curso.java.interfaces.Validacao;

public class ListaElementos <T> {
	
	private T[] elementos;
	
	/*public ListarElementos(String T[]){
		
				
		this.T[] elementos = T[] elementos  
		
			}
	*/
	
	public void atribuirArray(T[] elementos){
		
		this.elementos = elementos;		
		
	}
	
	public T[] listarArray(){
		
		return elementos;
		
	}	
	
	public T Buscar (Validacao<T> item){
		for (T elemento : elementos) {
			if (item.validar(elemento)){
			return elemento;
				
			
			}
			
		}
		
		return null;
	}

}
