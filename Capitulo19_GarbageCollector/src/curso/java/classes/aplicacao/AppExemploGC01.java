package curso.java.classes.aplicacao;

public class AppExemploGC01 {
	public static void main(String[] args) {
		
		String s1 = "Java"; //(1)
		String s2 = "Java"; //(2)
		System.out.println(s1 == s2);
		
		s1 = null; //(3)
		System.out.println(s1 == s2);
		
		s1 = "Java"; //(4)
		System.out.println(s1 == s2);
		
		String s3 = new String("Android"); //(5)
		String s4 = new String("Android"); //(6)
		System.out.println(s3 == s4);
		
		s3 = null;
		s3 = "Android";
		System.out.println(s3 == s4);
		/*
		 * A variável se recuperou o valor do objeto "Android"
		 * porque o JVM mantém um pool de String na memória
		 * HEAP. Esse pool permite que uma String existente
		 * seja recuperada quando perder sua referencia.
		 */
		
//		s3 = null;
//		s4 = null;
//		System.out.println(s3 == s4);
		
		
		
	}
}
