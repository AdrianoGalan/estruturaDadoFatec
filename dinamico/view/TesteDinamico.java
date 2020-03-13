package view;

import model.FilaDinamica;
import model.ListaDinamica;
import model.PilhaDinamica;

public class TesteDinamico {
	
	public static void main(String[] args) {
		
		ListaDinamica<String> lista = new ListaDinamica<String>();
		
		FilaDinamica<String> pilha = new FilaDinamica<String>();
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		lista.remover();
		lista.mostrar();
		
		pilha.add("A");
		pilha.add("b");
		pilha.add("c");
		pilha.add("d");
		pilha.add("e");
		pilha.mostrar();
		pilha.remover();
		pilha.mostrar();
		pilha.remover();
		pilha.mostrar();
		pilha.remover();
		pilha.mostrar();
		pilha.remover();
		pilha.mostrar();
		pilha.remover();
		pilha.mostrar();
		pilha.remover();
		pilha.mostrar();
		pilha.remover();
		pilha.mostrar();
		
		
	}

}
