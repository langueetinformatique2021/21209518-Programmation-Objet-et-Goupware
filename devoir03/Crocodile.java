package devoir03;

/**
 * 
 * @author yangduo
 *
 */

public class Crocodile extends Reptile implements Domesticable {
	
	private String nom;
	
	public Crocodile() { 
		super("reptiles");
	}

	
	public void domestiquer(String nom) {
		domestique = false;
		this.nom = nom;

	}

	
	public String nom() {
		return this.nom;
	}
	
	public void mange() {
		if (domestique == false) super.mange();
		else 
			System.out.println("Je me nourrit de végétal."  + this.nom());
	}

}
