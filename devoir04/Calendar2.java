package devoir04;
/**
 * @author yangduo
 */
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendar2 extends GregorianCalendar {
	
	private boolean cours;
	
	public Calendar2() {
		Date date = new Date();
		this.setTime(date);	
	}
	
	/** affiche la date et l’heure de la création de l’objet */
	public void creation() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		if(this.get(calendar.DAY_OF_WEEK) == 4) {
			if (this.get(calendar.HOUR_OF_DAY)>9 && this.get(calendar.HOUR_OF_DAY)<=12) {
				cours = true;
			}else if(this.get(calendar.HOUR_OF_DAY)==9 && this.get(calendar.MINUTE)>=30){
				cours = true;
			}else {
				cours = false;
			}
		}else {
			cours = false;
		}
		System.out.println("Start Time: " + this.getTime());
		System.out.println("L’objet est créé pendant le cours (jeudi 9h30-12h): " + cours);
	}
	
	/** affiche la date et l’heure courante */
	public void afficher() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		System.out.println("CURRENT_TIME: " + calendar.getTime());
	}
	
	/** affiche le nombre de secondes depuis la création de l’objet */
	public void duree() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		long nbSeconde = (calendar.getTimeInMillis()-this.getTimeInMillis())/1000;
		System.out.println("NUMBER_OF_SECONDE: " + nbSeconde);
	}
	
	

}