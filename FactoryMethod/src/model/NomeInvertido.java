package model;

public class NomeInvertido extends Nome{
	
	public NomeInvertido(String entrada) {
		super(entrada);
	}


	public String nome() {
							
		String nomeEntrada = getEntrada().replaceAll(",", "");
		String [] nomeDesagrupado = nomeEntrada.split(" ");
		String preNome = nomeDesagrupado[1];
		String sobreNome = nomeDesagrupado[0];
		return (preNome+" "+sobreNome); 	
				
	}
	
	
		
	
}
