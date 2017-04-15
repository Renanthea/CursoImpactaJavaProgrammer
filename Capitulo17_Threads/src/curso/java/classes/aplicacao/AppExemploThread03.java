package curso.java.classes.aplicacao;

import curso.java.classes.threads.ExemploThread03;

public class AppExemploThread03 {

	public static void main(String[] args) {
		
		//Thread t1 /*<= essa é a  Thread*/ = new Thread(new ExemploThread03(),"Thread-Runnable" );
		ExemploThread03 tarefa = new ExemploThread03();
		
		Thread t1 = new Thread ( tarefa, "Thread-Runnable");
		Thread t2 = new Thread (tarefa,  "Thread-OutraTarefa");
				
		
		t1.start();
		t2.start();
		
		

	}
	
	
	

}
