package devoir02;

/**
 * 
 * @author yangduo
 *
 */

public class Etudiant {
	
	//Les attributs et leurs types
	private String nom;
	private String prenom;
	private String sexe;
	private int age;
	private int numero;
	
	//Le nom d'étudiant
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Le prénom d'étudiant
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	//Le sexe d'étudiant
	public String getSexe() {
		return this.sexe;	
	}
	public void setSexe(String sexe) {
		if (sexe.equals("M") || sexe.equals("F")) {
			this.sexe = sexe;
		}else {
			System.out.println("Il y a une faute!");
		}
	}
		
	//L'âge d'étudiant
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age>120 || age<0) {
			System.out.println("Il y a une erreur!");
		}else {
			this.age = age;
		}
	}
	
	//Le numéro d'étudiant
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
