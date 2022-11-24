package tp07;

import java.util.Date;
import java.util.GregorianCalendar;

public class Exe2_3 {
	public static void main(String[]args) {
		GregorianCalendar calendar = new GregorianCalendar();
		Date date = new Date();
		
		calendar.setTime(date);
		
		//month默认是从0开始的
		System.out.println("TIME: " + calendar.getTime());
		System.out.println("YEAR: " + calendar.get(calendar.YEAR));
		System.out.println("MONTH: " + (calendar.get(calendar.MONTH)+1));
		System.out.println("DATE: " + calendar.get(calendar.DATE));

		System.out.println("DAY_OF_YEAR: " + calendar.get(calendar.DAY_OF_YEAR));
		System.out.println("HOUR_OF_DAY: " + calendar.get(calendar.HOUR_OF_DAY));
			
	}

}
