
public class Fail {
	public static double raiz(double num) throws IllegalArgumentException {
		if (num < 0) {
			throw new IllegalArgumentException("Num debe ser positivo");
		}
		return Math.sqrt(num);
	}
}
