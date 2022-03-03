package model;

public class MarioPequeno implements MarioState {

	@Override
	public MarioState pegaCogumelo() {
		System.out.println("Mario grande");
		return new MarioGrande();
	}

	@Override
	public MarioState pegaFlor() {
		System.out.println("Mario grande com fogo");
		return new MarioFogo();
	}


	@Override
	public MarioState levaDano() {
		System.out.println("Mario morto");
		System.out.println("\nGame Over!");
		return new MarioMorto();
	}

}