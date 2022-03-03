package model;

public class ShRectangle extends Shape{

	public ShRectangle(ShRectangle retangle) {
		this.type = retangle.getType();

	}
	
	public ShRectangle() {
		type = null;		
	}


	public String exibirInfo() {
		return "Object: "+getType();
	}


	public Shape clonar() {
		return new ShRectangle(this);
	}

}
