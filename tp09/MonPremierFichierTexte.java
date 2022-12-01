package tp09;

/**
 * écrit dans le fichier texte « Nom.txt » les noms des membres du groupe
 * @author yangduo
 */
import java.io.FileWriter;
import java.io.IOException;

public class MonPremierFichierTexte {

	public static void fileWriterMethod(String filepath, String content) throws IOException {
		try (FileWriter fileWriter = new FileWriter(filepath)) {
			fileWriter.append(content);
		}
	}

	public static void main(String[] args) throws IOException {
		fileWriterMethod("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt", "test\nTEST");
	}
}
