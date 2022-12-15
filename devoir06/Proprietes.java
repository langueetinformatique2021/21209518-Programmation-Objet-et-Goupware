package devoir06;

import java.io.File;

public class Proprietes {
	public static void main(String[] args) {
		File file= new File("/Users/yangduo/git/21209518-Programmation-Objet-et-Goupware/tp09/Nom.txt");
		System.out.println("Le nom du fichier :"+file.getName());
		System.out.println("Le chemin du fichier :"+file.getPath());
		System.out.println("Le chemin absolu du fichier :"+file.getAbsolutePath());
		System.out.println("Le chemin parental du fichier :"+file.getParent());
		System.out.println("Le fichier existe :"+file.exists());
		System.out.println("Le fichier est un directory :"+file.isDirectory());
		System.out.println("Le fichier est un file :"+file.isFile());
		System.out.println("Le temps modifié du fichier :"+file.lastModified());
		System.out.println("La taille du fichier :"+file.length());
	}

}
