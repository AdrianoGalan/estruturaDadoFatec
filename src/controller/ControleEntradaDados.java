package controller;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

import model.Fila;
import model.Lista;
import model.Pilha;

public class ControleEntradaDados {

	private Lista lista;
	private Pilha pilha;
	private Fila fila;
	private int pos;
	private boolean comPos;
	private String elemento;
	private JTextField textFieldEntrada;
	private JTextField textFieldPos;

	public ControleEntradaDados(JTextField textFieldEntrada, JTextField textFieldPos, Lista lista, Pilha pilha,
			Fila fila) {
		super();
		
		this.textFieldEntrada = textFieldEntrada;
		this.textFieldPos = textFieldPos;

		this.elemento = textFieldEntrada.getText();

		try {

			if (!textFieldPos.getText().isEmpty()) {

				comPos = true;
				this.pos = Integer.parseInt(textFieldPos.getText());
			} else {
				comPos = false;
				pos = 0;
			}
		} catch (Exception e) {
			elemento = "";
			JOptionPane.showMessageDialog(null, "Digite um inteiro na posição");
		}

		this.lista = lista;
		this.pilha = pilha;
		this.fila = fila;
	}

	private boolean validaDado() {

		if (elemento.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Digite um dado de entrada");
			return false;

		}

		return true;
	}

	private boolean validaPos() {

		if (pos < -1 || pos > lista.tamanho()) {
			JOptionPane.showMessageDialog(null, "Posoção invalida");
			return false;
		}

		return true;
	}

	public Lista addLista() {

		if (validaDado()) {

			if (comPos) {
				if (validaPos()) {
					lista.adiciona(pos, elemento);
					return lista;
				}
			} else {
				lista.adiciona(elemento);
				return lista;
			}

		}
		return lista;
	}

	public Pilha addPilha() {

		if (validaDado()) {
			pilha.empilha(elemento);
			return pilha;
		}

		return pilha;
	}

	public Fila addFila() {

		if (validaDado()) {
			fila.enfileira(elemento);
			return fila;
		}

		return fila;
	}
	
	public Fila removeFila() {
		
		if(!fila.estaVazia()) {
			fila.desenfileira();
			return fila;
		}else {
			JOptionPane.showMessageDialog(null, "A fila esta vazia");
		}
		
		return fila;
	}

	public Pilha removePilha() {

		if (!pilha.estaVazia()) {
			pilha.desempilha();
			return pilha;
		} else {
			JOptionPane.showMessageDialog(null, "A pilha esta vazia");
		}

		return pilha;
	}

	public Lista removeLista() {

		if (comPos) {
			if (validaPos()) {
				if (pos != lista.tamanho()) {
					lista.remove(pos);
					return lista;
				} else {
					JOptionPane.showMessageDialog(null, "Posoção invalida");
				}

			}
		}

		return lista;
	}
	
	// limpa campos de entradas
		public void limpaCampos() {

			textFieldEntrada.setText("");
			textFieldPos.setText("");
		}
}
