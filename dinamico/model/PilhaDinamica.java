package model;

public class PilhaDinamica<T> extends EstruturaDinamica<T> {

	@Override
	public void remover() {

		if (estaVazia()) {
			System.out.println("n�o tem elementos");
		} else if (super.inicio.getProximo() == null) {
			super.inicio = null;
			super.tamanho--;

		} else {

			Node<T> aux = super.inicio;
			Node<T> anterior = inicio;

			while (aux.getProximo() != null) {

				anterior = aux;

				aux = aux.getProximo();

			}

			anterior.setProximo(null);
			super.tamanho--;
		}
	}
}
