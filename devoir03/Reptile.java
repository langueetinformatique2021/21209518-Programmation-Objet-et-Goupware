package devoir03;

/**
 * 
 * @author yangduo
 *
 */

public class Reptile extends Animal {

	protected boolean domestique = false;

	
	public Reptile(String type) { 
		super(type, 4);
	}

	
	public void présente() {
		
		super.présente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("Je suis vraiment un animal " + etat+".");
	}


	public void mange() {
		System.out.println("Je me nourrit de viande.");
	}
}
