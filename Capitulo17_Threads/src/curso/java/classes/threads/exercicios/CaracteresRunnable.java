package curso.java.classes.threads.exercicios;

public class CaracteresRunnable implements Runnable{

	@Override
	public void run() {
		mostrarNomeThread();
		
	}
	
	private synchronized void mostrarNomeThread(){	
	
		try {
			String nome = Thread.currentThread().getName();
			
			synchronized (this) { 
				for (int i = 0; i <10; i++) {
					System.out.println(nome);
					Thread.sleep(250);
				
			}
			/*for (int i = 0; i <10; i++) {
				System.out.println(nome);
				Thread.sleep(250); */
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
		
	

}
