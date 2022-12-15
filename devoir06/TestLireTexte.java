package devoir06;
/**
 * @author yangduo
 */
import java.io.IOException;

public class TestLireTexte {
	
	public static void main(String[] args) throws FichierVide, IOException {

		LireTexte lt = new LireTexte("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/devoir06/Test.txt");
		LireTexte lt2 = new LireTexte("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/devoir06/TestVide.txt");
		
		lt.Ouvrir();
		lt.Fermer();
		lt.readWord();
		
		lt2.Ouvrir();
		lt2.Fermer();
		lt2.readWord();

	}

}
