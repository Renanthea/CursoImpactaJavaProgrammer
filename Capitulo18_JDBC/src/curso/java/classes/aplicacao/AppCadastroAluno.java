package curso.java.classes.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import curso.java.classes.enumeracoes.Sexo;

public class AppCadastroAluno {
	public static void main(String[] args) {
		//Respons�vel por abrir e manter a conex�o com o banco de dados
		Connection cn;
		
		//Respons�vel por executar tarefas no BD aberto por Connection
		PreparedStatement stmt;
		
		//String de conexao: cont�m os par�metros da conex�o com o banco
		//de dados, especificamente com o MySQL
		String url = "jdbc:mysql://localhost:3306/dbcadastro";
		
		//Usu�rio e senha do banco de dados
		String usuario = "root";
		String senha = "Imp@ct@";
		
		//Come�ando os trabalhos...
		try {
			//Definindo o driver de acesso ao MySQL
			Class.forName("com.mysql.jdbc.Driver");
			
			//Abrindo a conex�o com o banco de dados
			cn = DriverManager.getConnection(url, usuario, senha);
			
			//Obtendo os dados do aluno em vari�veis
			int matricula = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a matr�cula"));
			
			String nome = JOptionPane.showInputDialog("Informe o nome");
			
			int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a idade"));
			
			Sexo sexo = (Sexo)JOptionPane.showInputDialog(null,
													"Selecione o sexo",
													"Sexo",
													JOptionPane.QUESTION_MESSAGE,
													null,
													Sexo.values(),
													null);
			
			String curso = JOptionPane.showInputDialog("Informe o curso");
			
			//Definindo a instru��o SQL para inserir um novo aluno
			String sql = 
				"INSERT INTO ALUNO (MATRICULA,NOME,IDADE,SEXO,CURSO) VALUES (?,?,?,?,?)";
			
			//Definindo a estrutura para inserir os dados no banco de dados
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, matricula);
			stmt.setString(2, nome);
			stmt.setInt(3, idade);
			stmt.setInt(4, sexo.ordinal());
			stmt.setString(5, curso);
			
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());			
		}
		
		
	}
}
