package tp09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copie {

	public static void main(String[] args) {

		try {
			File fin = new File("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt");
			FileInputStream fsource = new FileInputStream(fin);	
			byte[] tmp = new byte[(int)fin.length()];
			fsource.read(tmp);
			fsource.close();
			
			FileOutputStream fcible = new FileOutputStream(
					new File("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/NomCopie.txt"));
			fcible.write(tmp);
			fcible.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
