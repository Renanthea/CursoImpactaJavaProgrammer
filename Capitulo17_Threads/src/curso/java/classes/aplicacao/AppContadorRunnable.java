package curso.java.classes.aplicacao;

import curso.java.classes.threads.exercicios.ContadorRunnable;

public class AppContadorRunnable {

	public static void main(String[] args) {
		
		ContadorRunnable tarefa  = new ContadorRunnable();
		Thread t = new Thread(tarefa); //estado new (1)
		t.start(); //estado pronto (ready to rub) (2)
		
		synchronized (t) { //estado blocked (5)
			
			try {
				System.out.println("Aguardando");
				t.wait(); //estado suspended (4)
				
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Valor de contador: " + tarefa.contador);
		}	
		
	}

}
