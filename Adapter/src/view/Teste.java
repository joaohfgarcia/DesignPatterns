  
package view;

import model.Adapter;
import model.Cliente;
import model.SomadorEsperado;

public class Teste {

	public static void main(String[] args) {
		
		SomadorEsperado somador = new Adapter();
		
		Cliente cliente = new Cliente(somador);
		
		cliente.executar();
		
	}

}