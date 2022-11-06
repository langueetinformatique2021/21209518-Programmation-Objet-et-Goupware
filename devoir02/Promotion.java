package devoir02;

/**
 * 
 * @author yangduo
 *
 */

public class Promotion {
	
	private int noteS1;
	private int noteS2;
	private int moyenne;
	
	
	public int getNoteS1() {
		return noteS1;
	}
	public void setNoteS1(int noteS1) {
		this.noteS1 = noteS1;
	}
	
	
	public int getNoteS2() {
		return noteS2;
	}
	public void setNoteS2(int noteS2) {
		this.noteS2 = noteS2;
	}
	
	
	public int getMoyenne() {
		
		if(moyenne>=10) {
			System.out.println("Etat de promotion: réussite");
		}else {
			System.out.println("Etat de promotion: échec");
		}
		return moyenne;
	}
	public void setMoyenne(int moyenne) {
		this.moyenne = (noteS1+noteS2)/2;
	}
	
}
