package curso.java.classes.threads;

public class ExemploThread02 extends Thread {
	@Override
	public  void  run(){
		
		
		String nome = Thread.currentThread().getName();
		
		try {
			

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread : " + nome);
			Thread.sleep(250);
		}
		}catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("Thread : " + nome);
		
	}

}
