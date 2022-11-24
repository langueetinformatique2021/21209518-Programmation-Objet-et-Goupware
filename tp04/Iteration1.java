package tp04;
/**
 * afficher les prénoms dans l’ordre lexicographique
 * @author yangduo
 */
import java.util.Arrays;

public class Iteration1 {
	public static void main(String[] args) {

		String[] prenoms = {"Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djamé"};
		
		Arrays.sort(prenoms,(str1,str2)->str1.charAt(0)-str2.charAt(0));
		Arrays.asList(prenoms).forEach(System.out::println);


	}
	

}
