package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Selecao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selecao frame = new Selecao();
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
	public Selecao() {
		setTitle("Tela de escolha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dificuldade:");
		lblNewLabel.setBounds(15, 5, 81, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fácil", "Médio", "Difícil"}));
		comboBox.setBounds(15, 30, 81, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Som:");
		lblNewLabel_1.setBounds(120, 5, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Baixo", "Médio", "Alto"}));
		comboBox_1.setBounds(120, 30, 81, 22);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Avançar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inicio().setVisible(true);
			}
		});
		btnNewButton.setBounds(15, 109, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new Game().setVisible(true);
			}
			
		});
		btnVoltar.setBounds(120, 109, 89, 23);
		contentPane.add(btnVoltar);
	}
}
