package tp08;
/**
 * Capturer l'exception par l’instruction "try/catch"
 * en utilisant le modifieur "throws"
 * @author yangduo
 *
 */
public class Division3 {

	public static void main(String[] args) {

		try {
			division();

		} catch (ArithmeticException e) {
			System.out.println("c'est une faute!"+e.getMessage());
		}
	}

	public static void division() throws ArithmeticException {
		int i = 1000, j;
		do {
			i--;
			j = 1 / i;
		} while (true);
	}
}
