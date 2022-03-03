package model;

public class FabricaNome extends AbstractFabricaNome{

	String entrada;
	
	public FabricaNome() {}
	
	public FabricaNome(String entrada) {
		this.entrada = entrada;
		
	}
	
	public Nome getNome (String entrada) {
		
		boolean virgula = entrada.contains(",");
			
		if (virgula == true) {
			return new NomeInvertido(entrada); 
		}else {
			return new Nome(entrada);
		}
				
	}
	
}
