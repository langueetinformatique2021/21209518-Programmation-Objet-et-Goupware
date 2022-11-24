package tp04;
/**
 * afficher l’indice du premier prénom dans l’ordre lexicographique
 * @author yangduo
 *
 */
public class Iteration2 {
	
	public static void main(String[] args) {

		String[] prenoms = {"Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djamé"};
		
		int imin=0;

		for (int i = 1; i < prenoms.length; i++) {
			if (prenoms[0].compareTo(prenoms[i]) > prenoms[0].compareTo(prenoms[i-1])) {
				imin = i;
			}
		}
		//System.out.println(prenoms[imin]);
		System.out.println("afficher l’indice du premier prénom dans l’ordre lexicographique :\n"+imin);
	}
}