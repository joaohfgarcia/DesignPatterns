package model;

public class MarioGrande implements MarioState{
	
	@Override
	public MarioState pegaCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegaFlor() {
		System.out.println("Mario grande com fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState levaDano() {
		System.out.println("Mario pequeno");
		return new MarioPequeno();
	}


}
