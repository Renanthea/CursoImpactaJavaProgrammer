package curso.java.classes.aplicacao;

import curso.java.classes.threads.exercicios.ArquivosRunnable;

public class AppArquivosRunnable {

	public static void main(String[] args) {
		
		ArquivosRunnable tarefa = new ArquivosRunnable();
		Thread t1 = new Thread(tarefa, "Arquivo -1 ");
		Thread t2 = new Thread(tarefa, "Arquivo  2 ");
		
		t1.start();
		t2.start();

		
	}

}
