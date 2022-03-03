package view;

import javax.swing.JOptionPane;

import model.ShapeCache;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		
		String type = JOptionPane.showInputDialog("Inform the object to be cloned:"+"\n"+
				"- Input C to Circle\n"+
				"- Input R to Rectangle\n"+
				"- Input S to Square\n").toUpperCase();
			
		ShapeCache cache = new ShapeCache();
		cache.loadCache(type);
		
	}
	
}
