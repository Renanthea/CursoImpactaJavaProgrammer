package curso.java.classes.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.UIManager;

import curso.java.classes.dao.AlunoDao;
import curso.java.classes.dao.DisciplinaDao;
import curso.java.classes.dao.repositorio.Repositorio;
import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Disciplina;
import curso.java.classes.enumeracoes.Sexo;

import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CadastroAlunos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtMatricula;
	private JTextField txtIdade;
	private JTextField txtCurso;
	private JTextField txtCodigo;
	private JTextField txtDescricao;
	private JTextField txtCargaHoraria;
	private JComboBox<Aluno> cmbAluno;
	private JTextArea txtDadosAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroAlunos frame = new CadastroAlunos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroAlunos() {
		setTitle("Cadastro de Alunos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(10, 36, 89, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 61, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 86, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(10, 111, 46, 14);
		contentPane.add(lblCurso);
		
		txtNome = new JTextField();
		txtNome.setBounds(105, 8, 223, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(105, 33, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(105, 58, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JComboBox<Sexo> cmbSexo = new JComboBox<>();
		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.addItem(Sexo.FEMININO);
		cmbSexo.setBounds(105, 82, 89, 22);
		contentPane.add(cmbSexo);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(105, 108, 223, 20);
		contentPane.add(txtCurso);
		txtCurso.setColumns(10);
		
		JButton btnAdicionarAluno = new JButton("Adicionar Aluno");
		btnAdicionarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Aluno aluno = new Aluno();
					aluno.setNome(txtNome.getText());
					aluno.setMatricula(Integer.parseInt(txtMatricula.getText()));
					aluno.setIdade(Integer.parseInt(txtIdade.getText()));
					aluno.setSexo((Sexo)cmbSexo.getSelectedItem());
					aluno.setCurso(txtCurso.getText());
					
					Repositorio.getAlunoDao().incluir(aluno);
					listarAlunos();
					//cmbAluno.addItem(aluno);
					
					JOptionPane.showMessageDialog(
							CadastroAlunos.this, "Aluno incluído com sucesso");
					limparCampos();
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							CadastroAlunos.this, "ERRO: " + e.getMessage());
				}
			}
		});
		btnAdicionarAluno.setBounds(10, 147, 124, 23);
		contentPane.add(btnAdicionarAluno);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Disciplinas", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(364, 11, 343, 250);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 29, 82, 14);
		panel.add(lblCodigo);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(10, 54, 82, 14);
		panel.add(lblDescrio);
		
		JLabel lblCargaHoraria = new JLabel("Carga Horaria:");
		lblCargaHoraria.setBounds(10, 79, 82, 14);
		panel.add(lblCargaHoraria);
		
		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(10, 104, 46, 14);
		panel.add(lblAluno);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(102, 26, 86, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(102, 51, 129, 20);
		panel.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(102, 76, 86, 20);
		panel.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		cmbAluno = new JComboBox<>();
		cmbAluno.setBounds(102, 100, 231, 22);
		panel.add(cmbAluno);
		
		JButton btnAdicionarDisciplina = new JButton("Adicionar Disciplina");
		btnAdicionarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//buscando o aluno no combobox
					Aluno aluno = (Aluno)cmbAluno.getSelectedItem();
					
					//criando o objeto Disciplina
					Disciplina disciplina = new Disciplina(
							Integer.parseInt(txtCodigo.getText()), 
							txtDescricao.getText(), 
							Integer.parseInt(txtCargaHoraria.getText()),
							new Date(),
							aluno);
					
					Repositorio.getDisciplinaDao().incluir(disciplina);
					
					
					JOptionPane.showMessageDialog(
							CadastroAlunos.this, 
							"Disciplina incluída com sucesso");
					limparDisciplina();
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(
							CadastroAlunos.this, 
							e.getMessage(),
							"Erro",
							JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		btnAdicionarDisciplina.setBounds(10, 141, 156, 23);
		panel.add(btnAdicionarDisciplina);
		
		JButton btnExibirAluno = new JButton("Exibir Aluno");
		btnExibirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Aluno aluno = (Aluno)cmbAluno.getSelectedItem();
					List<Disciplina> lista = Repositorio
							.getDisciplinaDao().listar(aluno.getMatricula());
					
					Set<Disciplina> disciplinas = new LinkedHashSet<>();
					for (Disciplina disciplina : lista) {
						disciplinas.add(disciplina);
					}
					aluno.setDisciplinas(disciplinas);
					txtDadosAluno.setText(aluno.exibir());
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnExibirAluno.setBounds(10, 175, 156, 23);
		panel.add(btnExibirAluno);
		
		JButton btnGerarArquivo = new JButton("Gerar Arquivo");
		btnGerarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Path path = Paths
						.get("C:/Users/emilio/Documents/Curso_JavaProgrammer/dados.txt");
					
					Aluno aluno = (Aluno)cmbAluno.getSelectedItem();
					
					List<Disciplina> lista = Repositorio
							.getDisciplinaDao().listar(aluno.getMatricula());
					
					Set<Disciplina> disciplinas = new LinkedHashSet<>();
					for (Disciplina disciplina : lista) {
						disciplinas.add(disciplina);
					}
					aluno.setDisciplinas(disciplinas);
					
					Files.write(path, aluno.exibir().getBytes());
					
					JOptionPane.showMessageDialog(CadastroAlunos.this, "Arquivo Gerado");
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(
							CadastroAlunos.this, 
							e2.getMessage(),
							"Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnGerarArquivo.setBounds(10, 209, 156, 23);
		panel.add(btnGerarArquivo);
		
		JButton btnBuscarDisciplina = new JButton("Buscar");
		btnBuscarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int codigo = Integer.parseInt(txtCodigo.getText());
					
					Disciplina disciplina = Repositorio.getDisciplinaDao().buscar(codigo);
					if(disciplina == null){
						JOptionPane.showMessageDialog(CadastroAlunos.this, 
								"Disciplina inexistente");
						limparDisciplina();
					} else {
						txtDescricao.setText(disciplina.getDescricao());
						txtCargaHoraria.setText(
							Integer.toString(disciplina.getCargaHoraria()));
					}
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(CadastroAlunos.this, e.getMessage());
				}
			}
		});
		btnBuscarDisciplina.setBounds(198, 25, 91, 23);
		panel.add(btnBuscarDisciplina);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 181, 343, 215);
		contentPane.add(scrollPane);
		
		txtDadosAluno = new JTextArea();
		scrollPane.setViewportView(txtDadosAluno);
		
		JButton btnBuscarAluno = new JButton("Buscar");
		btnBuscarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int matricula = Integer.parseInt(txtMatricula.getText());
					Aluno aluno = Repositorio.getAlunoDao().buscar(matricula);
					
					if(aluno == null){
						JOptionPane.showMessageDialog(CadastroAlunos.this, 
								"Aluno inexistente");
						limparCampos();
					} else {
						txtNome.setText(aluno.getNome());
						txtIdade.setText(Integer.toString(aluno.getIdade()));
						txtCurso.setText(aluno.getCurso());
						cmbSexo.setSelectedIndex(aluno.getSexo().ordinal());
					}									
				} catch (Exception e) {
					JOptionPane.showMessageDialog(CadastroAlunos.this, e.getMessage());
				}
			}
		});
		btnBuscarAluno.setBounds(203, 32, 91, 23);
		contentPane.add(btnBuscarAluno);
		
		//chamar o método para preencher o combobox de alunos (cmbAlunos)
		listarAlunos();
	}
	
	private void listarAlunos(){
		try {
			List<Aluno> alunos = Repositorio.getAlunoDao().listar();
			cmbAluno.removeAllItems();
			for (Aluno aluno : alunos) {
				cmbAluno.addItem(aluno);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void limparCampos(){
		txtNome.setText("");
		txtMatricula.setText("");
		txtIdade.setText("");
		txtCurso.setText("");
		txtNome.requestFocus();		
	}
	
	private void limparDisciplina(){
		txtCodigo.setText("");
		txtDescricao.setText("");
		txtCargaHoraria.setText("");
		txtCodigo.requestFocus();		
	}
}
