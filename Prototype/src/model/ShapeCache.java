package model;

import java.util.HashMap;

import javax.swing.JOptionPane;


public class ShapeCache {
	
	private HashMap<String, String> shapeMap = new HashMap<String, String>();
	
	public ShapeCache() {
		
		this.shapeMap.put("C", "New Circle");
		this.shapeMap.put("S", "New Square");
		this.shapeMap.put("R", "New Rectangle");		
		
	}
	
	public void loadCache(String type) {
				
		ShCircle circle = new ShCircle();
		circle.setType("Circle Model");
				
		ShRectangle rectangle = new ShRectangle();
		rectangle.setType("Rectangle Model");
				
		ShSquare square = new ShSquare();
		square.setType("Square Model");
				
		
		if (type.equals("C")) {			
			Shape newCircle = circle.clonar();
			newCircle.setType(shapeMap.get(type));
			JOptionPane.showMessageDialog(null, circle.exibirInfo()+"\n"+newCircle.exibirInfo()+"\n");
			
			
		}else if (type.equals("R")) {
			Shape newRectangle = rectangle.clonar();
			newRectangle.setType(shapeMap.get(type));
			JOptionPane.showMessageDialog(null, rectangle.exibirInfo()+"\n"+newRectangle.exibirInfo()+"\n");
			
		}else if (type.equals("S")) {
			Shape newSquare = square.clonar();
			newSquare.setType(shapeMap.get(type));
			JOptionPane.showMessageDialog(null, square.exibirInfo()+"\n"+newSquare.exibirInfo()+"\n");
			
		}else {
			JOptionPane.showMessageDialog(null, "Object not found!");
			
		}
		
		
			
	}

}
