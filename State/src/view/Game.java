package view;

import model.Mario;

public class Game {

	public static void main(String[] args) {
		
	    Mario mario = new Mario();
	    
	    System.out.println("#######   START   ########\n");
	    System.out.println("Mario pequeno");
	    
	    System.out.println("\n< Mario pegou um cogumelo >"); 
	    mario.pegaCogumelo();
	    
	    System.out.println("\n< Mario pegou um cogumelo >"); 
	    mario.pegaCogumelo();
	    
	    System.out.println("\n< Mario pegou uma flor >"); 
	    mario.pegaFlor();
	    
	    System.out.println("\n< Mario levou dano >"); 
	    mario.levaDano();
	    
	    System.out.println("\n< Mario levou dano >"); 
	    mario.levaDano();
	    
	    System.out.println("\n< Mario levou dano >"); 
	    mario.levaDano();
	    
	    
	}
	

}

