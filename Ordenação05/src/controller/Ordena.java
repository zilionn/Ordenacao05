package controller;

import fernando.fatec.br.quick.QuickSort;

public class Ordena {

	public Ordena() {
		super();
	}

	public void ordenacao (int[] vet) {
		QuickSort quick = new QuickSort();
		quick.ordenar(vet, 0, vet.length - 1);
		
		for(int valor : vet) {
			System.out.print(valor + " ");
		}
	}
}
