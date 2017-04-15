package curso.java.classes.arquivos.aplicacao;

import java.io.File;

public class AppClasseFile {

	public static void main(String[] args) {
		
		
		try {
			
			File file = new File("C:/Windows/");
			String[] arquivos = file.list();			
			
			
			for (String item : arquivos){
				
				File elemento = new File(("C:/Windows/" + item));				
				
				
				if (!elemento.isHidden()){
					if (elemento.isFile()) {					
					
					System.out.println("[Arquivo]: " + item);
					
					}
					
				}else{
					System.out.println("[pasta]: "   + item);
					
				}
				
				
				
				
				System.out.println(item);
				
			}			
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
