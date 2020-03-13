
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Fila;
import model.FilaDinamica;
import model.Lista;
import model.ModelTable;
import model.Pilha;

public class ControleBtAdd implements ActionListener {

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

	

	public ControleBtAdd(JTable tableLista, ModelTable modelTableLista, ModelTable modelTabPilha,
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

	private void addTodos() {

		ControleEntradaDados ce = new ControleEntradaDados(textFieldEntrada, textFieldPos, lista, pilha, fila);
		ControllerTable ct = new ControllerTable(modelTableLista, modelTabPilha, modelTableFila, tableLista, tablePilha,
				tableFila, lista, pilha, fila);

		if (!textFieldEntrada.getText().isEmpty()) {

			lista = ce.addLista();
			pilha = ce.addPilha();
			fila = ce.addFila();
			ct.povoaLista();
			ct.povoaFila();
			ct.povoaPilha();

			ce.limpaCampos();
		} else {
			JOptionPane.showMessageDialog(null, "Digite um dado de entrada");
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		addTodos();
	}

}
