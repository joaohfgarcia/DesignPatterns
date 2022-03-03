package model;

public class FactorySaudacao extends AbstractFactorySaudacao{

	public FactorySaudacao() {}
	
	public Saudacao getSaudacao(String genero) {
		if (genero.equals("M"))
			return new Masculino(null);
					
		else if (genero.equals("F"))
			return new Feminino(null);
		
		else 
			return new NaoInformado(null);
		
	}

}
