package curso.java.classes.aplicacao;

import curso.java.classes.threads.exercicios.CaracteresRunnable;

public class AppCaracteresRunnable {

	public static void main(String[] args) {
		
		
				CaracteresRunnable tarefa = new CaracteresRunnable ();
				
				Thread t1 = new Thread ( tarefa, "Thread1");
				Thread t2 = new Thread (tarefa,  "Thread2");
						
				
				t1.start();
				t2.start();
				
				

			}
		}
