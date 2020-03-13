package model;

public class ListaDinamica<T> extends EstruturaDinamica<T> {
	
	
	
	
	public void add(T elemento, int posicao) {

		if (posicao < 0 || posicao > super.tamanho) {

			System.out.println("Posição invalida");

		} else {

			No<T> novo = new No<T>();

			novo.setElemento(elemento);
			novo.setProximo(null);

			if (super.inicio == null) {
				super.inicio = novo;
			} else if (posicao == 0) {
				
				novo.setProximo(super.inicio);
				super.inicio = novo;

			} else {

				No<T> aux;
				aux = super.inicio;

				for (int i = 0; i < posicao -1 ; i++) {

					aux = aux.getProximo();

				}
				novo.setProximo(aux.getProximo());
				aux.setProximo(novo);
			}
			super.tamanho++;
		}
	}

	
	public void remover(int posicao) {

		No<T> aux = super.inicio;

		if (posicao == 0) {

			inicio = inicio.getProximo();
			super.tamanho--;

		} else {

			if (posicao < 0 || posicao > super.tamanho - 1) {

				System.out.println("Posição invalida");
			} else {
				for (int i = 0; i < posicao - 1; i++) {

					aux = aux.getProximo();

				}
				aux.setProximo(aux.getProximo().getProximo());
				super.tamanho--;
			}
		}
	}


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
