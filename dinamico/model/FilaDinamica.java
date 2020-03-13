package model;

public class FilaDinamica<T> extends EstruturaDinamica<T> {

	@Override
	public void remover() {
		if (estaVazia()) {
			System.out.println("não tem elementos");
		} else {
			if (super.inicio.getProximo() == null) {
				super.inicio = null;
			} else {
				super.inicio = super.inicio.getProximo();

			}
			tamanho--;
		}
	}

}
