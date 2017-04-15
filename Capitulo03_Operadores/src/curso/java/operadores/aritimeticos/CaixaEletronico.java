package curso.java.operadores.aritimeticos;

import javax.swing.JOptionPane;


public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int cedula50 , cedula20, cedula10 ,  cedula5 ; 
		cedula50 = cedula20 = cedula10 =  cedula5 = 0 ; 
		
		
		
		 int valor = 1000;
		 cedula50  = valor/50 ; 				
		 valor     %=  50 ; 
		
		
		 cedula20  = valor/20 ; 				
		 valor     %=  20; 
		 
		 
		 cedula10  = valor/10 ; 				
		 valor     %=  10 ; 
		 
	
		 cedula5  = valor/5;
		 
		 //Prepararando o resultado 
		 
		 String resultado = " CÉDULAS DISPENSADAS: "+
				 			"\n Nota de 50 :   " + cedula50 + 
				 			"\n Nota de 20 :   " + cedula20 + 
				 			"\n Nota de 10 :   " + cedula10 + 
				 			"\n Nota de  5 :   " + cedula5 ; 
		 
		 
		 JOptionPane.showMessageDialog(null, " o resultado é  = "  + resultado );
		 
		 
		 
		 
		 
				
		
		
		
		

	}

}
