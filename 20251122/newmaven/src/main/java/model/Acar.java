package model;

public class Acar {
	
private Engine engine;
	
	public Acar(Engine engine) {
		this.engine = engine;
	}

	public void move() {
		// ToyotaEngine engine = new ToyotaEngine();
		engine.start();
		System.out.println("Toyota move!!");
	}
}