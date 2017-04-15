package curso.java.classes.threads;

public class ExemploThread03 implements Runnable {

	@Override
	public void run() {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println("Thread : " +nome);
		
				
	}
	
	
	
	

}
