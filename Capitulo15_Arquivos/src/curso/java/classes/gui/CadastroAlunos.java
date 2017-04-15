package curso.java.classes.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import curso.java.classes.entidades.Aluno;
import curso.java.classes.entidades.Disciplina;
import curso.java.classes.enumeracoes.Sexo;

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
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
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
		setBounds(100, 100, 596, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(48, 44, 46, 14);
		contentPane.add(lblNome);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(48, 77, 58, 14);
		contentPane.add(lblMatricula);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(48, 113, 46, 14);
		contentPane.add(lblIdade);

		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(48, 186, 46, 14);
		contentPane.add(lblCurso);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(48, 149, 46, 14);
		contentPane.add(lblSexo);

		txtNome = new JTextField();
		txtNome.setToolTipText("");
		txtNome.setBounds(106, 41, 161, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(105, 74, 123, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(104, 110, 124, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		JComboBox<Sexo> cmbSexo = new JComboBox<>();

		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.addItem(Sexo.FEMININO);
		cmbSexo.setBounds(102, 145, 85, 22);
		contentPane.add(cmbSexo);

		txtCurso = new JTextField();
		txtCurso.setBounds(102, 183, 165, 20);
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
					aluno.setSexo((Sexo) cmbSexo.getSelectedItem());
					aluno.setCurso(txtCurso.getText());

					cmbAluno.addItem(aluno);

					JOptionPane.showMessageDialog(CadastroAlunos.this,
							"Muito bom  funcionou ");

				} catch (Exception e) {
					JOptionPane.showMessageDialog(CadastroAlunos.this, "ERRO: "
							+ e.getMessage());

				}

			}
		});
		btnAdicionarAluno.setBounds(45, 245, 91, 23);
		contentPane.add(btnAdicionarAluno);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED,
				null, null), "Disciplinas", TitledBorder.CENTER,
				TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(289, 44, 289, 343);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 49, 46, 14);
		panel.add(lblCodigo);

		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(10, 91, 61, 14);
		panel.add(lblDescrio);

		JLabel lblCh = new JLabel("CH:");
		lblCh.setBounds(10, 137, 46, 14);
		panel.add(lblCh);

		JLabel lblAluno = new JLabel("Aluno:");
		lblAluno.setBounds(10, 185, 46, 14);
		panel.add(lblAluno);

		cmbAluno = new JComboBox<>();
		cmbAluno.setBounds(81, 181, 138, 22);
		panel.add(cmbAluno);

		JButton btnAdicionarDisciplina = new JButton("Adicionar Disciplina");
		btnAdicionarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Criando o obejto disciplina

				try {
					Disciplina disciplina = new Disciplina
							(Integer.parseInt(txtCodigo.getText()), 
											  txtDescricao.getText(), 
							Integer.parseInt( txtCargaHoraria.getText()));
					
					//Buscando o aluno no combobox
					
					Aluno aluno = (Aluno) cmbAluno.getSelectedItem();
					
					//Verificando se existe uma lista de disciplinas 
					// vinculada ao aluno 
					if (aluno.getDisciplinas()== null) {
						aluno.setDisciplinas(new LinkedHashSet<>());
						
					}
					//Adicionando a disciplina na lista de Disciplinas 
					//do aluno 
					
					aluno.getDisciplinas().add(disciplina);
					
					JOptionPane.showMessageDialog(CadastroAlunos.this, "Disciplina Incluida com Sucesso");
					
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(CadastroAlunos.this, e.getMessage(),"Erro" , JOptionPane.ERROR_MESSAGE);

					e.printStackTrace();
				}

			}
		});
		btnAdicionarDisciplina.setBounds(10, 214, 125, 23);
		panel.add(btnAdicionarDisciplina);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(81, 134, 92, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);

		txtDescricao = new JTextField();
		txtDescricao.setBounds(81, 88, 86, 20);
		panel.add(txtDescricao);
		txtDescricao.setColumns(10);

		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(81, 46, 92, 20);
		panel.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		JButton btnExibirAluno = new JButton("Exibir Aluno");
		btnExibirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Aluno aluno = (Aluno)cmbAluno.getSelectedItem();
				txtDadosAluno.setText(aluno.exibir());
				
				
			}
		});				  
		
		btnExibirAluno.setBounds(10, 250, 125, 23);
		panel.add(btnExibirAluno);	
		
		JButton btnGerarArquivo = new JButton("Gerar Arquivo");
		btnGerarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Path path = Paths
							.get("C:\\Users\\di3616\\Documents\\Curso_JavaProgrammer\\pessoas.txt");
					
					Aluno aluno = (Aluno)cmbAluno.getSelectedItem();
					Files.write(path, aluno.exibir().getBytes());
					
					JOptionPane.showMessageDialog(CadastroAlunos.this, "Arquivo Gerado");
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(CadastroAlunos.this,e2.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		
		btnGerarArquivo.setBounds(10, 287, 125, 23);
		panel.add(btnGerarArquivo);
		
	  
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 279, 278, 311);
		contentPane.add(scrollPane);
		
		 txtDadosAluno = new JTextArea();
		scrollPane.setViewportView(txtDadosAluno);
	}
}
