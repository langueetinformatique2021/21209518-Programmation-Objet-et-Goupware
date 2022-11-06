package devoir02;

public class Test {
	
	public static void main(String[] args) {
		
		Etudiant etu01 = new Etudiant();
		
		etu01.setNom("WATSON");
		etu01.setPrenom("Emma");
		etu01.setSexe("F");
		etu01.setAge(32);
		etu01.setNumero(12345678);
		
		System.out.println("Nom: "+etu01.getNom());
		System.out.println("Prenom: "+etu01.getPrenom());
		System.out.println("Sexe: "+etu01.getSexe());
		System.out.println("Age: "+etu01.getAge());
		System.out.println("Numéro d'étudiant: "+etu01.getNumero());
		
		
		Promotion p = new Promotion();
		
		p.setNoteS1(16);
		p.setNoteS2(18);
		p.setMoyenne(0);
		
		System.out.println("NoteS1: "+p.getNoteS1());
		System.out.println("NoteS2: "+p.getNoteS2());
		System.out.println("Moyenne: "+p.getMoyenne());
	}

}
