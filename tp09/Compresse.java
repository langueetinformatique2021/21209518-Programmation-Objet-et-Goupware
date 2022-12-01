package tp09;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

public class Compresse {
	
	public static void ZipCompress(String inputFile, String outputFile) throws Exception {
        
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outputFile));
        BufferedOutputStream bos = new BufferedOutputStream(out);
        File input = new File(inputFile);
        
        compress(out, bos, input,null);
        
        bos.close();
        out.close();
    }


	private static void compress(ZipOutputStream out, BufferedOutputStream bos, File input, Object object) {
		
		
	}

	public static void main(String[] args) {
        try {
            ZipCompress("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt", "/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt.zip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}