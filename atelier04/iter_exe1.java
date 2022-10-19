package atelier04;

import java.util.Arrays;

public class iter_exe1 {
	public static void main(String[] args) {

		String[] prenoms = {"Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djamé"};
		System.out.println();
		Arrays.sort(prenoms,(str1,str2)->str1.charAt(0)-str2.charAt(0));
		Arrays.asList(prenoms).forEach(System.out::println);


	}
	

}
