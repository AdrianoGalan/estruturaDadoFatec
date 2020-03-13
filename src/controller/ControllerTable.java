package controller;

import javax.swing.JTable;

import model.Fila;
import model.Lista;
import model.ModelTable;
import model.Pilha;

public class ControllerTable {

	private ModelTable modelTableLista;
	private ModelTable modelTabPilha;
	private ModelTable modelTableFila;
	private JTable tableLista;
	private JTable tablePilha;
	private JTable tableFila;
	private Lista lista;
	private Pilha pilha;
	private Fila fila;
	
	
	

	public ControllerTable(ModelTable modelTableLista, ModelTable modelTabPilha, ModelTable modelTableFila,
			JTable tableLista, JTable tablePilha, JTable tableFila, Lista lista, Pilha pilha, Fila fila) {
		super();
		this.modelTableLista = modelTableLista;
		this.modelTabPilha = modelTabPilha;
		this.modelTableFila = modelTableFila;
		this.tableLista = tableLista;
		this.tablePilha = tablePilha;
		this.tableFila = tableFila;
		this.lista = lista;
		this.pilha = pilha;
		this.fila = fila;
	}

	// povoa tabela pilha
	public void povoaPilha() {

		modelTabPilha.limpar();
		modelTabPilha.addLista(pilha.gravaObj());
		tablePilha.setModel(modelTabPilha);

	}

	// povoa tabela Lida
	public void povoaLista() {

		modelTableLista.limpar();
		modelTableLista.addLista(lista.gravaObj());
		tableLista.setModel(modelTableLista);

	}

	// povoa tabela Fila
	public void povoaFila() {

		modelTableFila.limpar();
		modelTableFila.addLista(fila.gravaObj());
		tableFila.setModel(modelTableFila);

	}

}
