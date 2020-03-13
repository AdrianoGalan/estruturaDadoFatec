package model;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;



public class ModelTable extends AbstractTableModel {

	private List<ModelObj> linhas;

	private String[] colunas = new String[] { "Id", "Dado" };

	// Constantes representando o �ndice das colunas
	private static final int ID = 0;
	private static final int DADO = 1;

	// Cria um SocioTableModel sem nenhuma linha
	public ModelTable() {
		linhas = new ArrayList();
	}

	// Cria um Tabela contendo a lista recebida por par�metro
	public ModelTable(List<ModelObj> listaDados) {
		linhas = new ArrayList<ModelObj>(listaDados);
	}

	@Override
	public int getRowCount() {
		return linhas.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	};

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case ID:
			return String.class;
		case DADO:
			return String.class;
		default:
			// N�o deve ocorrer, pois s� existem 2 colunas
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	

	// Adiciona uma lista
	public void addLista(List<ModelObj> dados) {
		// Pega o tamanho antigo da tabela, que servir�
		// como �ndice para o primeiro dos novos registros
		int indice = getRowCount();

		// Adiciona os registros.
		linhas.addAll(dados);

		// Notifica a mudan�a.
		fireTableRowsInserted(indice, indice + dados.size());
	}

	// Remove todos os registros.
	public void limpar() {
		// Remove todos os elementos da lista de s�cios.
		linhas.clear();

		// Notifica a mudan�a.
		fireTableDataChanged();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// Pega o dado referente a linha especificada.
		ModelObj obj = linhas.get(rowIndex);

		switch (columnIndex) {
		case ID:
			return obj.getId();
		case DADO:
			return obj.getEletento();
		default:
			// N�o deve ocorrer, pois s� existem 2 colunas
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}

}
