package curso.java.classes.dao.repositorio;

import curso.java.classes.dao.AlunoDao;
import curso.java.classes.dao.DisciplinaDao;

public final class Repositorio {
	
	static AlunoDao alunoDao;
	static DisciplinaDao disciplinaDao;
	
	public static AlunoDao getAlunoDao(){
		if(alunoDao == null){
			alunoDao = new AlunoDao();
		}
		return alunoDao;
	}
	
	public static DisciplinaDao getDisciplinaDao(){
		if(disciplinaDao == null){
			disciplinaDao = new DisciplinaDao();
		}
		return disciplinaDao;
	}
}
