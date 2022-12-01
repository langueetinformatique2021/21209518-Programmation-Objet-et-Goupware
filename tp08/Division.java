package tp08;
/**
 * Capturer l'exception par l’instruction "try/catch"
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
			System.out.println("c'est une faute!"+e.getMessage());
		}
	}
}