package tp09;

import java.io.*;
import java.util.zip.*;

public class Decompresse {
  public static void main(String[] args) {
    try {
      
      FileInputStream fis = new FileInputStream("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt.zip");
      ZipInputStream zis = new ZipInputStream(fis);
      
      
      ZipEntry entry;
      while ((entry = zis.getNextEntry()) != null) {
        System.out.println("Extracting: " + entry.getName());
        
        
        FileOutputStream fos = new FileOutputStream(entry.getName());
        byte[] buffer = new byte[4096];
        int len;
        while ((len = zis.read(buffer)) > 0) {
          fos.write(buffer, 0, len);
        }
        
        
        fos.close();
        zis.closeEntry();
      }
      
      zis.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

