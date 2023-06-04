package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Game extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	public Game() {
		setTitle("Tela de seleção");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Bomberman");
		btnNewButton.setBounds(10, 62, 101, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Selecao().setVisible(true);
				dispose();

				JOptionPane.showMessageDialog(null, "Bomberman é uma série de jogos de estratégia, \ninicialmente desenvolvido pela fabricante Hudson Soft. \nO jogo original foi lançado em 1983");
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnStreetFighter = new JButton("Street Fighter");
		btnStreetFighter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Selecao().setVisible(true);
				dispose();
				JOptionPane.showMessageDialog(null, "No Sudeste Asiático, um general sequestra 63 delegados da ONU e exige um resgate milionário. \nO coronel Guile e a agente da Inteligência Britânica Cammy tentam resolver a situação, mas\n seus planos são ameaçados por uma repórter atrás de vingança.");

			}
		});
		btnStreetFighter.setBounds(121, 62, 101, 41);
		contentPane.add(btnStreetFighter);
		
		JButton btnMarioBros = new JButton("Mario Bros.");
		btnMarioBros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Selecao().setVisible(true);
				dispose();
				JOptionPane.showMessageDialog(null, "Mario é um encanador junto com seu irmão Luigi. Um dia, eles vão parar no reino dos cogumelos,\n governado pela Princesa Peach, mas ameaçado pelo rei \ndos Koopas, que faz de tudo para conseguir reinar em todos os lugares.");

			}
		});
		btnMarioBros.setBounds(232, 62, 101, 41);
		contentPane.add(btnMarioBros);
		
		JButton btnTopGear = new JButton("Top Gear");
		btnTopGear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Selecao().setVisible(true);
				dispose();
				JOptionPane.showMessageDialog(null, "O jogador corre em percursos espalhados por oito países, devendo chegar entre os cinco primeiros \npara alcançar o próximo nível.");

			}
		});
		btnTopGear.setBounds(10, 114, 101, 41);
		contentPane.add(btnTopGear);
		
		JButton btnMetalSlug = new JButton("Metal Slug");
		btnMetalSlug.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Selecao().setVisible(true);
				dispose();
				JOptionPane.showMessageDialog(null, "Marco Rossi, um militar que entrou num pequeno e poderosos grupos de soldados chamados Esquadrão \nPeregrine Falcon, junto de seu parceiro Tarma Roving, que lutam contra o exército do General Donald Morden, \na fim de evitar um enorme golpe de Estado e a criação de uma Nova Ordem ");

}
		});
		btnMetalSlug.setBounds(121, 114, 101, 41);
		contentPane.add(btnMetalSlug);
		
		JButton btnDonkeyKong = new JButton("Donkey Kong");
		btnDonkeyKong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Selecao().setVisible(true);
				dispose();
				JOptionPane.showMessageDialog(null, "Jumpman deve resgatar uma donzela em apuros, Lady, \nde um macaco gigante chamado Donkey Kong.");

			}
		});
		btnDonkeyKong.setBounds(232, 114, 101, 41);
		contentPane.add(btnDonkeyKong);
		
		JLabel lblNewLabel = new JLabel("Selecione um jogo ");
		lblNewLabel.setBounds(24, 11, 151, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Fechar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnNewButton_1.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
