package tp09;

import java.io.*;
import java.util.zip.*;

public class Compresse{
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt");
      FileOutputStream fos = new FileOutputStream("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt.zip");
      ZipOutputStream zipOut = new ZipOutputStream(fos);
      ZipEntry zipEntry = new ZipEntry("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt");
      zipOut.putNextEntry(zipEntry);

      byte[] bytes = new byte[1024];
      int length;

      while ((length = fis.read(bytes)) >= 0) {
        zipOut.write(bytes, 0, length);
      }

      zipOut.close();
      fis.close();
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
