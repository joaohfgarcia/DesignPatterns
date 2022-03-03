package model;

public class Saudacao {
	
	private String genero;

	public Saudacao(String genero) {
		this.genero = genero;
	}
	
	public Saudacao() {}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String mensagem() {
		return "Bem vindo(a) ";
		
	}
	
	
	

}
