package devoir06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFisTp7 {
	public static void main(String[] args) throws IOException {
		try {
			
			FileInputStreamTP7 fis = new FileInputStreamTP7("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/devoir06/Nom.txt");
			File copie = new File("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/devoir06/NomCopie.txt");
			fis.copie(copie);
			fis.compresse(copie);
			fis.proprietes();
			FileInputStreamTP7 fis2 = new FileInputStreamTP7("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/devoir06/NomCopie.txt");

			System.out.println(fis.compareTo(fis2));
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
