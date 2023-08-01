import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetodoAssertEqualsDecimalesTest {

	@Test
	void test() {
		assertEquals(3.3333, 10.0/3);
	}

	@Test
	void test2() {
		assertEquals(3.333333333333333335, 10.0/3);
	}


	@Test
	void test3() {
		assertEquals(3.33, 10.0/3, 0.01);
		assertEquals(3.33, 3.321, 0.01);
		assertEquals(3.33, 3.330, 0.01);
		assertEquals(3.33, 3.339, 0.01);
	}
	
	@Test
	void test4() {
		assertEquals(3.3333, 10.0/3, "los decimales no cuadran");
	}

	@Test
	void test5() {
		assertEquals(3.33, 3.333, 0.001, "los decimales no cuadran");
	}

}
