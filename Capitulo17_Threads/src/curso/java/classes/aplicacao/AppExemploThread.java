package curso.java.classes.aplicacao;

import curso.java.classes.threads.ExemploThread;


public class AppExemploThread {

	public static void main(String[] args) {
		
		ExemploThread t1 = new ExemploThread();
		t1.start();
		
		
		try {
			for (int i = 0; i <50; i++) {
				
				System.out.print("-");
				Thread.sleep(250);
			}
			
						
		} catch (Exception e) {
			e.printStackTrace();
	}		
		//t1.run();

	}

}
