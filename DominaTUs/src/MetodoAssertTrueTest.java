import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

class MetodoAssertTrueTest {
	@Test
	void test1() {
		assertTrue(true);
	}

	@Test
	void test2() {
		assertTrue(3 > 0);
		assertTrue("hola".contains("h"));
	}

	@Test
	void test3() {
		assertTrue("ola".contains("h"));
	}

	@Test
	void test4() {
		int x = 3;
		assertTrue(esPositivo(x));

		BooleanSupplier esPar = () -> x % 2 == 0;
		assertFalse(esPar);
	}
	
	boolean esPositivo(int x) {
		return x >= 0;
	}
}
