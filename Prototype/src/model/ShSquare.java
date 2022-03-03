package model;

public class ShSquare extends Shape{

	public ShSquare(ShSquare square) {
		this.type = square.getType();

	}
	
	public ShSquare() {
		type = null;		
	}


	public String exibirInfo() {
		return "Object: "+getType();
	}


	public Shape clonar() {
		return new ShSquare(this);
	}

}
