package curso.java.classes.dao;

import java.util.ArrayList;
import java.util.List;

import curso.java.classes.entidades.Aluno;
import curso.java.classes.enumeracoes.Sexo;

public class AlunoDao extends DaoDataSource<Aluno>{

	@Override
	public void incluir(Aluno elemento) throws Exception{
		try {
			abrirConexao();
			stmt = cn.prepareStatement("INSERT INTO ALUNO "
					+ "(MATRICULA,NOME,IDADE,SEXO,CURSO) VALUES (?,?,?,?,?)");
			stmt.setInt(1, elemento.getMatricula());
			stmt.setString(2, elemento.getNome());
			stmt.setInt(3, elemento.getIdade());
			stmt.setInt(4, elemento.getSexo().ordinal());
			stmt.setString(5, elemento.getCurso());
			
			stmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}		
	}

	@Override
	public Aluno buscar(int elemento) throws Exception{
		Aluno aluno = null;
		try {
			abrirConexao();
			stmt = cn.prepareStatement("SELECT * FROM ALUNO WHERE MATRICULA = ?");
			stmt.setInt(1, elemento);
			
			rs = stmt.executeQuery();
			if(rs.next()){
				aluno = new Aluno();
				aluno.setMatricula(rs.getInt("MATRICULA"));
				aluno.setNome(rs.getString("NOME"));
				aluno.setIdade(rs.getInt("IDADE"));
				aluno.setSexo(rs.getInt("SEXO") == 0 ? Sexo.MASCULINO : Sexo.FEMININO);
				aluno.setCurso(rs.getString("CURSO"));
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		
		return aluno;
	}
	
	//método para listar todos os alunos
	public List<Aluno> listar() throws Exception {
		List<Aluno> alunos = new ArrayList<>();
		try {
			abrirConexao();
			stmt = cn.prepareStatement("SELECT * FROM ALUNO");
			
			rs = stmt.executeQuery();
			while(rs.next()){
				Aluno aluno = new Aluno();
				aluno.setMatricula(rs.getInt("MATRICULA"));
				aluno.setNome(rs.getString("NOME"));
				aluno.setIdade(rs.getInt("IDADE"));
				aluno.setSexo(rs.getInt("SEXO") == 0 ? Sexo.MASCULINO : Sexo.FEMININO);
				aluno.setCurso(rs.getString("CURSO"));
				
				alunos.add(aluno);
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		
		return alunos;
	}

}




