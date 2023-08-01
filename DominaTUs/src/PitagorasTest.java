import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PitagorasTest {
	@Test
	void test1() {
		SuperCalculadora sc = new SuperCalculadora();
		Pitagoras p = new Pitagoras(sc);
		double res = p.hipotenusa(3, 4);
		assertEquals(5, res);
	}
}
