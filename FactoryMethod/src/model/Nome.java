package model;

public class Nome{
	
	private String entrada;

	public Nome(String e) {
		this.entrada=e;		
	}
	
	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	
	public String nome() {
		
		int tamanho = 0;
		String [] nomeDesagrupado = this.entrada.split(" ");
		tamanho = nomeDesagrupado.length;
		String preNome = nomeDesagrupado[0];
		String sobreNome = nomeDesagrupado[tamanho-1];	
		return (preNome+" "+sobreNome);
		
	}
				
}
