package tp09;
/**
 * @author yangduo
 */
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class MonPremierFichierTexte2 {
	
	public static void fileWriterMethod(String filepath, String content) throws IOException {
		try (FileWriter fileWriter = new FileWriter(filepath)) {
			fileWriter.append(content);
		}
	}

	public static void main(String[] args) throws IOException {
		fileWriterMethod("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt", "test\nTEST");
		System.out.println(Verifier());
	}

	public static boolean Verifier() {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(new File("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt")));
			if (br.readLine().equals("test") == false)
				return false;
			if (br.readLine().equals("TEST") == false)
				return false;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
		
	}

}
