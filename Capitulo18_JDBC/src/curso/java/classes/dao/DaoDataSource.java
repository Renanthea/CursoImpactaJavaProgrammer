package curso.java.classes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public abstract class DaoDataSource<T> {
	
	protected Connection cn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	protected void abrirConexao() throws Exception{
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setDatabaseName("dbcadastro");
		dataSource.setUser("root");
		dataSource.setPassword("Imp@ct@");
		
		cn = dataSource.getConnection();
	}
	
	protected void fecharConexao() throws Exception {
		if(cn != null && !cn.isClosed()){
			cn.close();
		}
	}
	
	public abstract void incluir(T elemento) throws Exception;
	public abstract T buscar(int elemento) throws Exception;
}
