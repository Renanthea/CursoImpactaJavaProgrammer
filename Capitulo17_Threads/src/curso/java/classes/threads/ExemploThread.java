package curso.java.classes.threads;

public class ExemploThread extends Thread {
	
	@Override
	public void run(){
	
	try {
		for (int i = 0; i <50; i++) {
			
			System.out.print("*");
			Thread.sleep(250);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		//	System.out.println("Exemplo Thread Criado");
		
	
		
		
		
	}
	
	

}
