package tp08;
/**
 * 
 * @author yangduo
 *
 */
public class Division {
	public static void main(String[] args) {
		try {
			int i = 1000, j;
			do {
				i--;
				j = 1 / i;
			} while (true);

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}