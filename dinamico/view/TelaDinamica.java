package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.acaoBtAddAll;

import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaDinamica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JButton btnAddTudo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDinamica frame = new TelaDinamica();
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
	public TelaDinamica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAddTudo = new JButton("addAll");
		btnAddTudo.setBounds(178, 243, 89, 23);
		contentPane.add(btnAddTudo);
		
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(120, 110, 216, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		acaoBtAddAll btAddAll = new acaoBtAddAll(textFieldNome, btnAddTudo);
		btnAddTudo.addActionListener(btAddAll);
	}
}
