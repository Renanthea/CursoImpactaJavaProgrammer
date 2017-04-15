package curso.java.classes.aplicacao;

public class AppExemploLambda {

	public static void main(String[] args) {
		
		Thread t = new Thread (() -> { 
			String nome = Thread.currentThread().getName();
			System.out.println("Thread com empr.lambda: " + nome);		
	});
	t.start();

	}
}
