
public class Complejidad {
	public static int cuentas(int num) {
		int res = 0;
		if (num % 2 == 0) {
			res = num;
		} else if (num % 3 == 0 || num % 5 == 0) { 
			res = num * num;
		} else { 
			res = -num;
		}
		return res;
	}
}

