package devoir03;

/**
 * 
 * @author yangduo
 *
 */

public abstract class Animal {
	//les deux attributs
	private String espèce;
	private int numPattes;
	
	public Animal(String type,int pattes) {
		espèce = type;
		numPattes = pattes;
	}
	
	//les deux méthodes
	public void présente() {
		System.out.println("Je suis un représentant de l'espèce des " + espèce + " et j'ai " + numPattes + " pattes.");
	}

	public abstract void mange();
}
	
