package view;

import controller.Ordena;

public class Principal {

	public static void main(String[] args) {
		Ordena ord = new Ordena();
		
		int[] vetor = {31, 32, 33, 34, 99, 98, 97, 96};
		
		ord.ordenacao(vetor);

	}

}
