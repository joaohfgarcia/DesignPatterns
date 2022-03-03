package model;

public class MarioFogo implements MarioState{

	@Override
	public MarioState pegaCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegaFlor() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}


	@Override
	public MarioState levaDano() {
		System.out.println("Mario grande");
		return new MarioGrande();
	}
    
}
