import model.Acar;
import model.AcarEngine;

public class Acarmain {
	public static void main(String[] args) {
		Acar toyota = new Acar(new AcarEngine());
		toyota.move();

	}

}
