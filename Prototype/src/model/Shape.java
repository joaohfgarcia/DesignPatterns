package model;

public abstract class Shape {
	
	protected String id;
	protected String type;
	

	public Shape() {}
	
	public abstract String exibirInfo();
	
	public abstract Shape clonar();

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
