package model;

public class ShCircle extends Shape{

	public ShCircle(ShCircle circle) {
		this.type = circle.getType();

	}
	
	public ShCircle() {
		type = null;		
	}


	public String exibirInfo() {
		return "Object: "+getType();
	}


	public Shape clonar() {
		return new ShCircle(this);
	}

}
