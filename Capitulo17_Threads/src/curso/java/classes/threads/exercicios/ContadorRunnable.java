package curso.java.classes.threads.exercicios;

public class ContadorRunnable  implements Runnable{

	
	public int contador;
	@Override
	public void run() { //estado en execução (running) (3)
		
		synchronized (this) {
			
		
		for (int i = 0; i < 200; i++) {
			contador += 1;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		notify(); // Estado: resumo (6) 
	   }
		
	}//Estado : terminated

}
