package devoir04;
/**
 * 
 * @author yangduo
 *
 */
public class TestCercle {

	public static void main(String[] args) {
		
		Cercle c1 = new Cercle("noir", 1);
		Cercle c2 = new Cercle("bleu", 2);
		
		System.out.println("Le premier cercle : ");
		c1.afficher();
		
		System.out.println("Le deuxième cercle : ");
		c2.afficher();
		
		c1.comparer(c2);
	}
}
