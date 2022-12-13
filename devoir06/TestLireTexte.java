package devoir06;
/**
 * @author yangduo
 */
import java.io.IOException;

public class TestLireTexte {
	
	public static void main(String[] args) throws FichierVide, IOException {

		LireTexte lt = new LireTexte("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt");
		
		lt.Ouvrir();
		lt.readWord();
		lt.Fermer();
		//System.out.println();

	}

}
