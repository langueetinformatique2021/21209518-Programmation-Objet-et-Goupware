package devoir06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileInputStreamTP7 extends FileInputStream {
	
	private final File file;

	public FileInputStreamTP7(String filename) throws FileNotFoundException {
        super(filename);
        this.file = new File(filename);
    }
	
	/**
	 * méthode copie
	 * @param f
	 * @throws IOException
	 */
	public void copie(File f) throws IOException {
		
		try {
			
			FileInputStream fsource = new FileInputStream(file);	
			byte[] tmp = new byte[(int)file.length()];
			fsource.read(tmp);
			fsource.close();
			
			FileOutputStream fcible = new FileOutputStream(f);
			fcible.write(tmp);
			fcible.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * méthode compresse
	 * @param filePath
	 * @throws IOException
	 */
	public void compresse(File f) throws IOException{
	
		try {
		      FileInputStream fis = new FileInputStream(file);
		      FileOutputStream fos = new FileOutputStream(new File(f+".zip"));
		      ZipOutputStream zipOut = new ZipOutputStream(fos);
		      ZipEntry zipEntry = new ZipEntry(file.getPath());
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
	/**
	 * afficher toutes les propriétés du fichier
	 */
	public void proprietes() {
		System.out.println("Le nom du fichier :"+this.file.getName());
		System.out.println("Le chemin du fichier :"+this.file.getPath());
		System.out.println("Le chemin absolu du fichier :"+this.file.getAbsolutePath());
		System.out.println("Le chemin parental du fichier :"+this.file.getParent());
		System.out.println("Le fichier existe :"+this.file.exists());
		System.out.println("Le fichier est un directory :"+this.file.isDirectory());
		System.out.println("Le fichier est un file :"+this.file.isFile());
		System.out.println("Le temps modifié du fichier :"+this.file.lastModified());
		System.out.println("La taille du fichier :"+this.file.length());
	}
	/**
	 * méthode compareTo
	 * @param doc
	 * @return
	 * @throws IOException
	 */
	public boolean compareTo(FileInputStreamTP7 contenu)throws IOException {
    	int txt1,txt2;
    	try {
            while ((txt1 = this.read()) != -1 && (txt2 = contenu.read()) != -1) {
    		   
    		   if (txt1!=txt2) {
    			   return false;
    		   }
        }
    	   return true;
        } catch (IOException e) {
        
        e.printStackTrace();
      }
 	   return true;

   }

}
