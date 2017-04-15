package curso.java.classes.threads.exercicios;

import java.io.FileReader;

public class ArquivosRunnable implements Runnable {

	@Override
	public void run() {
		lerArquivo();
		
	}
	private synchronized void lerArquivo(){
		try {
			FileReader arquivo =
				new FileReader ("C:/Users/di3616/Documents/Curso_JavaProgrammer/aluno.txt");
			StringBuilder sb = new StringBuilder();
			
			String nome = Thread.currentThread().getName();
			System.out.println("\nThread em execução : " + nome);
			
			while (true) {
				
				int ch = arquivo.read();
				if (ch == -1) {
					break;
				}
				System.out.print((char)ch);
				sb.append((char)ch);
				Thread.sleep(100);
			}
		
		
			arquivo.close();
	}catch (Exception e) { 
		e.printStackTrace();
		
		}
	
	}

}
