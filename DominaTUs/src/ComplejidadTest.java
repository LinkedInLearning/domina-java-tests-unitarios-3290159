import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplejidadTest {

	@Test
	void testCamino1() {
		assertEquals(2, Complejidad.cuentas(2));
	}

	@Test
	void testCamino2() {
		assertEquals(9, Complejidad.cuentas(3));
	}

	@Test
	void testCamino3() {
		assertEquals(25, Complejidad.cuentas(5));
	}

	@Test
	void testCamino4() {
		assertEquals(-7, Complejidad.cuentas(7));
	}
}
