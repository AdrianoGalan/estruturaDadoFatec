package model;

public abstract class EstruturaDinamica<T> {

	protected No<T> inicio;
	protected int tamanho = 0;

	public EstruturaDinamica() {
		this.inicio = null;
	}

	public void add(T elemento) {

		No<T> novo = new No<T>();

		novo.setElemento(elemento);
		novo.setProximo(null);

		if (inicio == null) {
			inicio = novo;
		} else {
			No<T> aux;
			aux = inicio;

			while (aux.getProximo() != null) {
				aux = aux.getProximo();

			}
			aux.setProximo(novo);
		}
		tamanho++;

	}
	
	public void limpar() {
		this.inicio = null;
		this.tamanho = 0;
	}

	public void mostrar() {
		if (inicio == null) {
			System.out.println("não tem elemento");
		} else {

			StringBuffer sb = new StringBuffer();
			sb.append("[");

			No<T> aux;
			aux = inicio;

			while (aux != null) {

				sb.append(String.valueOf(aux.getElemento()));
				if (aux.getProximo() != null) {
					sb.append(", ");
				}
				aux = aux.getProximo();
			}

			sb.append("]");
			System.out.println(sb.toString());
		}
	}

	public abstract void remover();

	public int tamanho() {
		return this.tamanho;
	}

	public boolean estaVazia() {

		return this.tamanho == 0;
	}

}
