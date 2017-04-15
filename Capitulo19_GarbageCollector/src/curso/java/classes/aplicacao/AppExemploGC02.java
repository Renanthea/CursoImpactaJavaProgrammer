package curso.java.classes.aplicacao;

public class AppExemploGC02 {
	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		System.out.println("Memoria Total (antes de GC): " + runtime.totalMemory());
		//runtime.gc();
		System.gc(); //solicita a prioridade na limpeza da memoria HEAP
		System.out.println("Memoria Total (após GC): " + runtime.totalMemory());
		
		System.out.println("Memoria Livre (antes): " + runtime.freeMemory());
		
		StringBuilder sb = new StringBuilder();		
		for (int i = 0; i < 100000000; i++) {
			sb = new StringBuilder();
			sb = null;
		}
		System.out.println("Memoria Livre (após): " + runtime.freeMemory());
		System.gc();
		System.out.println("Memoria Livre (após GC): " + runtime.freeMemory());
	}
}
