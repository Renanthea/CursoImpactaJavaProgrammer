package curso.java.classes.threads.exercicios;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Cronometro extends JFrame {

	private JPanel contentPane;
	private Thread thread ;
	private JLabel lblDataHora;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cronometro frame = new Cronometro();
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
	public Cronometro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				thread = new Thread(() -> {
					try {
						
						SimpleDateFormat fmt = new SimpleDateFormat(" HH : mm : ss ");
						
						
						
						while (true) {
							

							String data = fmt.format(new Date());
							lblDataHora.setText(data);
							Thread.sleep(1000);
							
						}
						
					} catch (Exception e) {
						
						e.printStackTrace();
					}	
				});
				thread.start();
			}
		});
				
		btnIniciar.setBounds(65, 201, 91, 23);
		contentPane.add(btnIniciar);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (thread != null) {
					thread.stop();					
				}
				
			}
		});
		btnTerminar.setBounds(225, 201, 91, 23);
		contentPane.add(btnTerminar);
		
	    lblDataHora = new JLabel("New label");
		lblDataHora.setForeground(Color.RED);
		lblDataHora.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDataHora.setBounds(59, 116, 311, 14);
		contentPane.add(lblDataHora);
	}}
