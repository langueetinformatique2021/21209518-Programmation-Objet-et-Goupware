package tp07;

import util.Keyboard;

public class TestExe4 {

	public static void main(String[] args) {
		
		Exe4 c = new Exe4();
		c.creation();
		Keyboard.getInt("attente");
		c.creation();
		c.afficher();
		c.duree();

	}

}