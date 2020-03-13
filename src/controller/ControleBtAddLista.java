
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Fila;
import model.FilaDinamica;
import model.Lista;
import model.ModelTable;
import model.Pilha;

public class ControleBtAddLista implements ActionListener {
	

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
	


	


	public ControleBtAddLista(JPanel contentPane, JTable tableLista, ModelTable modelTableLista,
			ModelTable modelTabPilha, ModelTable modelTableFila, Lista lista, Pilha pilha, Fila fila, JTable tablePilha,
			JScrollPane scrollPane_1, JTable tableFila, JScrollPane scrollPane_2, JLabel lblFilaa,
			JLabel lblEntradaDoDado, JTextField textFieldEntrada, JTextField textFieldPos) {
		super();
		this.contentPane = contentPane;
		this.tableLista = tableLista;
		this.modelTableLista = modelTableLista;
		this.modelTabPilha = modelTabPilha;
		this.modelTableFila = modelTableFila;
		this.lista = lista;
		this.pilha = pilha;
		this.fila = fila;
		this.tablePilha = tablePilha;
		this.scrollPane_1 = scrollPane_1;
		this.tableFila = tableFila;
		this.scrollPane_2 = scrollPane_2;
		this.lblFilaa = lblFilaa;
		this.lblEntradaDoDado = lblEntradaDoDado;
		this.textFieldEntrada = textFieldEntrada;
		this.textFieldPos = textFieldPos;
	}

	private boolean validaDado() {
		
		return !textFieldEntrada.getText().isEmpty();
	}
	
	private boolean validaPos() {
		
		return !textFieldPos.getText().isEmpty();
	}
	
	


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
	}

}
