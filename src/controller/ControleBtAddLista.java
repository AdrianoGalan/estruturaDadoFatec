package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Fila;
import model.Lista;
import model.ModelTable;
import model.Pilha;

public class ControleBtAddLista implements ActionListener {

	private JTable tableLista;
	private ModelTable modelTableLista = new ModelTable();
	private ModelTable modelTabPilha = new ModelTable();
	private ModelTable modelTableFila = new ModelTable();
	private Lista lista = new Lista<String>();
	private Pilha pilha = new Pilha<String>();
	private Fila fila = new Fila<String>();
	private JTable tablePilha;
	private JTable tableFila;
	private JLabel lblFilaa;
	private JLabel lblEntradaDoDado;
	private JTextField textFieldEntrada;
	private JTextField textFieldPos;

	public ControleBtAddLista(JTable tableLista, ModelTable modelTableLista, ModelTable modelTabPilha,
			ModelTable modelTableFila, Lista lista, Pilha pilha, Fila fila, JTable tablePilha, JTable tableFila,
			JLabel lblFilaa, JLabel lblEntradaDoDado, JTextField textFieldEntrada, JTextField textFieldPos) {
		super();
		this.tableLista = tableLista;
		this.modelTableLista = modelTableLista;
		this.modelTabPilha = modelTabPilha;
		this.modelTableFila = modelTableFila;
		this.lista = lista;
		this.pilha = pilha;
		this.fila = fila;
		this.tablePilha = tablePilha;
		this.tableFila = tableFila;
		this.lblFilaa = lblFilaa;
		this.lblEntradaDoDado = lblEntradaDoDado;
		this.textFieldEntrada = textFieldEntrada;
		this.textFieldPos = textFieldPos;
	}

	private void addLista() {

		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);

		ControllerTable ct = new ControllerTable(modelTableLista, modelTabPilha, modelTableFila, tableLista, tablePilha,
				tableFila, lista, pilha, fila);

		lista = ce.addLista();

		ct.povoaLista();
		ce.limpaCampos();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		addLista();

	}

}
