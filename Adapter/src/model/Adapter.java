package model;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends SomadorExistente implements SomadorEsperado{
	
	public Adapter() {};
	
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i : vetor) {
			lista.add(i);
			
		}
		
		return somaLista(lista);
	}

}