package curso.java.classes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class Dao<T> {
	
	protected Connection cn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	private String url = "jdbc:mysql://localhost:3306/dbcadastro";
	
	//método para abrir a conexão
	protected void abrirConexao() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection(url, "root", "Imp@ct@");
	}
	
	//metodo para fechar a conexao
	protected void fecharConexao() throws Exception {
		if(cn != null && !cn.isClosed()){
			cn.close();
		}
	}
	
	public abstract void incluir(T elemento) throws Exception;
	public abstract T buscar(int elemento) throws Exception;
}
