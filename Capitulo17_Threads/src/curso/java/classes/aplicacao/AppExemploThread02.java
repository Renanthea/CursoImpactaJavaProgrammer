package curso.java.classes.aplicacao;

import curso.java.classes.threads.ExemploThread02;

public class AppExemploThread02 {

	public static void main(String[] args) {
		
		String nome = Thread.currentThread().getName();
		
		System.out.println("Thread : " +nome);
		
		ExemploThread02 t1 = new ExemploThread02();
		t1.setName("Xuxu");
		t1.setPriority(Thread.MIN_PRIORITY); //1
		
		ExemploThread02 t2 = new ExemploThread02();
		t2.setName("Abobrinha");
		t2.setPriority(Thread.MAX_PRIORITY); //10 
		
		t1.start();
		t2.start();		

	}

}
