package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControleEntradaDados;
import model.Fila;
import model.Lista;
import model.ModelTable;
import model.Pilha;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable tableLista;
	private ModelTable modelTableLista = new ModelTable();
	private ModelTable modelTabPilha = new ModelTable();
	private ModelTable modelTableFila = new ModelTable();
	private Lista lista = new Lista<String>();
	private Pilha pilha = new Pilha<String>();
	private Fila fila = new Fila<String>();
	private JTable tablePilha;
	private JScrollPane scrollPane_1;
	private JTable tableFila;
	private JScrollPane scrollPane_2;
	private JLabel lblFilaa;
	private JLabel lblEntradaDoDado;
	private JTextField textFieldEntrada;
	private JTextField textFieldPos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 251, 177, 212);
		contentPane.add(scrollPane);

		tableLista = new JTable();
		scrollPane.setViewportView(tableLista);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(201, 251, 171, 212);
		contentPane.add(scrollPane_1);

		tablePilha = new JTable();
		scrollPane_1.setViewportView(tablePilha);

		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(386, 251, 177, 212);
		contentPane.add(scrollPane_2);

		tableFila = new JTable();
		scrollPane_2.setViewportView(tableFila);

		JLabel lblLista = new JLabel("LISTA");
		lblLista.setBounds(76, 224, 70, 15);
		contentPane.add(lblLista);

		JLabel lblPilha = new JLabel("PILHA");
		lblPilha.setBounds(262, 224, 70, 15);
		contentPane.add(lblPilha);

		lblFilaa = new JLabel("FILA");
		lblFilaa.setBounds(453, 224, 70, 15);
		contentPane.add(lblFilaa);

		lblEntradaDoDado = new JLabel("ENTRADA DO DADO:");
		lblEntradaDoDado.setBounds(12, 12, 154, 15);
		contentPane.add(lblEntradaDoDado);

		textFieldEntrada = new JTextField();
		textFieldEntrada.setBounds(173, 10, 199, 19);
		contentPane.add(textFieldEntrada);
		textFieldEntrada.setColumns(10);

		JButton btnAddTodos = new JButton("Add Todos");
		btnAddTodos.setBounds(387, 7, 117, 25);
		contentPane.add(btnAddTodos);

		textFieldPos = new JTextField();
		textFieldPos.setToolTipText("Posi√ß√£o");
		textFieldPos.setBounds(32, 86, 114, 19);
		contentPane.add(textFieldPos);
		textFieldPos.setColumns(10);

		JLabel lblPosio = new JLabel("POSI«√O:");
		lblPosio.setBounds(35, 68, 70, 15);
		contentPane.add(lblPosio);

		JButton btnAddLista = new JButton("ADD LISTA");
		btnAddLista.setBounds(32, 117, 117, 25);
		contentPane.add(btnAddLista);

		JButton btnRemovLista = new JButton("REM. LISTA");
		btnRemovLista.setBounds(32, 154, 117, 25);
		contentPane.add(btnRemovLista);

		JButton btnEmpilha = new JButton("EMPILHA");
		btnEmpilha.setBounds(230, 117, 117, 25);
		contentPane.add(btnEmpilha);

		JButton btnDesempilh = new JButton("DESEMPILHA");
		btnDesempilh.setBounds(230, 154, 117, 25);
		contentPane.add(btnDesempilh);

		JButton btnAddFila = new JButton("ENFILEIRAR");
		btnAddFila.setBounds(429, 117, 117, 25);
		contentPane.add(btnAddFila);

		JButton btnRemFila = new JButton("DESENFILEIRAR");
		btnRemFila.setBounds(429, 154, 117, 25);
		contentPane.add(btnRemFila);

		// a√ß√£o bot√£o ADD LISTA
		ActionListener btAddLista = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				addLista();

			}
		};

		// AÁ„o bot„o add pilha
		ActionListener btAddPilha = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPilha();

			}
		};

		// acao bot„o add fila
		ActionListener btAddFila = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addFila();

			}
		};
		
		//acao bot„o add todos
		ActionListener btAddTodos = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				addTodos();
				
			}
		};
		
		//acao botao remove lista
		ActionListener btRemoveLista = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				tbRemoveLista();
				
			}
		};
		ActionListener btRemovePilha = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				btRemovePilha();
				
			}
		};
		
		ActionListener btRemoveFila = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				btRemoveFila();
				
			}
		};

		// chama aÁ„o botoes
		btnAddLista.addActionListener(btAddLista);
		btnEmpilha.addActionListener(btAddPilha);
		btnAddFila.addActionListener(btAddFila);
		btnAddTodos.addActionListener(btAddTodos);
		btnDesempilh.addActionListener(btRemovePilha);
		btnRemovLista.addActionListener(btRemoveLista);
		btnRemFila.addActionListener(btRemoveFila);
		textFieldEntrada.addActionListener(btAddTodos);
		
	}

	
	private void addTodos() {
		
		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);

		if(!textFieldEntrada.getText().isEmpty()) {
		
		lista = ce.addLista();
		pilha = ce.addPilha();
		fila = ce.addFila();
		povoaLista();
		povoaFila();
		povoaPilha();
	
		limpaCampos();
		}else {
			JOptionPane.showMessageDialog(null, "Digite um dado de entrada");
		}
	}
	
	
	private void addLista() {

		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);

		lista = ce.addLista();
		povoaLista();
		limpaCampos();


	}

	private void addPilha() {

		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);

		pilha = ce.addPilha();

		povoaPilha();
		limpaCampos();

	}

	private void addFila() {

		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);

		fila = ce.addFila();
		povoaFila();
		limpaCampos();

	}
	
	private void btRemoveFila() {
		
		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);

		fila = ce.removeFila();
		povoaFila();
		limpaCampos();
		
	}
	
	private void tbRemoveLista() {
		
		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);

		lista = ce.removeLista();
		povoaLista();
		limpaCampos();
		
	}
	
	private void btRemovePilha() {
		
		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);

		pilha = ce.removePilha();

		povoaPilha();
		limpaCampos();
		
	}

	// povoa tabela pilha
	private void povoaPilha() {

		modelTabPilha.limpar();
		modelTabPilha.addLista(pilha.gravaObj());
		tablePilha.setModel(modelTabPilha);

		
	}
	
	//povoa tabela Lida
	private void povoaLista(){
		

		modelTableLista.limpar();
		modelTableLista.addLista(lista.gravaObj());
		tableLista.setModel(modelTableLista);

		
	}

	// povoa tabela Fila
	private void povoaFila() {

		modelTableFila.limpar();
		modelTableFila.addLista(fila.gravaObj());
		tableFila.setModel(modelTableFila);

		
	}

	// limpa campos de entradas
	private void limpaCampos() {

		textFieldEntrada.setText("");
		textFieldPos.setText("");
	}
}
