package curso.java.classes.dao;

import java.util.ArrayList;
import java.util.List;

import curso.java.classes.entidades.Disciplina;

public class DisciplinaDao extends Dao<Disciplina>{

	@Override
	public void incluir(Disciplina elemento) throws Exception {
		try {
			/*
			 * por padrão, toda operação no banco de dados é efetivada
			 * no momento da execução. Por exemplo, ao executar a 
			 * instrução stmt.executeUpdate(), a alteração é imediatamente 
			 * realizada no banco. Isso significa que o processo conhecido
			 * como "commit", é habilitado por default.
			 * 
			 * Para controlar o comportamento da efetivação automatica,
			 * devemos desabilitar o "commit" e realizá-lo somente
			 * se todas as operações envolvidas forem de fato validadas.
			 */
			abrirConexao();
			cn.setAutoCommit(false); //desabilita o "commit" automática
			
			stmt = cn.prepareStatement("INSERT INTO DISCIPLINA "
					+ "(MATRICULA,CODIGO,DESCRICAO,CARGAHORARIA,"
					+ "DATAMATRICULA) VALUES (?,?,?,?,?)");
			
			stmt.setInt(1, elemento.getAluno().getMatricula());
			stmt.setInt(2, elemento.getCodigo());
			stmt.setString(3, elemento.getDescricao());
			stmt.setInt(4, elemento.getCargaHoraria());
			stmt.setDate(5, new java.sql.Date(elemento.getDataMatricula().getTime()));
			
			stmt.executeUpdate();
			cn.commit(); //efetiva a atualização no banco de dados
			cn.setAutoCommit(true);
		} catch (Exception e) {
			cn.rollback();
			throw e;
		} finally {
			fecharConexao();
		}
		
	}

	@Override
	public Disciplina buscar(int elemento) throws Exception {
		Disciplina disciplina = null;
		
		try {
			abrirConexao();
			stmt = cn.prepareStatement("SELECT * FROM DISCIPLINA "
					+ "WHERE CODIGO = ?");
			stmt.setInt(1, elemento);
			
			rs = stmt.executeQuery();
			
			if(rs.next()){
				disciplina = 
					new Disciplina(
							rs.getInt("CODIGO"), 
							rs.getString("DESCRICAO"), 
							rs.getInt("CARGAHORARIA"), 
							rs.getDate("DATAMATRICULA"), 
							new AlunoDao().buscar(rs.getInt("MATRICULA")));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		
		return disciplina;
	}
	
	public List<Disciplina> listar(int matricula) throws Exception {
		List<Disciplina> lista = new ArrayList<>();
		
		try {
			abrirConexao();
			stmt = cn.prepareStatement("SELECT * FROM "
					+ "DISCIPLINA WHERE MATRICULA = ?");
			
			stmt.setInt(1, matricula);
			
			rs = stmt.executeQuery();
			
			while(rs.next()){
				Disciplina disciplina = 
						new Disciplina(
								rs.getInt("CODIGO"), 
								rs.getString("DESCRICAO"), 
								rs.getInt("CARGAHORARIA"), 
								rs.getDate("DATAMATRICULA"), 
								new AlunoDao().buscar(rs.getInt("MATRICULA")));
				lista.add(disciplina);
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();			
		}
		
		return lista;
	}

}
