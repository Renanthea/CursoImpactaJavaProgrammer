package curso.java.classes.p2;

import curso.java.classes.p1.Classe1;

public class Classe2 extends Classe1{
	public void metodo(){
		System.out.println(x); //acessamos x por causa da heran�a
		
		Classe1 c1 = new Classe1();
		//c1.x = 10; //Nesse caso, n�o podemos acessar x porque trata-se
		  			 //de uma instancia de Classe1, n�o de heran�a
	}
}
